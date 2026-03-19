package com.infocal.nav.model

class LoginValidator {

    fun validateUsername(username: String): ValidationResult {
        val value = username.trim()

        return when {
            value.isEmpty() -> ValidationResult(false, "El usuario es obligatorio")
            value.length < 3 -> ValidationResult(false, "Debe tener al menos 3 caracteres")
            value.length > 50 -> ValidationResult(false, "No puede superar 50 caracteres")
            else -> ValidationResult(true)
        }
    }

    fun validatePassword(password: String): ValidationResult {
        return when {
            password.isBlank() -> ValidationResult(false, "La contraseña es obligatoria")
            password.length < 8 -> ValidationResult(false, "Debe tener al menos 8 caracteres")
            password.length > 64 -> ValidationResult(false, "No puede superar 64 caracteres")
            else -> ValidationResult(true)
        }
    }
}