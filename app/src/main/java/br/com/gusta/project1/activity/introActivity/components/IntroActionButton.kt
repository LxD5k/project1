package br.com.gusta.project1.activity.introActivity.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.gusta.project1.R

@Composable
fun IntroActionButton(
    onStartClick: () -> Unit = {},
){
    Button(
        onClick = onStartClick,
        shape = RoundedCornerShape(100.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(R.color.orange),
        ),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(50.dp),
    ) {
        Text(
            text = "Let's go",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
        )
    }
}

@Preview
@Composable
private fun IntroActionButtonPreview() {
    IntroActionButton()
}
