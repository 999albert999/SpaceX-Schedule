package com.example.spacexschedules.data.service

import com.example.spacexschedules.domain.services.CurrentTimeService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class CurrentTimeServiceImpl : CurrentTimeService {
    override suspend fun getCurrentTime(): Flow<String> {
        val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

        return flow {
            while (true) {
                emit(timeFormat.format(Date()))
                kotlinx.coroutines.delay(1000)
            }
        }
    }
}