package fpoly.locnv27.kotlinapplication.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun DialogDelete(isShow: Boolean, onDismiss:()->Unit, onConfirm:()->Unit) {
    if(isShow){
        Dialog(onDismissRequest = {}) {
            Card(
                modifier = Modifier.fillMaxWidth()
                    .height(200.dp),
                shape = CutCornerShape(10.dp),

                ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround
                ){
                    Text(
                        text = "Ban co muon xoa that khong?",
                        fontSize = 20.sp,
                        maxLines = 1,
                        fontWeight = FontWeight.Bold)
                    Row(Modifier.fillMaxWidth()) {
                        Button(onClick = onDismiss,
                            modifier = Modifier.padding(end = 10.dp),
                            shape = CutCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)) {
                            Text("Ok")
                        }
                        Button(onClick = onDismiss,
                            modifier = Modifier.padding(end = 10.dp),
                            shape = CutCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)) {
                            Text("Cancle")
                        }
                    }

                }
            }
        }
    }
}
