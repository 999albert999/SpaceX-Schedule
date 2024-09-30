package com.example.spacexschedules.domain.repository

import com.example.spacexschedules.domain.models.MissionDomainModel
import kotlinx.coroutines.flow.Flow

interface MissionRepository {
    suspend fun getMissionsList(): Flow<List<MissionDomainModel>>
}