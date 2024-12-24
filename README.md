# Users App

## Overview

The Users App is a Kotlin-based application using Spring Boot to manage user information. It provides endpoints to fetch details of a specific user by their ID and to retrieve a list of all users.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)

## Features

- Fetch the details of a specific user by their ID.
- Retrieve a list of all users.
- Built with Kotlin and Spring Boot.

## Installation

To run the Users App locally, follow these steps:

1. **Clone the repository:**
   ```sh
   git clone https://github.com/satyam2402/users-app.git
   cd users-app
   ```

2. **Install dependencies:**
   ```sh
   mvn clean install
   ```

3. **Set up environment variables:**
   Create a `local.properties` file in the root directory and add any necessary environment variables.

4. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```

5. **Open your browser:**
   Visit `http://localhost:8080` to see the app in action.

## Usage

### Fetch User by ID

To fetch the details of a specific user by their ID, send a GET request to the following endpoint:
```
GET /users/{id}
```
Replace `{id}` with the actual user ID.

Example:
```sh
curl -X GET http://localhost:8080/users/123
```

### Fetch All Users

To fetch the details of all users, send a GET request to the following endpoint:
```
GET /users
```

Example:
```sh
curl -X GET http://localhost:8080/users
```

## API Documentation

The Users App provides the following API endpoints:

- `GET /users/{id}`: Fetch the details of the user by their ID.
- `GET /users`: Fetch the master dump of all users.

## Contributing

We welcome contributions to the Users App! To contribute, follow these steps:

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/your-feature`
3. Make your changes and commit them: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/your-feature`
5. Open a pull request.

## License

This project is currently not licensed. Please contact the repository owner if you have any questions.

## Contact

For any questions or feedback, please contact the repository owner at [Harsh Vardhan](https://github.com/satyam2402).
