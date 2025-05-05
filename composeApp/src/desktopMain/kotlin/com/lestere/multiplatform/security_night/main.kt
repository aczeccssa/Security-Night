package com.lestere.multiplatform.security_night

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "SecurityNight",
    ) {
        App()
    }
}