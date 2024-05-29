package com.inappstory.iasutilsconnector.lottie

import android.content.Context

class DummyLottieViewGenerator : ILottieViewGenerator {
    override fun getView(context: Context?): ILottieView? {
        return null
    }
}