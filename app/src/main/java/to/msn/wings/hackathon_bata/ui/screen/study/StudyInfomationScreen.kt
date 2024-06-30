package to.msn.wings.hackathon_bata.ui.screen.study

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import to.msn.wings.hackathon_bata.ui.component.SimpleButton
import to.msn.wings.hackathon_bata.ui.component.SubjectLLists
import to.msn.wings.hackathon_bata.ui.theme.Hackathon_BATATheme


@Composable
fun StudyInfomationScreen(
    modifier: Modifier = Modifier.fillMaxWidth(),
) {
    var selected by remember{
        mutableStateOf<Int?>(null)
    }
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row  (
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceEvenly,
        ){
            StudyInfomationButton(
                onClick = {selected = it}
            )
        }
        when(selected){
            0 ->
                ListPrevier("授業口コミ")
            1 ->
                ListPrevier("自主学習")
        }
    }

}
@Composable
fun StudyInfomationButton(
    modifier: Modifier = Modifier.fillMaxWidth(),
    onClick:(Int) -> Unit
) {
    Row(
        modifier = Modifier,
        horizontalArrangement = Arrangement.SpaceEvenly,
    ){
        SimpleButton(id = 0,name = "授業口コミ", onClick = onClick)
        SimpleButton(id = 1,name = "自主学習",onClick = onClick)
    }
}
//val assetsManager = main.assets
//val inputStream = assetsManager.open("info.json")
//val bufferedReader = BufferedReader(InputStreamReader(inputStream))
//val jsonString = bufferedReader.readText()

//var jsonObj = JSONObject(jsonString)
//var JSONArray = jsonObj.getJSONArray("Cariculam")
@Composable
fun ListPrevier(name:String){
    Column{//LazyColumn{
        for (i in 0..5){
            //Composableの中でコンポーネントを呼び出す->Itemを呼び出す
            //item{
                SubjectLLists(SubjectName = name)
            //}
        }
    }
}


@Preview(showBackground = true)
@Composable
fun StudyInfomationScreenPreview() {
    Hackathon_BATATheme {
        Surface(
            modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
            color = MaterialTheme.colorScheme.background
        ) {
            StudyInfomationScreen()
        }
    }
}