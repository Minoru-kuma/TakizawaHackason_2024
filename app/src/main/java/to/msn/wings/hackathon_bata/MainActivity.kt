package to.msn.wings.hackathon_bata

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import to.msn.wings.hackathon_bata.ui.MainScreen
import to.msn.wings.hackathon_bata.ui.component.AddButton
import to.msn.wings.hackathon_bata.ui.component.SearchField
import to.msn.wings.hackathon_bata.ui.component.TopPageBannar
import to.msn.wings.hackathon_bata.ui.theme.Hackathon_BATATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Hackathon_BATATheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    StartPage(
                        //name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun StartPage(modifier: Modifier = Modifier){
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        LazyColumn {
            item{
                TopPageBannar()
                SearchField()
                MainScreen()
            }
        }
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd) {
            AddButton()
        }
//        TopPageBannar()
//        SearchField()
//        MainScreen()
//        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd) {
//            AddButton()
//        }
        }
    }
//    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//        Greeting(
//            name = "Android",
//            modifier = Modifier.padding(innerPadding)
//        )
//    }



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Hackathon_BATATheme {
        StartPage()
    }
}