package cn.numeron.asset.api

import cn.numeron.discovery.Discoverable

@Discoverable
interface IAssetService {

    suspend fun getAssetById(id: String): Asset

    suspend fun getAssetList(): List<Asset>

}