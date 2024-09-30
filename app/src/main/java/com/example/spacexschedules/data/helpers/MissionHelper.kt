package com.example.spacexschedules.data.helpers

import com.example.spacexschedules.data.models.MissionDataModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import java.text.SimpleDateFormat

private val dateFormat = SimpleDateFormat("dd.MM.yy")

class MissionHelper {
    private val _missionList: MutableStateFlow<List<MissionDataModel>> = MutableStateFlow(
        listOf(
            MissionDataModel(
                missionName = "FalconSat",
                date = dateFormat.parse("29.04.66")!!,
                details = "Engine failure at 33 seconds and loss of vehicle",
                status = MissionDataModel.Status.Fail()
            ),
            MissionDataModel(
                missionName = "Starlink-1",
                date = dateFormat.parse("11.11.20")!!,
                details = "First batch of operational Starlink satellites",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "Crew-1",
                date = dateFormat.parse("16.11.20")!!,
                details = "First operational crew mission to ISS",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "CRS-21",
                date = dateFormat.parse("06.12.20")!!,
                details = "Cargo resupply mission to the ISS",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "Transporter-1",
                date = dateFormat.parse("24.01.21")!!,
                details = "First dedicated rideshare mission",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "SN9",
                date = dateFormat.parse("02.02.21")!!,
                details = "Starship prototype test, exploded upon landing",
                status = MissionDataModel.Status.Fail()
            ),
            MissionDataModel(
                missionName = "Starlink-18",
                date = dateFormat.parse("04.02.21")!!,
                details = "Launch of 60 Starlink satellites",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "SN10",
                date = dateFormat.parse("03.03.21")!!,
                details = "Starship prototype test, soft landing but exploded",
                status = MissionDataModel.Status.Fail()
            ),
            MissionDataModel(
                missionName = "Starlink-22",
                date = dateFormat.parse("24.03.21")!!,
                details = "Launch of 60 Starlink satellites",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "Crew-2",
                date = dateFormat.parse("23.04.21")!!,
                details = "Second operational crew mission to ISS",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "SN11",
                date = dateFormat.parse("30.03.21")!!,
                details = "Starship prototype test, exploded mid-air",
                status = MissionDataModel.Status.Fail()
            ),
            MissionDataModel(
                missionName = "Transporter-2",
                date = dateFormat.parse("30.06.21")!!,
                details = "Second dedicated rideshare mission",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "Inspiration4",
                date = dateFormat.parse("16.09.21")!!,
                details = "First all-civilian mission to orbit",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "Starlink-29",
                date = dateFormat.parse("13.11.21")!!,
                details = "Launch of 53 Starlink satellites",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "CRS-24",
                date = dateFormat.parse("21.12.21")!!,
                details = "Cargo resupply mission to the ISS",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "Ax-1",
                date = dateFormat.parse("08.04.22")!!,
                details = "First all-private crew mission to ISS",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "Crew-3",
                date = dateFormat.parse("11.11.21")!!,
                details = "Third operational crew mission to ISS",
                status = MissionDataModel.Status.Success()
            ),
            MissionDataModel(
                missionName = "SN15",
                date = dateFormat.parse("05.05.21")!!,
                details = "Starship prototype test, successful soft landing",
                status = MissionDataModel.Status.Success()
            )
        )
    )

    fun getMissionList(): Flow<List<MissionDataModel>> {
        return _missionList
    }
}