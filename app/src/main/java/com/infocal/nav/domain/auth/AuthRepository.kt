package com.infocal.nav.domain.auth

interface AuthRepository {
    suspend fun login(email: String, password: String): AuthResult
}