package com.example.spacexschedules.domain.usecases

import com.example.spacexschedules.domain.services.CurrentTimeService
import kotlinx.coroutines.flow.Flow

interface GetCurrentTimeUseCase {
    suspend fun invoke(): Flow<String>
}

class GetCurrentTimeUseCaseImpl(private val currentTimeService: CurrentTimeService) : GetCurrentTimeUseCase {
    override suspend fun invoke() = currentTimeService.getCurrentTime()
}