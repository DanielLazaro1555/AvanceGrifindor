# Proyecto Gryffindor - Backend

Este proyecto forma parte del sistema de duelos mágicos del **Proyecto Gryffindor**, desarrollado en Java 17 utilizando Spring Boot. Su propósito es gestionar la lógica del backend, incluyendo el registro de jugadores y la comunicación en tiempo real durante los duelos mediante WebSocket y STOMP.

---

## Tecnologías utilizadas

- Java 17
- Spring Boot 3.x
- Maven
- PostgreSQL (contenedor Docker)
- WebSocket + STOMP
- SockJS
- API REST

---

## Estructura general del backend

El sistema permite:

- Registrar jugadores de manera temporal (nombre y casa de Hogwarts)
- Guardar jugadores en memoria por sesión
- Enviar y recibir hechizos entre jugadores en tiempo real
- Utilizar WebSocket para la comunicación de eventos del duelo

---

## Requisitos para ejecutar el proyecto

1. Java 17
2. Docker (con PostgreSQL en contenedor)
3. Visual Studio Code (o cualquier IDE compatible con Maven)
4. Maven Wrapper (`./mvnw` incluido en el proyecto)

---

## Configuración de la base de datos (Docker)

Para ejecutar PostgreSQL en contenedor:

```bash
docker run --name mi-postgres \
 -e POSTGRES_USER=user \
 -e POSTGRES_PASSWORD=123456 \
 -e POSTGRES_DB=duelos \
 -p 5432:5432 \
 -d postgres
```

Los datos de conexión se configuran en `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/duelos
spring.datasource.username=user
spring.datasource.password=123456
```

---

## Endpoints REST implementados

| Método | Ruta                                | Descripción                       |
| ------ | ----------------------------------- | --------------------------------- |
| POST   | `/api/jugador/registrar/{idSesion}` | Registra un jugador temporalmente |
| GET    | `/api/jugador/obtener/{idSesion}`   | Obtiene los datos del jugador     |
| DELETE | `/api/jugador/eliminar/{idSesion}`  | Elimina al jugador                |

---

## WebSocket

- Endpoint: `/duelo-magico`
- Envío de hechizos: `/app/hechizo`
- Recepción de resultados: `/topic/resultado`

El backend acepta un objeto con el nombre del jugador y el hechizo lanzado, y responde con un mensaje indicando la acción realizada.

---

## Cliente de prueba (HTML)

Se incluyó un archivo de prueba llamado `websocket-client.html` para verificar el funcionamiento del WebSocket.

Este cliente:

- Permite ingresar un nombre y un hechizo
- Envía los datos al backend
- Muestra el resultado devuelto por el WebSocket

---

## Estado del proyecto

✅ Backend completado según requerimientos:

- Registro de jugadores
- WebSocket funcionando
- Docker para base de datos
- Comunicación lista para integrar con frontend

---

## Autor

Daniel Huaman