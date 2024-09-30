package com.example.spacexschedules.presentation.contracts

import com.example.spacexschedules.presentation.model.MissionPresentationModel
import com.example.spacexschedules.presentation.viewmodels.ViewEffect
import com.example.spacexschedules.presentation.viewmodels.ViewEvent
import com.example.spacexschedules.presentation.viewmodels.ViewState

class MissionsContract {
    sealed class Event : ViewEvent {
        //there is no Events in this app
    }

    data class State(val missionsList: List<MissionPresentationModel>, val currentTime: String) : ViewState {
        companion object {
            val INITIAL = State(missionsList = emptyList(), currentTime = "")
        }
    }

    sealed class Effect : ViewEffect {
    }
}