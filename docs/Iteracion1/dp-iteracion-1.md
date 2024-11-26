# Documento de Diseño y Planificación
---

## Trabajo en equipo

> **Descripción de las tareas asignadas a cada miembro:**
>
> - **Leonardelli Lisandro:**
>   - Creación del repositorio y estructura inicial del proyecto
>   - Diseño del diagrama de clases
> - **Castillo Mazo Andrés Luciano:**
>   - Implementación de las Clases del modelo
> - **Amarilla Espindola Aldo Wilfrido:**
>   - Diseño de Wireframes
>   - Implementación de los Wireframes con el Framework Spring Boot
> - **Gimenez Iván Benjamin:**
>   - Implementación de las Clases del modelo
> - **Sosa Ayelén:**
>   - Diseño del diagrama de clases
>   - Diseño de Wireframes
> - **Albornoz Franco:**
>   - Implementar la persistencia con la base de datos
>   - Implementar los controladores de persistencia correspondientes
>   - Armar la arquitectura MVC (estructurado de carpetas del proyecto)

---

## Diseño OO

> **Diagrama UML de clases:**
>![Diagrama de Clases de las ventas en linea](/out/docs/Iteracion1/DiagramaClases_Actualizado/iteracion1_VentaProductosLinea.png)
>
> Descripción del diagrama UML y los componentes incluidos en esta iteración.

---

## Wireframe y caso de uso

> **Bocetos de la interfaz de usuario:**
> 
> **Wireframe de Inicio**
> ![Wireframe](/out/docs/Iteracion1/Wireframe/Pantalla_de_Inicio.png)
> 
> **Wireframe de Catálogo de Productos**
> ![Wireframe](/out/docs/Iteracion1/Wireframe/Catalogo_de_Productos.png)
> 
> **Wireframe de Detalle de Producto**
> ![Wireframe](/out/docs/Iteracion1/Wireframe/Detalle_del_Producto.png)
> 
> **Wireframe de Carrito de Compras**
> ![Wireframe](/out/docs/Iteracion1/Wireframe/Carrito_de_Compras.png)
> 
> **Wireframe de Confirmación de Compra**
> ![Wireframe](/out/docs/Iteracion1/Wireframe/Confirmación_de_compra.png)
> 
> **Wireframe de Registración**
> ![Wireframe](/out/docs/Iteracion1/Wireframe/Registración.png)
>  
> **Wireframe de Recuperación de Contraseña**
> ![Wireframe](/out/docs/Iteracion1/Wireframe/Olvidar_Contraseña.png)
> 
> **Wireframe de Inicio de Sesión**
> ![Wireframe](/out/docs/Iteracion1/Wireframe/Iniciar_Sesión.png)
> 
> **Wireframe de Panel de Administración**
> ![Wireframe](/out/docs/Iteracion1/Wireframe/Panel_De_Administración.png)
> 
>
> **Casos de uso:**
>
> **Caso de uso 1:** Visualización de productos ecológicos disponibles.
> - **Actores:** Cliente
> - **Curso típico de eventos:**
>   1. El cliente accede a la página principal o sección de productos ecológicos.
>   2. El sistema muestra una lista de productos ecológicos disponibles, incluyendo nombre, precio y breve descripción.
>   3. El cliente puede navegar por la lista y seleccionar productos para ver más detalles.
> - **Curso alternativo:**
>   1. Si no hay productos disponibles, el sistema muestra un mensaje indicando que no hay productos en stock.

> **Caso de uso 2:** Búsqueda de productos por categoría o palabras clave.
> - **Actores:** Cliente
> - **Curso típico de eventos:**
>   1. El cliente accede a la barra de búsqueda en la página principal o en la sección de productos.
>   2. El cliente ingresa una categoría o palabras clave en la barra de búsqueda.
>   3. El sistema filtra los productos y muestra los resultados relevantes.
>   4. El cliente puede navegar por los resultados y seleccionar productos para ver más detalles.
> - **Curso alternativo:**
>   1. Si no se encuentran productos que coincidan con la búsqueda, el sistema sugiere productos relacionados.

> **Caso de uso 3:** Visualización del precio total incluyendo descuentos.
> - **Actores:** Cliente
> - **Curso típico de eventos:**
>   1. El cliente agrega productos al carrito de compras.
>   2. El sistema calcula el precio total de la compra, incluyendo todos los descuentos aplicables.
>   3. El sistema muestra el precio total y los descuentos aplicados en el resumen del carrito.
>   4. El cliente puede proceder al pago con el precio total actualizado.
> - **Curso alternativo:**
>   1. Si el cliente elimina productos del carrito, el sistema actualiza dinámicamente el precio total y los descuentos aplicados.

> **Caso de uso 4:** Selección de método de pago.
> - **Actores:** Cliente
> - **Curso típico de eventos:**
>   1. El cliente procede al pago desde el carrito de compras.
>   2. El sistema muestra las opciones de métodos de pago disponibles (tarjeta de crédito, tarjeta de débito, transferencia bancaria).
>   3. El cliente selecciona un método de pago.
>   4. El sistema procesa el pago de forma segura y notifica al cliente del éxito o fallo del procesamiento.
> - **Curso alternativo:**
>   1. Si el procesamiento del pago falla, el sistema muestra un mensaje de error y permite al cliente intentar nuevamente o seleccionar otro método de pago.

> **Caso de uso 5:** Agregar nuevos productos al inventario.
> - **Actores:** Administrador
> - **Curso típico de eventos:**
>   1. El administrador accede al panel de administración.
>   2. El administrador selecciona la opción para agregar un nuevo producto.
>   3. El administrador ingresa el nombre, descripción, precio y cantidad del producto.
>   4. El sistema verifica que el precio sea un valor positivo y la cantidad un número entero.
>   5. El sistema guarda el nuevo producto en el inventario y lo muestra en la lista de productos disponibles.
> - **Curso alternativo:**
>   1. Si los datos ingresados no son válidos, el sistema muestra un mensaje de error y solicita al administrador corregir los datos.

> **Caso de uso 6:** Modificación del inventario tras una venta.
> - **Actores:** Administrador
> - **Curso típico de eventos:**
>   1. El cliente completa una compra.
>   2. El sistema reduce automáticamente la cantidad de productos en el inventario según la venta realizada.
>   3. El sistema alerta al administrador si la cantidad de un producto es menor que el umbral de inventario mínimo.
>   4. El administrador puede ver un historial de ajustes de inventario para cada producto.
> - **Curso alternativo:**
>   1. Si el inventario no se puede actualizar automáticamente, el sistema notifica al administrador para que realice la actualización manualmente.

> **Caso de uso 7:** Aplicación de descuentos automáticos en productos.
> - **Actores:** Administrador
> - **Curso típico de eventos:**
>   1. El administrador accede al panel de administración.
>   2. El administrador selecciona la opción para configurar descuentos.
>   3. El administrador ingresa los detalles del descuento (porcentaje o valor fijo, condiciones de aplicación).
>   4. El sistema aplica automáticamente los descuentos configurados a los productos o paquetes elegidos.
>   5. Los productos con descuento muestran el precio original tachado y el precio con descuento visible.
> - **Curso alternativo:**
>   1. Si las condiciones del descuento no se cumplen, el sistema no aplica el descuento y notifica al administrador.

> **Caso de uso 8:** Acceso al historial de ventas y detalles de pedidos.
> - **Actores:** Administrador
> - **Curso típico de eventos:**
>   1. El administrador accede al panel de administración.
>   2. El administrador selecciona la opción para ver el historial de ventas.
>   3. El sistema muestra un historial de ventas ordenado por fecha, con filtros de búsqueda.
>   4. Cada venta en el historial incluye detalles como productos vendidos, cantidades, precios, y método de pago.
>   5. El administrador puede exportar el historial de ventas a un formato común, como CSV o Excel.
> - **Curso alternativo:**
>   1. Si no hay ventas registradas, el sistema muestra un mensaje indicando que no hay ventas en el historial.

> **Caso de uso 9:** Registro de nuevos clientes.
> - **Actores:** Cliente
> - **Curso típico de eventos:**
>   1. El cliente accede a la página de registro.
>   2. El cliente proporciona su nombre, correo electrónico y contraseña.
>   3. El sistema verifica que el correo electrónico no esté ya registrado.
>   4. El sistema guarda los datos del cliente y envía un correo de confirmación.
> - **Curso alternativo:**
>   1. Si el correo electrónico ya está registrado, el sistema muestra un mensaje de error y solicita al cliente usar otro correo.

> **Caso de uso 10:** Inicio de sesión de clientes.
> - **Actores:** Cliente
> - **Curso típico de eventos:**
>   1. El cliente accede a la página de inicio de sesión.
>   2. El cliente proporciona su correo electrónico y contraseña.
>   3. El sistema verifica las credenciales y permite el acceso si son correctas.
>   4. El cliente accede a su cuenta y puede realizar compras.
> - **Curso alternativo:**
>   1. Si las credenciales son incorrectas, el sistema muestra un mensaje de error y permite al cliente intentar nuevamente.

> **Caso de uso 11:** Recuperación de contraseña.
> - **Actores:** Cliente
> - **Curso típico de eventos:**
>   1. El cliente accede a la página de recuperación de contraseña.
>   2. El cliente proporciona su correo electrónico.
>   3. El sistema envía un enlace de recuperación al correo electrónico del cliente.
>   4. El cliente utiliza el enlace para restablecer su contraseña.
> - **Curso alternativo:**
>   1. Si el correo electrónico no está registrado, el sistema muestra un mensaje de error y solicita al cliente verificar su correo.

---

## Backlog de iteración

> **Historias de usuario a implementar:**
>
> 1. **Historia de usuario 1:** Como cliente, quiero ver una lista de productos ecológicos disponibles para escoger los productos que quiero comprar.
> 2. **Historia de usuario 2:** Como cliente, quiero poder buscar productos por categoría o palabras clave para encontrar rápidamente los productos que necesito.
> 3. **Historia de usuario 3:** Como cliente, quiero ver el precio total de mi compra incluyendo descuentos aplicables para saber cuánto pagaré antes de realizar el pedido.
> 4. **Historia de usuario 4:** Como cliente, quiero seleccionar diferentes métodos de pago como tarjeta o transferencia bancaria para pagar de forma conveniente y segura.
> 5. **Historia de usuario 5:** Como administrador, quiero agregar nuevos productos al inventario con su descripción, precio y cantidad para mantener el catálogo actualizado.
> 6. **Historia de usuario 6:** Como administrador, quiero modificar la cantidad de productos en el inventario cuando se realiza una venta para mantener un control preciso del inventario.
> 7. **Historia de usuario 7:** Como administrador, quiero aplicar descuentos automáticos a ciertos productos o paquetes para ofrecer promociones atractivas a los clientes.
> 8. **Historia de usuario 8:** Como administrador, quiero acceder a un historial de ventas y detalles de cada pedido para analizar el rendimiento de las ventas y tomar decisiones informadas.
> 9. **Historia de usuario 9:** Como cliente, quiero registrarme en el sistema con mis datos personales para poder realizar compras y recibir notificaciones.
> 10. **Historia de usuario 10:** Como cliente, quiero iniciar sesión en el sistema con mi correo electrónico y contraseña para acceder a mi cuenta y realizar compras.
> 11. **Historia de usuario 11:** Como cliente, quiero recuperar mi contraseña en caso de olvidarla para poder acceder a mi cuenta nuevamente.

---

## Tareas

> **Lista de tareas específicas:**
>
> - **Tarea 1:** Implementar la visualización de productos ecológicos disponibles.
> - **Tarea 2:** Implementar la búsqueda de productos por categoría o palabras clave.
> - **Tarea 3:** Implementar la visualización del precio total incluyendo descuentos.
> - **Tarea 4:** Implementar la selección de método de pago.
> - **Tarea 5:** Implementar la funcionalidad para agregar nuevos productos al inventario.
> - **Tarea 6:** Implementar la modificación del inventario tras una venta.
> - **Tarea 7:** Implementar la aplicación de descuentos automáticos en productos.
> - **Tarea 8:** Implementar el acceso al historial de ventas y detalles de pedidos.
> - **Tarea 9:** Implementar el registro de nuevos clientes.
> - **Tarea 10:** Implementar el inicio de sesión de clientes.
> - **Tarea 11:** Implementar la recuperación de contraseña.

---