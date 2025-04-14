package com.example.myapplicatio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplicatio.ui.theme.MyApplicatioTheme
import androidx.compose.ui.unit.dp


class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicatioTheme {
                val inputText = intent.getStringExtra("input_text") ?: ""

                setContent {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Текст с первого экрана: $inputText",
                        )

                        Text(
                            text = "Количество символов: ${inputText.length}",
                        )
                    }
                }

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    MyApplicatioTheme {
        EditText()
    }
}