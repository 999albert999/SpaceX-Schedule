package com.example.spacexschedules.presentation.mapper

import com.example.spacexschedules.domain.models.MissionDomainModel
import com.example.spacexschedules.presentation.model.MissionPresentationModel

fun MissionDomainModel.toPresentationModel() = MissionPresentationModel(
    missionName = missionName,
    date = date,
    details = details,
    status = status.statusMessage
)