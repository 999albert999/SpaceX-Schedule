package com.example.spacexschedules.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.spacexschedules.domain.usecases.GetCurrentTimeUseCase
import com.example.spacexschedules.domain.usecases.GetMissionsListUseCase
import com.example.spacexschedules.presentation.contracts.MissionsContract
import com.example.spacexschedules.presentation.mapper.toPresentationModel
import kotlinx.coroutines.launch

class MainViewModel(private val getMissionsListUseCase: GetMissionsListUseCase, private val getCurrentTimeUseCase: GetCurrentTimeUseCase) :
    BaseViewModel<MissionsContract.Event, MissionsContract.State, MissionsContract.Effect>() {
    init {
        viewModelScope.launch {
            getCurrentTimeUseCase.invoke().collect { currentTime ->
                setState { copy(currentTime = currentTime) }
            }
        }
        viewModelScope.launch {
            getMissionsListUseCase.invoke().collect { missionsList ->
                setState { copy(missionsList = missionsList.map { it.toPresentationModel() }) }
            }
        }
    }

    override fun setInitialState(): MissionsContract.State {
        return MissionsContract.State.INITIAL
    }

    override fun handleEvents(event: MissionsContract.Event) {
        //there is no Events
    }
}