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

- _main_ - Clase principal de ejecucion del sistema
- _admin_ - Carpeta del modulo de administracion
- _production_ - Carpeta del modulo de producion
- _sales_ - Carpeta del modulo de ventas
- _const_ - Carpeta de constantes
- _enums_ - Carpeta de Listas enumeradas

### Flujo de aplicacion:

Se esta abordando el patron de arquictectura de software MVC (Model, View, Controller)

- **Modelo (Model)**: Representa la estructura de datos y la lógica de negocio de la aplicación. Es responsable de manejar los datos y su manipulación, así como de aplicar las reglas de negocio.
- **Vista (View)**: Es la interfaz de usuario que presenta los datos al usuario y recibe las interacciones del usuario. La vista muestra la información y presenta los elementos de la interfaz gráfica o de otra forma de presentación.
- **Controlador (Controller)**: Actúa como intermediario entre el modelo y la vista, y maneja las solicitudes del usuario. Es responsable de interpretar las acciones del usuario, actualizar el modelo según sea necesario y actualizar la vista para reflejar los cambios en el modelo.

#### Ejemplo modulo de admin:

- admin/inventory/InventoryController.java
- admin/inventory/InventoryModel.java
- admin/inventory/InventoryView.java

- admin/product/ProductController.java
- admin/product/ProductModel.java
- admin/product/ProductView.java

- admin/user/UserController.java
- admin/user/UserModel.java
- admin/user/UserView.java


## Control de versiones e implementación

Flujo de control de versiones e implementación:

1. Realice los cambios, implementaciones y correcciones creando una nueva rama con base **desarrollo**.
2. Abrir un **pull request** para fusionar la rama creada con el ambiente de **desarrollo**, revise los cambios y, finalmente, fusione.
3. Cambie a la rama **pruebas** localmente y extraiga los cambios combinados recientes.
4. Ejecute el archivo **main** y verifique los cambios.

Mayor informacion puede consultar el siguiente enlace https://www.atlassian.com/es/git/tutorials/comparing-workflows/gitflow-workflow
