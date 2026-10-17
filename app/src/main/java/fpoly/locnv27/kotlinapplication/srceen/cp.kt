package fpoly.locnv27.kotlinapplication.srceen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import fpoly.locnv27.kotlinapplication.R
import fpoly.locnv27.kotlinapplication.modo.Podut

@Composable
fun ListProductScreen() {

    val dummyProducts = listOf(
        Podut.Product(1, "MacBook Pro", "$1,299.00", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product (2, "iPhone 14", "$799.00", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(3, "Samsung Galaxy S23", "$899.00", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(4, "Sony WH-1000XM5", "$349.99", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(5, "iPad Air", "$599.00", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(6, "Apple Watch Ultra", "$799.00", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(7, "Canon EOS R5", "$3,899.00", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(8, "Logitech MX Keys", "$99.99", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(9, "Razer DeathAdder V3", "$69.99", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(10, "Dell UltraSharp U2723QE", "$549.99", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(11, "HP LaserJet Pro", "$199.99", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(12, "Google Pixel 7", "$599.00", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(13, "Bose SoundLink Revolve+", "$299.00", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(14, "Microsoft Surface Laptop 5", "$999.00", "https://i.imgur.com/rWSUcdc.jpeg"),
        Podut.Product(15, "OnePlus 11", "$699.00", "https://i.imgur.com/rWSUcdc.jpeg")
    )
    LazyColumn {
        items(dummyProducts.size) { index ->
            Row (modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                AsyncImage(
                    model = dummyProducts[index].image,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp))

                Column {
                    Text(text = "Ten : " + dummyProducts[index].name);
                    Text(text = "Price : "+  dummyProducts[index].price);
                }

            }

        }


    }

//    LazyColumn {
//        items(dummyProducts.size) { index ->
//            Row (modifier = Modifier.padding(16.dp),
//                verticalAlignment = Alignment.CenterVertically
//
//
//            ){
//                Image(
//                    painter = painterResource(id = R.drawable.log),
//                    contentDescription = null,
//                    modifier = Modifier.size(100.dp)
//                )
//                Column {
//                    Text(text = "Ten : " + dummyProducts[index].name);
//                    Text(text = "Price : "+  dummyProducts[index].price);
//
//
//                }
//            }
//
//        }
//
//
//    }



}


