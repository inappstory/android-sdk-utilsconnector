package com.inappstory.iasutilsconnector.lottie

interface ILottieFileData {
    fun type(): String?
    fun cacheKey(): String?
    fun data(): Any?
}