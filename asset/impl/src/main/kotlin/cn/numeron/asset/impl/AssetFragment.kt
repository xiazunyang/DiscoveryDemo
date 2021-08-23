package cn.numeron.asset.impl

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import cn.numeron.discovery.Discoveries
import cn.numeron.sign.api.`in`.ISignInService
import kotlinx.coroutines.launch

class AssetFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycleScope.launch {
            val signInService = Discoveries.getInstance<ISignInService>()
            if (!signInService.isSignIn(requireContext())) {
                AlertDialog.Builder(requireContext())
                    .setTitle("提示")
                    .setCancelable(false)
                    .setMessage("请登录后重试。")
                    .setPositiveButton("登录") { _, _ ->
                        activity?.finish()
                    }
                    .show()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val textView = TextView(container?.context)
        textView.gravity = Gravity.CENTER
        textView.text = "已登录"
        return textView
    }

}