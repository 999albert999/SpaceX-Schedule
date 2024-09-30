package com.example.spacexschedules.domain.models

data class MissionDomainModel(val missionName: String, val date: String, val details: String, val status: Status) {
    sealed interface Status {
        val statusMessage: String

        data class Success(override val statusMessage: String = "Launch was successful") : Status
        data class Fail(override val statusMessage: String = "Launch failed") : Status
    }
}