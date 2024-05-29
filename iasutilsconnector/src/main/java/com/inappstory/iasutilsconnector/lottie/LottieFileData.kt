package com.inappstory.iasutilsconnector.lottie

class LottieFileData private constructor(
    private val type: String,
    private val cacheKey: String,
    private val data: Any
) : ILottieFileData {
    override fun type(): String? {
        return type
    }

    override fun cacheKey(): String {
        return cacheKey
    }

    override fun data(): Any {
        return data
    }
}