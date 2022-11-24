package kr.handhug.hiltsample.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dagger.hilt.android.AndroidEntryPoint
import kr.handhug.hiltsample.env.Env
import javax.inject.Inject

@AndroidEntryPoint
class FeatureActivity : AppCompatActivity() {

    @Inject
    lateinit var env: Env

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)

        val textView = findViewById<TextView>(R.id.textView)

        textView.text = env.APPLICATION_ID
    }
}