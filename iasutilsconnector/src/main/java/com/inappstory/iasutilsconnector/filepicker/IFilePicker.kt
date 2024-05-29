package com.inappstory.iasutilsconnector.filepicker

import android.content.Context
import androidx.fragment.app.FragmentManager

interface IFilePicker {
    fun setPickerSettings(settings: String?)

    fun onBackPressed(): Boolean

    fun permissionResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    )

    fun show(
        context: Context?,
        fragmentManager: FragmentManager?,
        containerId: Int,
        callback: OnFilesChooseCallback?
    )

    fun close()
}