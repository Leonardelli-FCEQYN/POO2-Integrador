# Historias de Usuario

## Historia de Usuario 1: Visualización de productos ecológicos disponibles

**Como** Cliente,  
**Quiero** Ver una lista de productos ecológicos disponibles,  
**Para** Escoger los productos que quiero comprar.

### Criterios de Aceptación
- [ ] La lista muestra al menos el nombre, precio y descripción breve de cada producto.
- [ ] Los productos se actualizan automáticamente según disponibilidad en el inventario.
- [ ] La lista es accesible desde la página principal o desde una sección específica de productos ecológicos.

### Notas
- [Nota adicional o contexto]

---

## Historia de Usuario 2: Búsqueda de productos por categoría o palabras clave

**Como** Cliente,  
**Quiero** Poder buscar productos por categoría o palabras clave,  
**Para** Encontrar rápidamente los productos que necesito.

### Criterios de Aceptación
- [ ] La búsqueda permite filtrar productos por categoría y muestra resultados relevantes en menos de 2 segundos.
- [ ] El sistema acepta al menos 3 palabras clave y sugiere productos relacionados en caso de resultados nulos.
- [ ] Los resultados de búsqueda se ordenan por relevancia, mostrando los productos más relevantes primero.

### Notas
- [Nota adicional o contexto]

---

## Historia de Usuario 3: Visualización del precio total incluyendo descuentos

**Como** Cliente,  
**Quiero** Ver el precio total de mi compra incluyendo descuentos aplicables,  
**Para** Saber cúanto pagaré antes de realizar el pedido.

### Criterios de Aceptación
- [ ] El precio total incluye todos los descuentos aplicables antes de proceder con el pago.
- [ ] Cualquier descuento aplicado se muestra claramente en el resumen del carrito.
- [ ] El total se actualiza dinámicamente cuando el cliente añade o elimina productos del carrito.

### Notas
- [Nota adicional o contexto]

---

## Historia de Usuario 4: Selección de método de pago

**Como** Cliente,  
**Quiero** Seleccionar diferentes métodos de pago como tarjeta o transferencia bancaria,  
**Para** Pagar de forma conveniente y segura.

### Criterios de Aceptación
- [ ] El cliente puede elegir entre tarjeta de crédito, tarjeta de débito o transferencia bancaria como métodos de pago.
- [ ] El sistema asegura que los datos de pago sean procesados de forma segura y cumple con estándares de seguridad
- [ ] El cliente recibe una notificación en caso de éxito o fallo del procesamiento del pago.

### Notas
- [Nota adicional o contexto]

---

## Historia de Usuario 5: Agregar nuevos productos al inventario

**Como** Administrador,  
**Quiero** Agregar nuevos productos al inventario con su descripción, precio y cantidad,  
**Para** Mantener el catálogo actualizado.

### Criterios de Aceptación
- [ ] El administrador puede agregar productos con campos obligatorios de nombre, descripción, precio y cantidad.
- [ ] Al agregar un producto, el sistema verifica que el precio sea un valor positivo y la cantidad un número entero.
- [ ] Los productos recién añadidos aparecen automáticamente en la lista de productos disponibles para los clientes.

### Notas
- [Nota adicional o contexto]

---

## Historia de Usuario 6: Modificación del inventario tras una venta

**Como** Administrador,  
**Quiero** Modificar la cantidad de productos en el inventario cuando se realiza una venta,  
**Para** Mantener un control preciso del inventario.

### Criterios de Aceptación
- [ ] El inventario se actualiza automáticamente cuando se completa una venta, reduciendo la cantidad correspondiente.
- [ ] El sistema alerta al administrador si la cantidad de un producto es menor que el umbral de inventario mínimo.
- [ ] Se puede ver un historial de ajustes de inventario para cada producto, mostrando el motivo de la modificación.

### Notas
- [Nota adicional o contexto]

---

## Historia de Usuario 7: Aplicación de descuentos automáticos en productos

**Como** Administrador,  
**Quiero** Aplicar descuentos automáticos a ciertos productos o paquetes,  
**Para** Ofrecer promociones atractivas a los clientes.

### Criterios de Aceptación
- [ ] El administrador puede configurar descuentos basados en un porcentaje o valor fijo, y estos se aplican automáticamente en el carrito.
- [ ] Los productos o paquetes con descuento muestran el precio original tachado y el precio con descuento visible.
- [ ] Los descuentos se aplican solo si se cumplen ciertas condiciones (por ejemplo, comprar una cantidad mínima).

### Notas
- [Nota adicional o contexto]

---

## Historia de Usuario 8: Acceso al historial de ventas y detalles de pedidos

**Como** Administrador,  
**Quiero** Acceder a un historial de ventas y detalles de cada pedido,  
**Para** Analizar el rendimientos de las ventas y tomar decisiones informadas.

### Criterios de Aceptación
- [ ] El administrador puede acceder a un historial de ventas ordenado por fecha, con filtros de búsqueda.
- [ ] Cada venta en el historial incluye detalles como productos vendidos, cantidades, precios, y método de pago.
- [ ] El sistema permite exportar el historial de ventas a un formato común, como CSV o Excel, para análisis adicionales.

### Notas
- [Nota adicional o contexto]

---

## Historia de Usuario 9: Registro de nuevos clientes

**Como** Cliente,  
**Quiero** Registrarme en el sistema con mis datos personales,  
**Para** Poder realizar compras y recibir notificaciones.

### Criterios de Aceptación
- [ ] El cliente puede registrarse proporcionando nombre, correo electrónico y contraseña.
- [ ] El sistema verifica que el correo electrónico no esté ya registrado.
- [ ] El cliente recibe un correo de confirmación tras registrarse.

### Notas
- [Nota adicional o contexto]

---

## Historia de Usuario 10: Inicio de sesión de clientes

**Como** Cliente,  
**Quiero** Iniciar sesión en el sistema con mi correo electrónico y contraseña,  
**Para** Acceder a mi cuenta y realizar compras.

### Criterios de Aceptación
- [ ] El cliente puede iniciar sesión proporcionando correo electrónico y contraseña.
- [ ] El sistema verifica las credenciales y permite el acceso si son correctas.
- [ ] El cliente recibe un mensaje de error si las credenciales son incorrectas.

### Notas
- [Nota adicional o contexto]

---

## Historia de Usuario 10: Recuperación de contraseña

**Como** Cliente,  
**Quiero** Recuperar mi contraseña en caso de olvidarla,  
**Para** Poder acceder a mi cuenta nuevamente.

### Criterios de Aceptación
- [ ] El cliente puede solicitar la recuperación de contraseña proporcionando su correo electrónico.
- [ ] El sistema envía un enlace de recuperación al correo electrónico del cliente.
- [ ] El cliente puede restablecer su contraseña utilizando el enlace proporcionado.

### Notas
- [Nota adicional o contexto]

---