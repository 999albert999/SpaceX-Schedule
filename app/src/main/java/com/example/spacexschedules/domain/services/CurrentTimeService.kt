package com.example.spacexschedules.domain.services

import kotlinx.coroutines.flow.Flow

interface CurrentTimeService {
    suspend fun getCurrentTime(): Flow<String>
}