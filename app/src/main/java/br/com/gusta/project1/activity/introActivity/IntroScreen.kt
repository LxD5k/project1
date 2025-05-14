package br.com.gusta.project1.activity.introActivity

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.gusta.project1.R
import br.com.gusta.project1.activity.introActivity.components.IntroActionButton
import br.com.gusta.project1.activity.introActivity.components.IntroDescription
import br.com.gusta.project1.activity.introActivity.components.IntroFooter
import br.com.gusta.project1.activity.introActivity.components.IntroHeader

@Composable
fun IntroScreen(
    onStartClick: () -> Unit = {},
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.mainColor)),
    ) {
        item {
            IntroHeader()
            IntroDescription()
            IntroActionButton(onStartClick)
            IntroFooter()
        }
    }
}

@Preview
@Composable
private fun IntroScreenPreview() {
    IntroScreen()
}
