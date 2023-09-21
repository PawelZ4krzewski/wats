package com.example.wats

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform