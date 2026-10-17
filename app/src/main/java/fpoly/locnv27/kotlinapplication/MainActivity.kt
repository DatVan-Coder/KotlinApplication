package fpoly.locnv27.kotlinapplication
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fpoly.locnv27.kotlinapplication.srceen.ListProductScreen
import fpoly.locnv27.kotlinapplication.srceen.LoginScreen
import fpoly.locnv27.kotlinapplication.ui.theme.CodeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable(route = "login") { LoginScreen(navController) }
        composable(route = "listproduct") { ListProductScreen(navController) }
        composable(route = "detail/{name}") { backStackEntry ->
            val name = backStackEntry.arguments?.getString(key = "name")
            val price = backStackEntry.arguments?.getString("price")
            name?.let { DetailSrcreen(name, price) }
        }
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CodeTheme {
        MyApp()
    }
}

