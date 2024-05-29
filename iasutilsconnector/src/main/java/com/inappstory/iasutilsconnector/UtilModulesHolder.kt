package com.inappstory.iasutilsconnector

import android.util.Log
import com.inappstory.iasutilsconnector.filepicker.DummyFilePicker
import com.inappstory.iasutilsconnector.filepicker.IFilePicker
import com.inappstory.iasutilsconnector.json.DummyJsonParser
import com.inappstory.iasutilsconnector.json.IJsonParser
import com.inappstory.iasutilsconnector.lottie.DummyLottieViewGenerator
import com.inappstory.iasutilsconnector.lottie.ILottieViewGenerator

object UtilModulesHolder {
    var lottieViewGenerator: ILottieViewGenerator = DummyLottieViewGenerator()
    var filePicker: IFilePicker = DummyFilePicker()
    var jsonParser: IJsonParser = DummyJsonParser()

    init {
        initModules()
    }

    fun hasFilePickerModule(): Boolean {
        return filePicker !is DummyFilePicker
    }

    fun hasLottieModule(): Boolean {
        return lottieViewGenerator !is DummyLottieViewGenerator
    }

    private fun initModules() {
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