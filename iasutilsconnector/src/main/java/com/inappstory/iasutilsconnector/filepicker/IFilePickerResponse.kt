package com.inappstory.iasutilsconnector.filepicker

interface IFilePickerResponse {
    fun id(): String?
    fun cb(): String?
    fun accept(): String?
    fun multiple(): Boolean
    fun config(): String?
}