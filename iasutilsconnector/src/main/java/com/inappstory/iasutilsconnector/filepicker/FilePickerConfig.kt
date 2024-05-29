package com.inappstory.iasutilsconnector.filepicker

class FilePickerConfig {
    var filePickerImageMaxSizeInBytes: Long? = 30000000L
    var filePickerVideoMaxSizeInBytes: Long? = 30000000L
    var filePickerVideoMaxLengthInSeconds: Long? = 30L
    var filePickerFilesLimit: Int? = 10
    var messages: Map<String, String>? = hashMapOf()
}