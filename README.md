# FERTELLO POS

FERTELLO POS es un sistema de produccion y ventas desarrollado en Java utilizando programación orientada a objetos (POO).

## La empresa

Internacional cueros FERTELLO es una empresa dedicada a la marroquinería, fabricación de productos en cuero como billeteras, carteras, casacas y entre otros afines al cuero. Esta empresa se fundó en 2015.

## Modulos

- Administracion
- Ventas
- Produccion

## Estructura de la aplicacion

Todo el código de la aplicación se encuentra en el directorio **src**. Las partes principales son:

- app - Carpeta principal
- main - Clase principal de ejecucion del sistema
- app/interfaces - Carpeta de interfaces
- app/modules - Carpeta conlos modulos de principales de la aplicacion
- app/router - Carpeta con los controladores, vistas y modelos de rutas y menu de gestion
- app/utils - Carpeta con utilidades, constantes y validaciones

### Arquitectura de software

Se esta utilizando el patrón de diseño de software MVC (Model-View-Controller)

El patrón MVC divide la aplicación en tres componentes interconectados:

- **Modelo (Model)**: Representa la estructura de datos y la lógica de negocio de la aplicación. Es responsable de manejar los datos y su manipulación, así como de aplicar las reglas de negocio.
- **Vista (View)**: Es la interfaz de usuario que presenta los datos al usuario y recibe las interacciones del usuario. La vista muestra la información y presenta los elementos de la interfaz gráfica o de otra forma de presentación.
- **Controlador (Controller)**: Actúa como intermediario entre el modelo y la vista, y maneja las solicitudes del usuario. Es responsable de interpretar las acciones del usuario, actualizar el modelo según sea necesario y actualizar la vista para reflejar los cambios en el modelo.

#### Ejemplo modulo de admin

- admin/inventory/InventoryController.java
- admin/inventory/InventoryModel.java
- admin/inventory/InventoryView.java

- admin/product/ProductController.java
- admin/product/ProductModel.java
- admin/product/ProductView.java

- admin/user/UserController.java
- admin/user/UserModel.java
- admin/user/UserView.java

La arquitectura de software orientada a objetos (OOP) se basa en el concepto de "objetos", que pueden contener datos y código: datos en forma de campos (a menudo conocidos como atributos o propiedades), y código, en forma de procedimientos (a menudo conocidos como métodos).

## Control de versiones e implementación

Flujo de control de versiones e implementación:

1. Realice los cambios, implementaciones y correcciones creando una nueva rama con base **desarrollo**.
2. Abrir un **pull request** para fusionar la rama creada con el ambiente de **desarrollo**, revise los cambios y, finalmente, fusione.
3. Cambie a la rama **pruebas** localmente y extraiga los cambios combinados recientes.
4. Ejecute el archivo **main** y verifique los cambios.

Mayor informacion puede consultar el siguiente enlace <https://www.atlassian.com/es/git/tutorials/comparing-workflows/gitflow-workflow>
