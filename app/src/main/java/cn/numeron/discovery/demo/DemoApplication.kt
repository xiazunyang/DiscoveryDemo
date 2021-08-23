package cn.numeron.discovery.demo

import android.app.Application
import cn.numeron.common.android.IInitiator
import cn.numeron.discovery.Discoveries

class DemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Discoveries.getAllInstances<IInitiator>().forEach {
            it.onInit(this)
        }
    }

}