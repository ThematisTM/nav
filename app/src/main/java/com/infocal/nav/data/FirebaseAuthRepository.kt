package com.infocal.nav.data

import com.google.firebase.auth.FirebaseAuth
import com.infocal.nav.domain.auth.AuthRepository
import com.infocal.nav.domain.auth.AuthResult
import kotlinx.coroutines.tasks.await

class FirebaseAuthRepository(
    private val firebaseAuth: FirebaseAuth
) : AuthRepository {

    override suspend fun login(email: String, password: String): AuthResult {
        return try {
            firebaseAuth.signInWithEmailAndPassword(email, password).await()
            AuthResult.Success
        } catch (_: Exception) {
            AuthResult.Error("Credenciales inválidas")
        }
    }
}