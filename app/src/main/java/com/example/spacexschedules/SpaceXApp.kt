package com.example.spacexschedules

import android.app.Application
import com.example.spacexschedules.data.di.spaceXDataModule
import com.example.spacexschedules.domain.di.spaceXDomainModule
import com.example.spacexschedules.presentation.di.spaceXPresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class SpaceXApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@SpaceXApp)
            modules(spaceXDataModule, spaceXDomainModule, spaceXPresentationModule)
        }
    }

}