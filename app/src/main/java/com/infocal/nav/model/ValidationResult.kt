package com.infocal.nav.model

data class ValidationResult(
    val isValid: Boolean,
    val errorMessage: String? = null
)