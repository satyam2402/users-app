package com.iit.patna.app.models.response

// Represents the data class for sending the user details to the clients.
data class User(
    // Represents the id of the User
    val id: String,
    // Represents the name of the User
    val name: String,
    // Represents the email of the User
    val email: String,
    // Represents the hashed password of the User
    val password: String,
    // Represents the address of the User
    val address: String
)