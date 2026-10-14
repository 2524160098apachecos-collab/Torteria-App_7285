
# Tortería API REST

## Sistema Web de Gestión y Toma de Pedidos

Proyecto académico desarrollado para la asignatura **Desarrollo Web Profesional (VIII-3)** de la Universidad Tecnológica de Tecámac.

La aplicación implementa una API REST utilizando Java 21, Spring Boot 3.4.5 y Maven, permitiendo consultar información relacionada con clientes, tortas y pedidos mediante solicitudes HTTP GET.

Los datos utilizados son de prueba y se encuentran almacenados en memoria, por lo que no se requiere una base de datos.

## Información académica

**Universidad:** Universidad Tecnológica de Tecámac

**Carrera:** Ingeniería en Tecnologías de la Información y Comunicación, Área Desarrollo de Software Multiplataforma

**Asignatura:** Desarrollo Web Profesional (VIII-3)

**Cuatrimestre:** Septiembre - Diciembre 2026

**Asesor académico:** M. en TI. Noé Fernando Cerón Enríquez

**Estudiantes:**
- Ortega Munguía Felipe
- Pacheco Soto Ángel Saúl

## Objetivo

Desarrollar una API REST utilizando Spring Boot, implementar controladores con endpoints de consulta y comprobar su funcionamiento mediante un navegador web y Postman.

## Tecnologías utilizadas

- Java JDK 21
- Spring Boot 3.4.5
- Maven
- Spring Web
- Visual Studio Code
- Postman
- Git y GitHub

El proyecto no utiliza Lombok ni una base de datos.

## Estructura del proyecto

```text
torteria-api-nuevo/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/torteria/api/
│       │       ├── controller/
│       │       │   ├── ClienteController.java
│       │       │   ├── TortaController.java
│       │       │   ├── PedidoController.java
│       │       │   └── SaludoController.java
│       │       ├── model/
│       │       │   ├── Cliente.java
│       │       │   ├── Torta.java
│       │       │   └── Pedido.java
│       │       └── TorteriaApiApplication.java
│       └── resources/
│           └── application.properties
├── .gitignore
├── pom.xml
├── README.md
└── PRUEBAS.md
```

## Requisitos

Para ejecutar el proyecto se necesita:

- JDK 21 instalado.
- Maven 3.9 o superior para compilar desde terminal.
- Visual Studio Code u otro IDE compatible con Java.
- Navegador web.
- Postman para realizar las pruebas HTTP.

## Ejecución del proyecto

### Opción 1. Ejecutar el archivo JAR

Esta opción permite iniciar la aplicación sin utilizar el comando Maven, siempre que el proyecto ya esté compilado.

Abrir PowerShell dentro de la carpeta del proyecto y ejecutar:

```powershell
java -jar .\target\torteria-api-0.0.1-SNAPSHOT.jar
```

El servidor iniciará en:

http://localhost:8080

Mensaje esperado:

```text
Tomcat started on port 8080 (http)
Started TorteriaApiApplication
```

### Opción 2. Ejecutar mediante Maven

Configurar Java 21:

```powershell
$env:JAVA_HOME="C:\Program Files\Java\jdk-21"
$env:Path="$env:JAVA_HOME\bin;$env:Path"
```

Compilar el proyecto:

```powershell
mvn clean verify
```

Ejecutar la aplicación:

```powershell
mvn spring-boot:run
```

Nota: Maven debe estar instalado y disponible en la variable PATH.

El proyecto no incluye Maven Wrapper de manera predeterminada.

## Controladores REST

La aplicación contiene cuatro controladores que permiten consultar información mediante solicitudes HTTP GET.

### 1. ClienteController

Permite consultar los clientes registrados como datos de ejemplo.

**Consultar todos los clientes:**

GET http://localhost:8080/clientes

**Consultar un cliente por ID:**

GET http://localhost:8080/clientes?id=2

Ejemplo de respuesta:

```json
{
  "id": 2,
  "nombre": "María López",
  "telefono": "5523456789",
  "direccion": "Ecatepec"
}
```

### 2. TortaController

Permite consultar información del catálogo de tortas.

**Consultar todas las tortas:**

GET http://localhost:8080/torta

**Consultar una torta por ID:**

GET http://localhost:8080/torta?id=3

La respuesta contiene información del producto, como su identificador, nombre, precio y descripción.

### 3. PedidoController

Permite consultar información de los pedidos.

**Consultar todos los pedidos:**

GET http://localhost:8080/pedido

**Consultar un pedido por ID:**

GET http://localhost:8080/pedido?id=1

La respuesta contiene información relacionada con el cliente, producto, cantidad y comentarios del pedido.

### 4. SaludoController

Endpoint de prueba para verificar la comunicación con el servidor.

GET http://localhost:8080/hola

Respuesta esperada:

```text
Hola desde la torteria
```

## Tabla general de endpoints

| Método | Endpoint | Descripción |
|---|---|---|
| GET | /clientes | Consultar clientes |
| GET | /clientes?id=2 | Consultar cliente por ID |
| GET | /torta | Consultar catálogo de tortas |
| GET | /torta?id=3 | Consultar torta por ID |
| GET | /pedido | Consultar pedidos |
| GET | /pedido?id=1 | Consultar pedido por ID |
| GET | /hola | Verificar funcionamiento del servidor |

Las consultas de identificadores inexistentes deben devolver HTTP 404 Not Found cuando así esté implementado en el controlador.

## Pruebas en navegador web

Se realizan solicitudes HTTP GET ingresando las direcciones de los endpoints en el navegador.

Estas pruebas permiten comprobar que el servidor recibe las solicitudes y devuelve información estructurada en formato JSON.

La consulta general de clientes fue comprobada correctamente, mostrando diez registros.

## Pruebas mediante Postman

Para verificar los endpoints:

1. Abrir Postman.
2. Crear una nueva petición HTTP.
3. Seleccionar el método GET.
4. Introducir la URL del endpoint.
5. Presionar Send.
6. Revisar la respuesta JSON.
7. Verificar el código de estado HTTP.

Para una consulta exitosa, el servidor debe devolver HTTP 200 OK.

Las evidencias deben mostrar el método utilizado, la URL, la respuesta y el código HTTP.

## Repositorio de GitHub

**Nombre:** Torteria-App_7285

**Propietario:** 2524160098apachecos-collab

**Rama principal:** main

**Enlace:**

https://github.com/2524160098apachecos-collab/Torteria-App_7285

El proyecto se administra mediante Git y se publica en GitHub para permitir la consulta del código fuente y su revisión académica.

## Actualización del repositorio

Después de modificar archivos del proyecto, ejecutar:

```powershell
git add .
git commit -m "Actualizar documentacion y proyecto Torteria API"
git push origin main
```

## Conclusión

El desarrollo de Tortería API permitió aplicar conceptos fundamentales de los servicios web REST mediante Java y Spring Boot.

Se implementaron controladores que responden a peticiones HTTP GET y proporcionan información de prueba en formato JSON.

El proyecto permite practicar la organización de aplicaciones Java, el manejo de rutas, los parámetros de consulta y la comunicación entre clientes HTTP y un servidor.

Además, el uso de GitHub facilita el control de versiones, la documentación y la entrega del código fuente para su evaluación académica.
