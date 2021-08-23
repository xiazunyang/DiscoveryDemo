package cn.numeron.asset.impl

import androidx.lifecycle.ViewModel
import cn.numeron.asset.api.Asset
import cn.numeron.asset.api.IAssetService
import cn.numeron.discovery.Implementation
import java.io.Serializable

@Implementation
class AssetRepository: ViewModel(), IAssetService, Runnable, Serializable {

    override suspend fun getAssetById(id: String): Asset {
        return Asset(id, "资产A12", null, null)
    }

    override suspend fun getAssetList(): List<Asset> {
        return emptyList()
    }

    override fun run() {
        TODO("Not yet implemented")
    }

}