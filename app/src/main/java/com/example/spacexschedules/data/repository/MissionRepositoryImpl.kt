package com.example.spacexschedules.data.repository

import com.example.spacexschedules.data.helpers.MissionHelper
import com.example.spacexschedules.data.mapper.toDomainModel
import com.example.spacexschedules.domain.models.MissionDomainModel
import com.example.spacexschedules.domain.repository.MissionRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class MissionRepositoryImpl(private val missionHelper: MissionHelper) : MissionRepository {
    override suspend fun getMissionsList(): Flow<List<MissionDomainModel>> =
        withContext(context = Dispatchers.IO) {
            missionHelper.getMissionList().map { flow -> flow.map { it.toDomainModel() } }
        }

}