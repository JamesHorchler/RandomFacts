package com.example.randomfactsapp.repository

import com.example.randomfactsapp.model.Fact
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface Repository {
    suspend fun getRandomFact(): Response<Fact>
    suspend fun getDailyFact(): Response<Fact>
    suspend fun saveFact(fact: Fact)
    fun readFacts(): Flow<List<Fact>>
    suspend fun deleteFact(fact: Fact)
    suspend fun checkFactSaved(id: String): Boolean
}