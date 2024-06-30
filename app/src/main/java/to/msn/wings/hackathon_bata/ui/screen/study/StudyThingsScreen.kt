package to.msn.wings.hackathon_bata.ui.screen.study

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import to.msn.wings.hackathon_bata.ui.component.NotUseButton

@Composable
fun StudyThingsScreen(
    modifier: Modifier = Modifier
){
    Column {
        Row (
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceEvenly,
        ){
            NotUseButton("買う")
        }
        //Text(text = "買う")
    }
}