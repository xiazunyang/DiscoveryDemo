package cn.numeron.common.android

import cn.numeron.discovery.Discoverable

@Discoverable
interface IGraph {

    val id: Int

    val graphResId: Int

}