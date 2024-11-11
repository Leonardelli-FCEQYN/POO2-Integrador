# Especificación de Requisitos de Software

---

## Enunciado del problema

**Descripción del problema:**

El proyecto es un sistema de software para la venta de productos ecológicos en línea. Los productos se pueden vender individualmente o en paquetes. El sistema debe permitir la gestión de inventario, el cálculo de precios con descuentos y la integración con múltiples métodos de pago.

---

## Clientes potenciales

**Usuarios afectados:**

Los clientes potenciales incluyen consumidores interesados en productos ecológicos, empresas que venden productos ecológicos y organizaciones que promueven la sostenibilidad. Estos usuarios se beneficiarán de una plataforma eficiente y fácil de usar para comprar y vender productos ecológicos.

---

## Solución propuesta

**Descripción de la solución:**

La solución propuesta es un sistema de software que permitirá la venta de productos ecológicos en línea. El sistema gestionará el inventario, calculará precios con descuentos y se integrará con múltiples métodos de pago. Esto facilitará a los usuarios la compra y venta de productos ecológicos de manera eficiente y segura.

### Planificación Detallada

Para llevar a cabo la implementación de la solución propuesta, se utilizarán varios patrones de diseño que facilitarán la escalabilidad y el mantenimiento del sistema. A continuación, se detallan los patrones de diseño que se utilizarán y cómo se implementarán:

#### Strategy

El patrón Strategy se utilizará para definir diferentes métodos de pago. Las siguientes clases implementarán este patrón:

- **EstrategiaPago**: Interfaz que definirá el método `pagar(monto: double): void`.
- **PagoTarjetaCredito**: Implementará la interfaz `EstrategiaPago` para pagos con tarjeta de crédito.
- **PagoTarjetaDebito**: Implementará la interfaz `EstrategiaPago` para pagos con tarjeta de débito.
- **PagoTransferenciaBancaria**: Implementará la interfaz `EstrategiaPago` para pagos con transferencia bancaria.
- **ContextoPago**: Clase que utilizará una estrategia de pago para procesar el pago.

#### Observer

El patrón Observer se utilizará para notificar a los observadores sobre cambios en el estado de un pedido. Las siguientes clases implementarán este patrón:

- **Observador**: Interfaz que definirá el método `actualizar(pedido: Pedido): void`.
- **Sujeto**: Interfaz que definirá los métodos `registrarObservador(observador: Observador): void`, `eliminarObservador(observador: Observador): void` y `notificarObservadores(): void`.
- **Pedido**: Implementará la interfaz `Sujeto` y notificará a los observadores cuando haya cambios en el pedido.
- **NotificacionCorreo**: Implementará la interfaz `Observador` para enviar notificaciones por correo electrónico cuando haya cambios en el pedido.

#### Facade (Opcional)

El patrón Facade se utilizará opcionalmente para simplificar la interacción con el sistema. La siguiente clase implementará este patrón:

- **SistemaFacade**: Proporcionará métodos simplificados para realizar operaciones comunes, como realizar una compra o gestionar productos.

#### Decorator

El patrón Decorator se utilizará para aplicar descuentos a los productos. Las siguientes clases implementarán este patrón:

- **Descuento**: Clase base para los descuentos.
- **DescuentoBase**: Clase base para los decoradores de descuento.
- **DescuentoPorcentajeDecorator**: Implementará un descuento basado en un porcentaje.
- **DescuentoFijoDecorator**: Implementará un descuento basado en un valor fijo.

### Diagrama UML de Clases

A continuación se muestra el diagrama UML de clases que ilustra la implementación de estos patrones de diseño:

![Diagrama de Clases de las ventas en linea](/out/docs/Iteracion1/DiagramaClases_V1/iteracion1_VentaProductosLinea.png)

### Implementación Detallada

1. **Gestión de Inventario**:
   - Implementar la clase `Administrador` con métodos para agregar, actualizar y eliminar productos del inventario (`agregarProducto`, `actualizarProducto`, `eliminarProducto`).
   - Implementar la clase `Producto` con atributos como `id`, `nombre`, `descripcion`, `precio` y `stock` para gestionar la información del producto.

2. **Cálculo de Precios con Descuentos**:
   - Utilizar el patrón Decorator para aplicar descuentos a los productos. Implementar la clase `Descuento` y sus decoradores (`DescuentoPorcentajeDecorator` y `DescuentoFijoDecorator`) para permitir aplicar diferentes tipos de descuentos a los productos.

3. **Integración con Múltiples Métodos de Pago**:
   - Utilizar el patrón Strategy para definir diferentes métodos de pago. Implementar la interfaz `EstrategiaPago` y sus implementaciones (`PagoTarjetaCredito`, `PagoTarjetaDebito`, `PagoTransferenciaBancaria`) para procesar pagos utilizando diferentes métodos.
   - Implementar la clase `ContextoPago` para seleccionar y utilizar la estrategia de pago adecuada.

4. **Notificaciones de Pedido**:
   - Utilizar el patrón Observer para notificar a los observadores sobre cambios en el estado de un pedido. Implementar la clase `Pedido` que implementará la interfaz `Sujeto` y notificará a los observadores (como `NotificacionCorreo`) cuando haya cambios en el pedido.

5. **Simplificación de la Interacción con el Sistema**:
   - Utilizar el patrón Facade opcionalmente para simplificar la interacción con el sistema. Implementar la clase `SistemaFacade` que proporcionará métodos simplificados para realizar operaciones comunes, como realizar una compra o gestionar productos.

---

## Requisitos

**Historias de usuario**

1. **Como** Cliente, **quiero** ver una lista de productos ecológicos disponibles, **para** escoger los productos que quiero comprar.
2. **Como** Cliente, **quiero** poder buscar productos por categoría o palabras clave, **para** encontrar rápidamente los productos que necesito.
3. **Como** Cliente, **quiero** ver el precio total de mi compra incluyendo descuentos aplicables, **para** saber cuánto pagaré antes de realizar el pedido.
4. **Como** Cliente, **quiero** seleccionar diferentes métodos de pago como tarjeta o transferencia bancaria, **para** pagar de forma conveniente y segura.
5. **Como** Administrador, **quiero** agregar nuevos productos al inventario con su descripción, precio y cantidad, **para** mantener el catálogo actualizado.
6. **Como** Administrador, **quiero** modificar la cantidad de productos en el inventario cuando se realiza una venta, **para** mantener un control preciso del inventario.
7. **Como** Administrador, **quiero** aplicar descuentos automáticos a ciertos productos o paquetes, **para** ofrecer promociones atractivas a los clientes.
8. **Como** Cliente, **quiero** recibir una confirmación de compra por correo electrónico con el detalle de mi pedido, **para** tener un comprobante y detalle de mi compra.
9. **Como** Administrador, **quiero** acceder a un historial de ventas y detalles de cada pedido, **para** analizar el rendimiento de las ventas y tomar decisiones informadas.
10. **Como** Cliente, **quiero** ver recomendaciones de productos basadas en mis compras anteriores, **para** descubrir productos que puedan interesarme y mejorar mi experiencia de compra.

---

## Arquitectura de software

**Tipo de aplicación:**

¿Será esta una aplicación web / de escritorio / móvil *(todas o algún otro tipo)*?

**Arquitectura:**

¿Se ajustaría a la arquitectura de software Cliente-Servidor?

**Tecnologías:**

¿Qué lenguajes de programación, frameworks, bases de datos,... se utilizarán para desarrollar e implementar el software?

---
