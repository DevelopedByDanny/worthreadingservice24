# WorthReading Service API Documentation

## Endpoints

### 1. `PUT /like/toggleLike/{messageId}`
This endpoint toggles the like status for a given message by a specific user.

- **Path Parameter:**
  - `messageId` (String): The ID of the message to like or unlike.

- **Request Header:**
  - `userId` (String): The ID of the user performing the like/unlike action.

- **Response:**
  - `200 OK` (String): A message indicating the new like status (e.g., "Liked" or "Unliked").

- **Example Request:**

  ```http
  PUT /like/toggleLike/12345
  Header:
  userId: user567

- **Example Response**

  ```json
  "Liked"

### 2. `GET /like/amount/{messageId}`

This endpoint retrieves the total number of likes for a specific message.

- **Path Parameter:**
  - `messageId` (String): The ID of the message for which the like count is being retrieved.

- **Response:**
  - `200 OK` (Integer): The number of likes for the specified message.
 
- **Example Request:**

  ```http
  GET /like/amount/12345

- **Example Response:**

  ```json
  42

## Using the service with Docker

### Pulling the image from DockerHub

It needs a mysql database to work

  ```bash
  docker pull perfectpoodle/worthreadingservice24-app:latest
  docker run -d -p 8005:8005 --name worthreadingservice perfectpoodle/worthreadingservice24-app:latest
  ```

### You can also clone the repository and run any of the docker-compose files

This will give you a database and you can run the app in your Ide to test it out

  ```bash
  docker-compose up
  ```

This will start the app in a container with an mysql database. Ready to use on port 8005

  ```bash
  docker-compose -f docker-compose.yml up
  ```

If you want to start the chatgut app with frontend and all other services (You may have to restart some of the services in docker if there database was not ready at startup.)

  ```bash
  docker-compose -f frontend-compose.yml up
  ```
