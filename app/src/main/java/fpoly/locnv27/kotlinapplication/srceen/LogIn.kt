package fpoly.locnv27.kotlinapplication.srceen
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import fpoly.locnv27.kotlinapplication.R
import fpoly.locnv27.kotlinapplication.dialog.DialogLogin

@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val mContext = LocalContext.current

    var isShowDialog by remember { mutableStateOf(false) }
    var title by remember { mutableStateOf("") }

    DialogLogin (title = title, isShow = isShowDialog, onDismiss = { isShowDialog = false })

    Column(
        modifier = Modifier
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center
    )
    {

        Image(
            painter = painterResource(id = R.drawable.images),
            contentDescription = "",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(200.dp)
                .align(Alignment.CenterHorizontally)
                .clip(CircleShape)
                .border(1.dp, Color.Red, shape = CircleShape)
        )

        Text(
            text = "Hello, Android!",
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        )
        TextField(
            value = "$username",
            onValueChange = { text -> username = text },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp)


        )
        TextField(
            value = "$password",
            onValueChange = { text -> password = text },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp, top = 20.dp)

        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.Center

        ) {
            Button(

                modifier = Modifier
                    .padding(end = 10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                shape = RoundedCornerShape(10.dp),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 15.dp,
                    disabledElevation = 0.dp
                ),
                onClick = {
                    if (username == "1" && password == "1") {
                        title = "login thanh cong";
                    } else title = "login that bai"
                    isShowDialog = true
                },

                ) {
                Image(
                    painter = painterResource(id = R.drawable.log),
                    contentDescription = "login",
                    modifier = Modifier
                        .padding(end = 20.dp)
                        .size(25.dp)

                )
                Text(text = "Login")
            }
            Button(
                shape = CutCornerShape(10.dp),
                onClick = { },

                ) {
                Image(
                    painter = painterResource(id = R.drawable.log),
                    contentDescription = "canel",

                    modifier = Modifier
                        .padding(end = 20.dp)
                        .size(25.dp)

                )
                Text(text = "Canel")
            }
        }

    }
}
