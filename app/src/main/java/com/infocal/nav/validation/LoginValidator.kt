package com.infocal.nav.validation

import android.util.Patterns
import com.infocal.nav.model.ValidationResult

class LoginValidator {

    fun validateEmail(email: String): ValidationResult {
        val value = email.trim()

        return when {
            value.isEmpty() -> ValidationResult(false, "El correo es obligatorio")
            !Patterns.EMAIL_ADDRESS.matcher(value).matches() ->
                ValidationResult(false, "Formato de correo inválido")
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