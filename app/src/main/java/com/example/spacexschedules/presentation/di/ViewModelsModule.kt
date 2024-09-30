package com.example.spacexschedules.presentation.di

import com.example.spacexschedules.domain.usecases.GetCurrentTimeUseCase
import com.example.spacexschedules.domain.usecases.GetMissionsListUseCase
import com.example.spacexschedules.presentation.viewmodels.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val spaceXPresentationModule = module {
    viewModel<MainViewModel> { MainViewModel(get<GetMissionsListUseCase>(), get<GetCurrentTimeUseCase>()) }
}