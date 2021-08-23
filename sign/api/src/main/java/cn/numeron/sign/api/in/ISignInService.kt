package cn.numeron.sign.api.`in`

import android.content.Context
import android.nfc.Tag
import cn.numeron.discovery.Discoverable

@Discoverable
interface ISignInService {

    /** 判断当前是否已登录 */
    suspend fun isSignIn(context: Context): Boolean

    /** 通过用户名和密码进行登录 */
    suspend fun signInByPassword(username: String, password: String)

}