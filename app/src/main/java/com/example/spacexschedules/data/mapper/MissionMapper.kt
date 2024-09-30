package com.example.spacexschedules.data.mapper

import com.example.spacexschedules.data.models.MissionDataModel
import com.example.spacexschedules.domain.models.MissionDomainModel
import java.text.SimpleDateFormat

private val dateFormat = SimpleDateFormat("dd.MM.yy")

fun MissionDataModel.toDomainModel() = MissionDomainModel(missionName = missionName, date = dateFormat.format(date), details = details, status = status.toDomainStatus())

fun MissionDataModel.Status.toDomainStatus() = when (this) {
    is MissionDataModel.Status.Fail -> MissionDomainModel.Status.Fail(statusMessage = statusMessage)
    is MissionDataModel.Status.Success -> MissionDomainModel.Status.Success(statusMessage = statusMessage)
}

fun MissionDomainModel.toDataModel() = MissionDataModel(missionName = missionName, date = dateFormat.parse(date)!!, details = details, status = status.toDataStatus())


fun MissionDomainModel.Status.toDataStatus() = when (this) {
    is MissionDomainModel.Status.Fail -> MissionDataModel.Status.Fail(statusMessage = statusMessage)
    is MissionDomainModel.Status.Success -> MissionDataModel.Status.Success(statusMessage = statusMessage)
}