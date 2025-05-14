package br.com.gusta.project1.activity.introActivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import br.com.gusta.project1.MainActivity

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroScreen(
                onStartClick = {
                    startActivity(Intent(this, MainActivity::class.java))
                }
            )
        }
    }
}
