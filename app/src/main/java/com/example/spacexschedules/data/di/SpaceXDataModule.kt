package com.example.spacexschedules.data.di

import com.example.spacexschedules.data.helpers.MissionHelper
import com.example.spacexschedules.data.repository.MissionRepositoryImpl
import com.example.spacexschedules.data.service.CurrentTimeServiceImpl
import com.example.spacexschedules.domain.repository.MissionRepository
import com.example.spacexschedules.domain.services.CurrentTimeService
import org.koin.dsl.module

val spaceXDataModule = module {
    single<CurrentTimeService> { CurrentTimeServiceImpl() }
    single<MissionRepository> { MissionRepositoryImpl(get()) }
    single<MissionHelper> { MissionHelper() }
}