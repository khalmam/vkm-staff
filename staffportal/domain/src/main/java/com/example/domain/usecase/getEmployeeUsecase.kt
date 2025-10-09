package com.example.domain.usecase

import com.example.domain.model.Employee
import com.example.domain.repository.EmployeeRepository

class GetEmployeeUseCase(private val repository: EmployeeRepository) {
    suspend operator fun invoke(id: Int): Employee {
        return repository.getEmployee(id)
    }
}
