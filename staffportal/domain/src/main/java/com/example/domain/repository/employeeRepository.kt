package com.example.domain.repository

import com.example.domain.model.Employee

interface EmployeeRepository {
    suspend fun getEmployee(id: Int): Employee
}
