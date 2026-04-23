# Buscador de Libros

## Descripción
Aplicación Android que permite buscar libros dentro de una lista predefinida y visualizar sus detalles en una segunda pantalla.

El usuario puede:
- Ingresar el nombre de un libro (o parte del nombre).
- Buscarlo dentro de la lista disponible.
- Ver la información completa del libro encontrado:
  - Título
  - Autor
  - Año
  - Cantidad de páginas
  - Categorías
  - Descripción
  - Imagen de portada

---

## Implementación MVVM

La aplicación fue desarrollada utilizando el patrón MVVM (Model - View - ViewModel):

- Model (Libro):  
  Representa la entidad libro con sus atributos (título, autor, año, páginas, categorías, descripción e imagen).

- ViewModel (MainViewModel, DetalleViewModel):  
  Manejan la lógica de la aplicación:
  - MainViewModel realiza la búsqueda del libro dentro de la lista.
  - DetalleViewModel gestiona el libro seleccionado y expone sus datos.
  - Se utiliza LiveData para comunicar los cambios a la vista.

- View (MainActivity, DetalleActivity):  
  Muestran la interfaz al usuario y observan los datos del ViewModel sin contener lógica de negocio.  
  Se utiliza View Binding para acceder a los componentes del layout.

---

## Funcionalidades

- Búsqueda de libros por coincidencia parcial del título  
- Navegación entre Activities  
- Visualización detallada del libro  
- Manejo de errores en búsqueda  
- Uso de arquitectura MVVM  
- Uso de View Binding  

---

## Integrantes

- Jacqueline Estefanía Gomez - 44019661  
- Santiago Godoy - 41055150  
