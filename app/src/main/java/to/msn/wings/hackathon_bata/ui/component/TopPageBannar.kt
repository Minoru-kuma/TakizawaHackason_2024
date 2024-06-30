package to.msn.wings.hackathon_bata.ui.component

//import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import to.msn.wings.hackathon_bata.R
import to.msn.wings.hackathon_bata.ui.theme.Hackathon_BATATheme


@Composable
fun TopPageBannar(modifier: Modifier = Modifier){
    Box {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .padding()
                .fillMaxWidth()
                .displayCutoutPadding(),
            horizontalArrangement = Arrangement.Center,
            //content = {},
        ) {
            val image = painterResource(id = R.drawable.group_18__1_)

            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
            )
        }

        Row(
            modifier = Modifier
                .padding(10.dp)
                .padding()
                .fillMaxWidth()
                .displayCutoutPadding(),
            horizontalArrangement = Arrangement.End,
            //content = {},
        ) {
            //val image = painterResource(id = R.drawable.group_18__1_)
            val SetIcon = painterResource(id = R.drawable.component_1__1_)

            Image(
                painter = SetIcon,
                contentDescription = null,
                modifier = Modifier
            )
        }
    }
}

@Preview
(showBackground = true)
@Composable
fun TopPageBannarPreview(){
    Hackathon_BATATheme {
        Surface(
            //modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            TopPageBannar()
        }
    }
}