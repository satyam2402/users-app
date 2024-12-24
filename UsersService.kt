package com.iit.patna.app.service

import com.iit.patna.app.models.response.User
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class UsersService {

    // Represents the list of users in the datastore.
    private final val users = mutableListOf<User>()

    // Populating the datastore with the users during the initialization.
    init {
        users.add(
            User(
                id = "1",
                name = "Harsh Vardhan",
                email = "harshvardhan@gmail.com",
                password = UUID.randomUUID().toString(),
                address = "Motihari, Bihar"
            )
        )
        users.add(
            User(
                id = "2",
                name = "Raj Vardhan",
                email = "rajvardhan@gmail.com",
                password = UUID.randomUUID().toString(),
                address = "Gaya, Bihar")
        )
        users.add(
            User(
                id = "3",
                name = "Satyam",
                email = "satyam@gmail.com",
                password = UUID.randomUUID().toString(),
                address = "Patna, Bihar")
        )
        users.add(
            User(
                id = "4",
                name = "Sammi",
                email = "sammi@gmail.com",
                password = UUID.randomUUID().toString(),
                address = "Muzaffarpur, Bihar")
        )
    }

    // Fetching the dump of users from the datastore.
    fun fetchUsers() = users

    // Fetching the user by the id from the datastore.
    fun fetchUserById(id: String) = users.first { id == it.id }
}