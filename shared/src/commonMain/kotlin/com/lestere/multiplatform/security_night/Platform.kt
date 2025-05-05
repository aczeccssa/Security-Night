package com.lestere.multiplatform.security_night

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform