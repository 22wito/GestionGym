# GYMFIT

GYMFIT es una aplicación diseñada para los clientes del gimnasio ficticio GymFit, con el objetivo de mejorar su experiencia y facilitar la gestión de su actividad física y salud.

<p align="center">
  <img src="https://github.com/22wito/GestionGym/blob/master/src/Imagenes/GymImage.jpg?raw=true" alt="Pantalla de Acceso de GYMFIT" width="450"/>
</p>
  
## Descripción

GYMFIT es la aplicación para clientes del gimnasio ficticio GymFit. Ha sido creada con la intención de mejorar la calidad de vida de sus miembros, ofreciendo una serie de funcionalidades que simplifican y enriquecen su experiencia en el gimnasio. La aplicación busca permitir actividades y gestiones que usualmente no son tan accesibles en otros gimnasios.

El diseño de la interfaz se ha cuidado para que sea no solo útil, sino también agradable visualmente (con un tema oscuro para no dañar la vista) y fácil de interactuar, con botones y elementos visuales intuitivos que reflejan fluidez en la aplicación. Se busca que cualquier persona pueda entender el funcionamiento de la aplicación, incluso sin experiencia previa con otras aplicaciones similares.

## Características Principales

*   **Gestión de Cuenta de Usuario:**
    *   Registro de nuevos usuarios rellenando diferentes campos(nombre de usuario, nombre completo, email, contraseña, teléfono).
    *   Inicio de sesión para usuarios registrados.
*   **Modo Invitado:** Permite explorar funcionalidades básicas de la aplicación sin necesidad de registro, aunque con acceso limitado a funciones de usuario.
*   **Consulta de Aforo:** Verifica la cantidad de personas en el gimnasio en tiempo real.
*   **Seguimiento de Salud (para usuarios registrados):**
    *   Registra y visualiza datos personales de salud (altura, peso, edad).
    *   Calcula el Índice de Masa Corporal (IMC).
*   **Contacto:** Facilita la comunicación con empleados del gimnasio sin necesidad de estar presente físicamente.
*   **Bienvenida Interactiva:** Para usuarios registrados.
*   **Modo "Entrenando":** Funcionalidad específica para cuando el usuario está en el gimnasio.
*   **Interfaz Intuitiva y Accesible:** Diseño claro, con aspecto oscuro y botones interactivos para una fácil comprensión y fluidez.


## Potencial a Futuro

El proyecto tiene potencial para incorporar las siguientes mejoras:
*   Horarios y sistema de reservas de clases.
*   Tienda oficial de productos GYMFIT.
*   Registro más detallado y visualización de la línea de tiempo sobre la salud del usuario.


## Tecnologías Utilizadas

*   **Lenguaje Principal:** Java.
*   **IDE:** Eclipse.
*   **FrontEnd:** JavaSwing.
*   **Base de Datos:** MySQL en un servidor Apache con XAMPP
*   **Herramientas adicionales:** Uso de Git y GitHub para el control de versiones.
*   **Paquetes necesarios:** Paquete de conexión a Base de Datos.

## Instalación

Para utilizar la aplicación, sigue estos pasos:

1. **Requisitos Previos:**
    *   **JDK:** Versión 8 o superior. Asegúrate de que esté correctamente instalado y configurado en tu PATH.
    *   **Servidor MySQL:** Tener una instancia de MySQL instalada y en ejecución (Preferiblemente con XAMPP).
    *   **MySQL Connector/J:** Descargar el archivo `.jar` del conector JDBC para MySQL.

2.  **Configuración de la Base de Datos:**

    Utiliza el script .sql que se encuentra en el repositorio para importar la base de datos. Para ello debes acceder a phpMyAdmin desde XAMPP y seleccionar la opción de importar.

    Nos quedaría una Base de Datos con la siguiente estructura:
   <p align="center">
  <img src="https://github.com/22wito/GestionGym/blob/master/src/Imagenes/EntidadRelación.png?raw=true" alt = "Diagrama Entidad Relación Normalizado" width="450"/>
</p>


4.  **Clona el Repositorio:**
    ```bash
    git clone https://github.com/22wito/GestionGym.git
    cd GestionGym
    ```

5.  **Compilación y Ejecución:**
  1. Importa el proyecto como archivo existente (Preferiblemente en Eclipse).
  2. Añade el .jar de la conexión MySQL en el buildpath a las librerias del proyecto.
  3. Asegúrate de tener el servidor Apache y MySQL activos en XAMPP.
  4. Busca la clase inicio.java y ejecútala.

## Autores

*   **Jorge Ramos González**
*   **Hugo Lozano Gallardo**
