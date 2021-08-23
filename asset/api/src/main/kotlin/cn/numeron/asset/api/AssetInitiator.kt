package cn.numeron.asset.api

import android.app.Application
import android.util.Log
import cn.numeron.common.android.IInitiator
import cn.numeron.discovery.Implementation

@Implementation
class AssetInitiator : IInitiator {

    override fun onInit(application: Application) {
        Log.e("AssetInitiator", "onInit application = [$application]")
    }

}