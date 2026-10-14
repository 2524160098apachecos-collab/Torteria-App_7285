# Torteria API REST

Proyecto academico con **Java 21**, **Spring Boot 3.4.5** y **Maven**. No usa Lombok ni base de datos; los datos son de prueba en memoria.

## Requisitos
- JDK 21 instalado
- Maven 3.9+ instalado (o Maven Wrapper generado con `mvn wrapper:wrapper`)

## Ejecutar en PowerShell (Windows)
```powershell
$env:JAVA_HOME="C:\Program Files\Java\jdk-21"
$env:Path="$env:JAVA_HOME\bin;$env:Path"
cd "RUTA\A\torteria-api-nuevo"
mvn clean verify
mvn spring-boot:run
```
Si prefieres `./mvnw.cmd`, primero genera el wrapper una vez con `mvn wrapper:wrapper` desde la carpeta del proyecto. El proyecto descargado no incluye el Maven Wrapper.

## Endpoints (todos GET)
| Endpoint | Resultado |
| --- | --- |
| `http://localhost:8080/clientes` | Lista de clientes |
| `http://localhost:8080/clientes?id=2` | Cliente con ID 2 |
| `http://localhost:8080/torta` | Lista de tortas |
| `http://localhost:8080/torta?id=3` | Torta con ID 3 |
| `http://localhost:8080/pedido` | Lista de pedidos |
| `http://localhost:8080/pedido?id=1` | Pedido con ID 1 |
| `http://localhost:8080/hola` | Saludo |

Los ID inexistentes devuelven **404 Not Found**. Prueba cada URL en navegador y Postman (metodo GET). Adjunta las capturas al reporte academico.

## GitHub
Crea un repositorio individual y ejecuta desde esta carpeta:
```powershell
git init
git add .
git commit -m "API REST torteria con Spring Boot"
git branch -M main
git remote add origin https://github.com/TU_USUARIO/torteria-api.git
git push -u origin main
```
Cambia `TU_USUARIO` por tu usuario y crea primero el repositorio vacio en GitHub.
