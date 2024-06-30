package to.msn.wings.hackathon_bata.ui.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import to.msn.wings.hackathon_bata.ui.theme.Hackathon_BATATheme


@Composable
fun NotUseButton(name:String = "need input"){
    OutlinedButton(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            //テキスト色設定⇒ContentColor
            contentColor = Color.Black,
            //背景色設定⇒ContainerColor
            containerColor = Color.White
        )
    ) {
        Text(
            text = name,
            fontSize = 12.sp,
        )
    }
}

@Composable
fun CatButton(
    name: String = "LoadFailed",
    id: Int,
    pictid: String = "",
    onClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val content = LocalContext.current
    val pictureID = content.resources.getIdentifier(pictid, "drawable", content.packageName)
    val picture = painterResource(pictureID)
    OutlinedButton(
        onClick = {onClick(id) },
        colors = ButtonDefaults.buttonColors(
            //テキスト色設定⇒ContentColor
            contentColor = Color.Black,
            //背景色設定⇒ContainerColor
            containerColor = Color.White

        )
    ) {
        Row(
            modifier = Modifier
                .padding(
                    top = 4.dp,
                    bottom = 4.dp,
                    start = 0.dp,
                    end = 0.dp
                )
                .height(14.dp)
                .width(40.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = name,
                fontSize = 10.sp,
            )
            Box{
                Image(
                    painter = picture,
                    contentDescription = null
                )

            }
        }
    }
}
@Preview
@Composable
fun SimpleButtonPreview (){
    Hackathon_BATATheme {
        Surface(
            //modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            CatButton(name = "test",id = 0,"stu",onClick = {})
        }
    }
}
@Composable
fun BlueButton(
    name: String = "LoadFailed",
    id: Int,
    onClick: (Int) -> Unit,
    modifier: Modifier = Modifier.fillMaxWidth()
) {
    OutlinedButton(
        modifier = Modifier.wrapContentWidth(),
        onClick = {onClick(id) },
        colors = ButtonDefaults.buttonColors(
            //テキスト色設定⇒ContentColor
            contentColor = Color.White,
            //背景色設定⇒ContainerColor
            containerColor = Color(25, 71, 136)//.hsl(215f,69f,32f)

        )
    ) {
        Text(
            text = name,
            fontSize = 12.sp,
        )
    }
}
@Composable
fun OrangeButton(
    name: String = "LoadFailed",
    id: Int,
    onClick: (Int) -> Unit,
    modifier: Modifier = Modifier.fillMaxWidth()
) {
    OutlinedButton(
        modifier = Modifier.wrapContentWidth(),
        onClick = {onClick(id) },
        colors = ButtonDefaults.buttonColors(
            //テキスト色設定⇒ContentColor
            contentColor = Color.White,
            //背景色設定⇒ContainerColor
            containerColor = Color(244, 131, 52)//.hsl(215f,69f,32f)

        )
    ) {
        Text(
            text = name,
            fontSize = 12.sp,
        )
    }
}

@Composable
fun SimpleButton(
    name: String = "LoadFailed",
    id: Int,
    onClick: (Int) -> Unit,
    modifier: Modifier = Modifier.fillMaxWidth()
) {
    OutlinedButton(
        modifier = Modifier.wrapContentWidth(),
        onClick = {onClick(id) },
        colors = ButtonDefaults.buttonColors(
            //テキスト色設定⇒ContentColor
            contentColor = Color.Black,
            //背景色設定⇒ContainerColor
            containerColor = Color.White

        )
    ) {
        Text(
            text = name,
            fontSize = 12.sp,
        )
    }
}
@Composable
fun AddButton(
    modifier: Modifier = Modifier
){

    FloatingActionButton(
        onClick = { /*TODO*/ }
    ) {
        Icon(Icons.Filled.Add, contentDescription = "Add")
    }
}
@Preview
@Composable
fun AddButtonPreview (){
    Hackathon_BATATheme {
        Surface(
            //modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            BlueButton(onClick = {},id = 1)
        }
    }
}

