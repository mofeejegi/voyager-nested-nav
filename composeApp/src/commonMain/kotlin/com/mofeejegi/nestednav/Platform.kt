package com.mofeejegi.nestednav

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform