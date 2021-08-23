package cn.numeron.asset.impl

import android.os.Bundle
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class AssetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val frameLayout = FrameLayout(this)
        frameLayout.id = R.id.frame_layout
        setContentView(frameLayout, ViewGroup.LayoutParams(-1, -1))

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, AssetFragment())
            .commit()

    }

}