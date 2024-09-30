package com.example.spacexschedules.data.models

import java.util.Date

data class MissionDataModel(val missionName: String, val date: Date, val details: String, val status: Status) {
    sealed interface Status {
        val statusMessage: String

        data class Success(override val statusMessage: String = "Launch was successful") : Status
        data class Fail(override val statusMessage: String = "Launch failed") : Status
    }
}