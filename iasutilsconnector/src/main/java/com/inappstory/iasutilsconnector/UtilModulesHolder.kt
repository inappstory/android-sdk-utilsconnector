package com.inappstory.iasutilsconnector

import android.util.Log
import com.inappstory.iasutilsconnector.filepicker.DummyFilePicker
import com.inappstory.iasutilsconnector.filepicker.IFilePicker
import com.inappstory.iasutilsconnector.lottie.DummyLottieViewGenerator
import com.inappstory.iasutilsconnector.lottie.ILottieViewGenerator

class UtilModulesHolder {
    var lottieViewGenerator: ILottieViewGenerator = DummyLottieViewGenerator()
    var filePicker: IFilePicker = DummyFilePicker()

    fun hasFilePickerModule(): Boolean {
        return filePicker !is DummyFilePicker
    }

    fun hasLottieModule(): Boolean {
        return lottieViewGenerator !is DummyLottieViewGenerator
    }

    fun initModules() {
        initModule("com.inappstory.utils.iasfilepicker", "FilePickerCore")
        initModule("com.inappstory.utils.iaslottie", "LottieViewCore")
    }

    private fun initModule(packageName: String, className: String) {
        try {
            val clazz = Class.forName("$packageName.$className")
            val newInstance = clazz.newInstance()
            if (newInstance is ModuleInitializer) {
                newInstance.initialize()
                Log.d("MethodsInitialize", "Success $className")
            } else {
                Log.d("MethodsInitialize", "Error $className")
            }
        } catch (e: Exception) {
            Log.d("MethodsInitialize", "Error $className")
        }
    }
}