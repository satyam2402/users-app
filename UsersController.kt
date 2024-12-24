package com.iit.patna.app.controller

import com.iit.patna.app.service.UsersService
import org.springframework.context.annotation.Description
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UsersController(
    private val usersService: UsersService
) {

    @Description("Fetch the details of the user by user id.")
    @GetMapping("/users/{id}")
    fun userById(@PathVariable id: String) = usersService.fetchUserById(id)

    @Description("Fetch the master dump of all users.")
    @GetMapping("/users")
    fun users() = usersService.fetchUsers()
}