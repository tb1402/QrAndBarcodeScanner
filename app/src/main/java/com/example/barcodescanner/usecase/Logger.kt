package com.example.barcodescanner.usecase

import com.example.barcodescanner.BuildConfig

object Logger {
    var isEnabled = BuildConfig.ERROR_REPORTS_ENABLED_BY_DEFAULT

    fun log(error: Throwable) {
        if (isEnabled) {
            error.printStackTrace();
        }
    }
}