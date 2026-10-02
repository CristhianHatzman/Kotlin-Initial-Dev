package com.example.teste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.teste.exercicios.executarEx05
import com.example.teste.exercicios.executarEx06
import com.example.teste.exercicios.executarEx062
import com.example.teste.exercicios.executarEx07
import com.example.teste.exercicios.executarEx09
import com.example.teste.exercicios.executarEx10
import com.example.teste.model.AlunoNormal
import com.example.teste.ui.theme.TesteTheme
import com.example.teste.util.Transacao
import com.example.teste.util.emReais
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TesteTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    executarEx05()
                    executarEx07()
                    executarEx062()
                    executarEx09()
                    executarEx10()


                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

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
    TesteTheme {
        Greeting("Android")
    }
}

fun calcularIrrf(salarioBruto: Double?): Double {
    val salario = salarioBruto ?: 0.0

    val aliquota = when {
        salario <= 2259.20 -> 0.0
        salario <= 2826.65 -> 7.5
        else -> 15.0
    }

    return salario * (aliquota / 100)
}
