package cn.numeron.sign.api

import android.app.Application
import android.content.Context
import android.util.Log
import cn.numeron.common.android.IInitiator
import cn.numeron.discovery.Implementation

@Implementation
class SignInitiator : IInitiator {

    override fun onInit(application: Application) {
        Log.e("SignInitiator", "onInit application = [$application]")
        signSharedPref = application.getSharedPreferences("sign_in", Context.MODE_PRIVATE)
    }

}