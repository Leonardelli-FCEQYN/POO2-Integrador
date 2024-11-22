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
8. **Como** Administrador, **quiero** acceder a un historial de ventas y detalles de cada pedido, **para** analizar el rendimiento de las ventas y tomar decisiones informadas.
9. **Como** Cliente, **quiero** registrarme en el sistema con mis datos personales, **para** poder realizar compras y recibir notificaciones.
10. **Como** Cliente, **quiero** iniciar sesión en el sistema con mi correo electrónico y contraseña, **para** acceder a mi cuenta y realizar compras.
11. **Como** Cliente, **quiero** recuperar mi contraseña en caso de olvidarla, **para** poder acceder a mi cuenta nuevamente.

---

## Arquitectura de software

> **Tipo de aplicación:**
>
> El tipo de aplicación a desarrollar será una aplicación web de escritorio que actuará de manera Responsive para adaptar la interfaz de usuario a dispositivos móviles.
>
> **Arquitectura:**
>
> Al ser una aplicación web, la arquitectura se ajustará a la arquitectura cliente-servidor.
Para la arquitectura de desarollo del sistema, se utilizará una arquitectura por capas permitiendo dividir las responsabilidades de la aplicación en diferentes capas:
> + Vista
> + Modelo
> + Persistencia
> + Controladores
> + Servicios
> + Repositorios
>
> **Tecnologías:**
>
> El Stack para el desarrollo del integrador es el siguiente:
> + IDEs y editores de texto: VS Code y Apache NetBeans
> + Lenguaje de programación: Java
> + Base de Datos: PostreSQL
> + Framework: Spring Boot
> + Persistencia: Jakarta Persistence
---
