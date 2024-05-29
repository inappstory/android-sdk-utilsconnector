package com.inappstory.iasutilsconnector.filepicker

interface OnFilesChooseCallback {
    fun onChoose(cbName: String?, cbId: String?, filesWithTypes: Array<String?>?)

    fun onCancel(cbName: String?, cbId: String?)

    fun onError(cbName: String?, cbId: String?, reason: String?)
}