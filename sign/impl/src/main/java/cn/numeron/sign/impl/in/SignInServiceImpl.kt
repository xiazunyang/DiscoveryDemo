package cn.numeron.sign.impl.`in`

import android.content.Context
import androidx.core.content.edit
import cn.numeron.discovery.Implementation
import cn.numeron.sign.api.`in`.ISignInService
import cn.numeron.sign.api.signSharedPref
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

@Implementation
class SignInServiceImpl : ISignInService {

    override suspend fun isSignIn(context: Context): Boolean {
        return suspendCoroutine {
            val isSignIn = signSharedPref.getBoolean("is_sign_in", false)
            it.resume(isSignIn)
        }
    }

    override suspend fun signInByPassword(username: String, password: String) {
        return signSharedPref.edit {
            putBoolean("is_sign_in", true)
        }
    }

}