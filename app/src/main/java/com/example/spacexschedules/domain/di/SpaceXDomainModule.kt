package com.example.spacexschedules.domain.di

import com.example.spacexschedules.domain.repository.MissionRepository
import com.example.spacexschedules.domain.services.CurrentTimeService
import com.example.spacexschedules.domain.usecases.GetCurrentTimeUseCase
import com.example.spacexschedules.domain.usecases.GetCurrentTimeUseCaseImpl
import com.example.spacexschedules.domain.usecases.GetMissionsListUseCase
import com.example.spacexschedules.domain.usecases.GetMissionsListUseCaseImpl
import org.koin.dsl.module

val spaceXDomainModule = module {
    factory<GetCurrentTimeUseCase> { GetCurrentTimeUseCaseImpl(get<CurrentTimeService>()) }
    factory<GetMissionsListUseCase> { GetMissionsListUseCaseImpl(get<MissionRepository>()) }
}