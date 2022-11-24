package kr.handhug.hiltsample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        BuildConfig.BUILD_TYPE
    }
}