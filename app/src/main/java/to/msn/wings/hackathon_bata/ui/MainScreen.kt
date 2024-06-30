package to.msn.wings.hackathon_bata.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import to.msn.wings.hackathon_bata.ui.common.SelectScreen
import to.msn.wings.hackathon_bata.ui.component.CatButton
import to.msn.wings.hackathon_bata.ui.theme.Hackathon_BATATheme

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
){
    var selected by remember{
        mutableStateOf<Int?>(null)
    }

    Column  (
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        ChangeFuncButtons(
            onClick = {selected = it}
        )
        selected?.let {
            //Text(text = it.toString())
        }
        when(selected){
            //0 -> StudySelectScreen()
            0-> SelectScreen(id = selected)
            1-> SelectScreen(id = selected)
            2-> SelectScreen(id = selected)
            3   -> SelectScreen(id = selected)


        }
    }
}

@Composable
fun ChangeFuncButtons(
    modifier: Modifier = Modifier,
    onClick: (Int) -> Unit
){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        CatButton("学習",0,"stu",onClick)
        CatButton("活動",1,"act",onClick)
        CatButton("生活",2,"life",onClick)
        CatButton("仕事",3,"work",onClick)
    }
}


@Preview(showBackground = true)
@Composable
fun SampleScreenPreview(){
    Hackathon_BATATheme {
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = MaterialTheme.colorScheme.background
        ) {
            //SampleScreen()
            MainScreen()
        }
    }
}