package com.example.btvntuan2

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    data class Result(val message: String? = null, val error: String? = null)

    fun checkCategory(name: String, ageText: String): Result {
        if (name.isBlank() || ageText.isBlank()) {
            return Result(error = "Vui lòng nhập đầy đủ thông tin")
        }

        val age = ageText.toIntOrNull()
        if (age == null || age < 0 || age > 120) {
            return Result(error = "Tuổi không hợp lệ (0–120)")
        }

        val category = when {
            age <= 2 -> "Em bé"
            age <= 6 -> "Trẻ em"
            age <= 65 -> "Người lớn"
            else -> "Người già"
        }

        return Result(message = "$name - $age tuổi là $category")
    }
}
