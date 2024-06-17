# Trabajo Práctico de POO

Desarrolla un programa en Java que modele una estructura académica utilizando los principios de la Programación Orientada a Objetos (POO). El programa debe cumplir con los siguientes requisitos:

1. **Clase Persona:**
   - **Atributos:** `nombre`, `apellido`, `dni`.
   - **Métodos:**
     - Constructor para inicializar los atributos.
     - Método `verAtributos` para mostrar sus atributos en formato texto.

2. **Clase Empleado que hereda de Persona:**
   - **Atributos adicionales:** `sueldo`, `puesto`.
   - **Métodos:**
     - Constructor para inicializar los atributos (incluidos los heredados).
     - Método `verAtributos` que sobrescriba el de la clase `Persona` para mostrar también los atributos adicionales.

3. **Clase Estudiante que hereda de Persona:**
   - **Atributos adicionales:** `matrícula`, `carrera`.
   - **Métodos:**
     - Constructor para inicializar los atributos (incluidos los heredados).
     - Método `verAtributos` que sobrescriba el de la clase `Persona` para mostrar también los atributos adicionales.

4. **Clase Profesor que hereda de Persona:**
   - **Atributos adicionales:** `materia`, `antigüedad`.
   - **Métodos:**
     - Constructor para inicializar los atributos (incluidos los heredados).
     - Método `verAtributos` que sobrescriba el de la clase `Persona` para mostrar también los atributos adicionales.

5. **Clase Comisión:**
   - **Atributos:** `profesor` (de tipo `Profesor`), `estudiantes` (un array de objetos `Estudiante`).
   - **Métodos:**
     - Constructor que recibe un array de `Estudiantes` y un `Profesor` para inicializar los atributos.
     - Método `eliminarEstudiante` que permita eliminar estudiantes de la comisión.
     - Método `listarComision` que muestre todos los datos de la comisión, incluyendo los estudiantes y el profesor.
     - Métodos `insertarEstudiante`, `eliminarEstudiante`, y `modificarEstudiante` para agregar, eliminar y modificar estudiantes en la comisión, respectivamente.
