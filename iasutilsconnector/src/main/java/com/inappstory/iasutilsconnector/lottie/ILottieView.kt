package com.inappstory.iasutilsconnector.lottie

interface ILottieView {
    fun setSource(source: Any?)
    fun play()
    fun stop()
    fun pause()
    fun resume()
    fun restart()
    val isLooped: Boolean
    fun setAnimProgress(progress: Float)
    fun setLoop(isLooped: Boolean)
}