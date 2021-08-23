package cn.numeron.sign.impl.out

import androidx.core.content.edit
import cn.numeron.discovery.Implementation
import cn.numeron.sign.api.out.ISignOutService
import cn.numeron.sign.api.signSharedPref

@Implementation
class SignOutServiceImpl : ISignOutService {

    override suspend fun signOut() {
        signSharedPref.edit {
            remove("is_sign_in")
        }
    }

}