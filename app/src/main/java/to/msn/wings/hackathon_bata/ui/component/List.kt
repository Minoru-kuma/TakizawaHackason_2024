package to.msn.wings.hackathon_bata.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SubjectLLists(
    id: Int = 0,
    PhotoId: String = "group_18",
    SubjectName: String = "こともの",
    info: String = "ここに説明文を入力",
    semistor: String = "A期",
    timeschedule: Int = 0,
){
    val content = LocalContext.current
    val PictureID = content.resources.getIdentifier(PhotoId,"drawable",content.packageName)
    val Picture = painterResource(PictureID)
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.8f)

        ,
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    ){
        //Photo area
        Image(painter = Picture,contentDescription = null)

        Column(
            modifier = Modifier,
            //horizontalArrangement = Arrangement.SpaceEvenly,
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = SubjectName,
                fontSize = 20.sp)
            Text(text = info,
                fontSize = 8.sp)
            Row (
                modifier = Modifier,
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom,
            ){
                Text(text = semistor + " " + timeschedule.toString() + "限                 ",
                    fontSize = 12.sp)
                Box(modifier = Modifier.height(35.dp)){
                    SimpleButton(id = id,name = "詳細",onClick = {})

                }

            }
        }
    }
}

@Preview
(showBackground = true)

@Composable
fun SubjectListsPreview(){
    SubjectLLists()
}