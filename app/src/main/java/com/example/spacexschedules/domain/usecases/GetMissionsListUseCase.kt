package com.example.spacexschedules.domain.usecases

import com.example.spacexschedules.domain.models.MissionDomainModel
import com.example.spacexschedules.domain.repository.MissionRepository
import kotlinx.coroutines.flow.Flow

interface GetMissionsListUseCase {
    suspend fun invoke(): Flow<List<MissionDomainModel>>
}

class GetMissionsListUseCaseImpl(private val repository: MissionRepository) : GetMissionsListUseCase {
    override suspend fun invoke(): Flow<List<MissionDomainModel>> = repository.getMissionsList()

}