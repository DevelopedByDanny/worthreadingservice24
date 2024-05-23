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
