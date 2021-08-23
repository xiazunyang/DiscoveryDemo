package cn.numeron.discovery.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import cn.numeron.asset.api.IAssetService
import cn.numeron.asset.impl.AssetActivity
import cn.numeron.discovery.Discoveries
import cn.numeron.sign.api.`in`.ISignInService
import cn.numeron.sign.api.out.ISignOutService
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.sign_in_button -> {
                lifecycleScope.launch {
                    val iSignInService = Discoveries.getInstance<ISignInService>()
                    iSignInService.signInByPassword("username", "password")
                    if (iSignInService.isSignIn(view.context)) {
                        Toast.makeText(view.context, "登录成功", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            R.id.sign_out_button -> {
                lifecycleScope.launch {
                    val iSignOutService = Discoveries.getInstance<ISignOutService>()
                    iSignOutService.signOut()
                    Toast.makeText(view.context, "注销成功", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.asset_page -> {
                startActivity(Intent(this, AssetActivity::class.java))
            }
        }
    }

}