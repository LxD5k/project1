package br.com.gusta.project1.activity.mainActivity.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import br.com.gusta.project1.R

@Composable
fun MainBottomBar() {
    NavigationBar(
        containerColor = colorResource(R.color.darkBlue),
    ) {
        val items = listOf(
            R.drawable.btn_1 to "Home",
            R.drawable.btn_2 to "Favorite",
            R.drawable.btn_3 to "Cart",
            R.drawable.btn_4 to "Profile",
        )
        items.forEach { (icon,label) ->
            NavigationBarItem(
                selected = false,
                onClick = {},
                icon = {
                  Icon(
                      painter = painterResource(icon),
                      contentDescription = label,
                      tint = Color.White,
                  )
                },
                label = {
                    Text(
                        text = label,
                        color = Color.White,
                        fontSize = 12.sp,
                    )
                }
            )
        }
    }
}
