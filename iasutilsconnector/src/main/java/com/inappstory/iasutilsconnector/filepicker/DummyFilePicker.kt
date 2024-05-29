package com.inappstory.iasutilsconnector.filepicker

import android.content.Context
import androidx.fragment.app.FragmentManager

class DummyFilePicker : IFilePicker {
    override fun setPickerSettings(settings: FilePickerSettings?) {

    }


    override fun onBackPressed(): Boolean {
        return false
    }

    override fun permissionResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    ) {
    }

    override fun show(
        context: Context?,
        fragmentManager: FragmentManager?,
        containerId: Int,
        callback: OnFilesChooseCallback?
    ) {
    }

    override fun close() {}

}