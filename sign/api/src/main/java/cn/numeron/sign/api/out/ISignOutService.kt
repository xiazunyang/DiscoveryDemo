package cn.numeron.sign.api.out

import android.content.Context
import cn.numeron.discovery.Discoverable

@Discoverable
interface ISignOutService {

    suspend fun signOut()

}