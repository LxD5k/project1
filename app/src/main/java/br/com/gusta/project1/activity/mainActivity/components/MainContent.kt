package br.com.gusta.project1.activity.mainActivity.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.gusta.project1.activity.model.Workout

@Composable
fun MainContent(
    modifier: Modifier = Modifier,
    workouts: List<Workout>,
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState()),
    ){
        Spacer(Modifier.height(16.dp))
        Header()
    }
}
