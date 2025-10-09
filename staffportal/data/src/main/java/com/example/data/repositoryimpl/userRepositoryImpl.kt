package com.example.data.repositoryimpl

import com.example.domain.repository.UserRepository

class UserRepositoryImpl : UserRepository {
    override fun getUserName(): String {
        return "Kotlin Clean Architecture"
    }
}
