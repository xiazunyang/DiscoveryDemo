package cn.numeron.common.android

import android.app.Application
import cn.numeron.discovery.Discoverable

@Discoverable
interface IInitiator {

    fun onInit(application: Application)

}