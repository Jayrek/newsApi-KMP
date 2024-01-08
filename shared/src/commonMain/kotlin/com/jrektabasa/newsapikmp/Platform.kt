package com.jrektabasa.newsapikmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform