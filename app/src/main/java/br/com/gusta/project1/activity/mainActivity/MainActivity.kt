package br.com.gusta.project1.activity.mainActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import br.com.gusta.project1.activity.mainActivity.WorkoutDataProvider.getData
import br.com.gusta.project1.activity.mainActivity.components.MainBottomBar
import br.com.gusta.project1.activity.mainActivity.components.MainContent

class MainActivity : ComponentActivity() {
    private val workouts = getData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Scaffold(
                containerColor = Color(0XFF101322),
                bottomBar = { MainBottomBar() },
            ){ innerPadding ->
                MainContent(
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize(),
                    workouts = workouts
                )
            }
        }
    }
}

