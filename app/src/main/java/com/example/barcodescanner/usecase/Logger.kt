package com.example.barcodescanner.usecase

object Logger {
    fun log(error: Throwable) {
        error.printStackTrace();
    }
}