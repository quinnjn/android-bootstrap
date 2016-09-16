package com.neumiiller.bootstrap

import android.app.Application
import com.crashlytics.android.Crashlytics
import com.crashlytics.android.answers.Answers
import io.fabric.sdk.android.Fabric

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        connectCrashlytics()
    }

    private fun connectCrashlytics() {
        Fabric.with(this,
                Crashlytics(),
                Answers()
        )
    }
}