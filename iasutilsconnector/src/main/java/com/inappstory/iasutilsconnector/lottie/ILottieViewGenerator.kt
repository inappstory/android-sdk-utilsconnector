package com.inappstory.iasutilsconnector.lottie

import android.content.Context

interface ILottieViewGenerator {
    fun getView(context: Context?): ILottieView?
}