package to.msn.wings.hackathon_bata.ui.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import to.msn.wings.hackathon_bata.ui.component.SimpleButton
import to.msn.wings.hackathon_bata.ui.screen.study.StudyInfomationScreen
import to.msn.wings.hackathon_bata.ui.screen.study.StudyThingsScreen
import to.msn.wings.hackathon_bata.ui.theme.Hackathon_BATATheme

@Composable
fun SelectScreen(
    id: Int? = 0,
    modifier: Modifier = Modifier.fillMaxWidth(),
) {

    var selected by remember{
        mutableStateOf<Int?>(null)
    }
    Column (
        modifier = Modifier,
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            SelectButton(
                onClick = { selected = it }
            )
        }
        when (selected) {
            0 -> when (id){
                0-> StudyThingsScreen()
                1-> Text(text = "1")
                2-> Text(text = "2")
                3-> Text(text = "3")
                else -> Text(text = "else")
            }
            1 -> when (id){
                0-> StudyInfomationScreen()
                1-> Text(text = "1")
                2-> Text(text = "2")
                3-> Text(text = "3")
                else -> Text(text = "else")
            }

        }
    }

}

@Composable
fun SelectButton(
    modifier: Modifier = Modifier.fillMaxWidth(),
    onClick: (Int) -> Unit,

) {

    Row (
        modifier = Modifier,
        horizontalArrangement = Arrangement.SpaceEvenly,
    ){
        SimpleButton("   もの   ",1, onClick,Modifier.fillMaxWidth(0.5f))//もの
        Text(text = "                              ")
        SimpleButton("   こと   ",0, onClick,Modifier.fillMaxWidth(0.5f))//こと
        //Text(text = "\n")

    }

}


@Preview(showBackground = true)
@Composable
fun StudySelectScreenPreview() {
    Hackathon_BATATheme {
        Surface(
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            color = MaterialTheme.colorScheme.background
        ) {
            //SampleScreen()
            SelectScreen()
        }
    }
}