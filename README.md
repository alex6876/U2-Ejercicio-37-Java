Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Redes Blockchain (Interfaces y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos reales ni redes descentralizadas):

---

# ⛓️ Simulación de Redes Blockchain y Transferencias (Interfaces y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema descentralizado e interoperable capaz de interactuar con diferentes protocolos de cadenas de bloques (Bitcoin, Ethereum y Solana). Pone en práctica conceptos avanzados de la **Programación Orientada a Objetos (POO)** como **interfaces**, **polimorfismo en tiempo de ejecución**, **enlace dinámico (*dynamic dispatch*)** y validación de formatos específicos de carteras (*wallets*) en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de un contrato contractual estricto y múltiples implementaciones especializadas para cada red criptográfica:

* **`RedBlockchain` (Interfaz)**: Define el contrato genérico que cualquier red de bloques debe cumplir mediante los métodos:
* `verificarSaldo(String direccionWallet)`: Valida la estructura y formato de la dirección de la billetera según los estándares del protocolo.
* `ejecutarTransaccion(String origen, String destino, double monto)`: Gestiona y simula el flujo de transferencia de activos.


* **`RedBitcoin`**: Modela la red Bitcoin. Valida que las direcciones comiencen con prefijos válidos (`1`, `3` o `bc1`) y simula tarifas de red y confirmaciones nativas.
* **`RedEthereum`**: Modela la red Ethereum orientada a contratos inteligentes. Valida que las direcciones comiencen con el prefijo hexadecimal estándar (`0x`) y simula el cálculo de gas (*gas fees*).
* **`RedSolana`**: Modela la red de alto rendimiento Solana. Valida que la longitud de la cadena de la billetera se encuentre dentro del rango requerido (entre 32 y 44 caracteres).
* **`Main`**: Punto de entrada de la aplicación. Utiliza una variable polimórfica de tipo `RedBlockchain` para instanciar secuencialmente las distintas redes, verificar saldos con credenciales simuladas y procesar transacciones de forma unificada.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Validación Sintáctica de Wallets:** Cada red implementa su propia lógica de validación de cadenas de texto antes de permitir operaciones (ej. prefijos en Bitcoin/Ethereum y restricciones de longitud en Solana).
2. **Control de Montos Válidos:** Todas las clases concretas validan al inicio de la transferencia que el `monto` a enviar sea estrictamente mayor a cero (`monto <= 0`). Si no se cumple, el proceso se aborta retornando `false` y emitiendo una advertencia.
3. **Intercambiabilidad Polimórfica:** Gracias a la interfaz `RedBlockchain`, el flujo principal puede reutilizar la misma variable de referencia para alternar dinámicamente de protocolo sin alterar la lógica de negocio subyacente.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Saldo de Bitcoin verificado.
Procesando transaccion en Bitcoin...
Calculando tarifa de red...
Esperando confirmaciones de Bitcoin...
Transaccion Bitcoin confirmada.
--------------------
Saldo de Ethereum verificado.
Procesando transaccion en Ethereum...
Calculando gas...
Esperando confirmaciones de Ethereum...
Transaccion Ethereum confirmada.
--------------------
Saldo de Solana verificado.
Procesando transaccion en Solana...
Calculando tarifa de red...
Esperando confirmacion de Solana...
Transaccion Solana confirmada.

```

---

## 🚀 Conceptos de Programación Aplicados

* **Polimorfismo por Interfaces:** Permite tratar a objetos heterogéneos de redes completamente distintas a través de un contrato común, simplificando la interacción del sistema cliente.
* **Principio Abierto/Cerrado (OCP):** Facilita la incorporación de nuevas blockchains (ej. `RedCardano`, `RedPolygon`) creando una nueva clase que implemente la interfaz `RedBlockchain`, sin necesidad de modificar el código del `Main`.
* **Encapsulamiento de Reglas de Protocolo:** Cada clase aísla las particularidades de su red (como el cálculo de gas o las reglas de prefijos), manteniendo un diseño limpio y modular.

---

### 💡 Materiales de Apoyo y Videos

Los videos recomendados arriba ilustran cómo estructurar arquitecturas escalables basadas en interfaces y polimorfismo en Java para simular sistemas de múltiples proveedores o protocolos de red.
