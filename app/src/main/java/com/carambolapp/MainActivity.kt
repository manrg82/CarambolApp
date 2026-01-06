package com.carambolapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Label
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.carambolapp.ui.theme.CarambolappTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarambolappTheme {
                Scaffold(
                    containerColor = MaterialTheme.colorScheme.background
                ) { padding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(padding)
                            .padding(horizontal = 24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Header()
                        Spacer(modifier = Modifier.height(48.dp))
                        Registro()
                    }
                }
            }
        }
    }

    @Composable
    fun Header() {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logoappfin),
                contentDescription = "Carambol Logo",
                modifier = Modifier.size(80.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Text(
                text = "CarambolApp",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }

    @Composable
    fun DescriptionText() {
        Text(
            text = "Descubre innumerables recetas, gestiona tu despensa de forma inteligente y apoya al comercio local desde nuestra aplicación.",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center

        )
    }

    @Composable
    fun StartButton() {
        Button(
            onClick = { /* MANDAR A LOGIN */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Empezar",
                style = MaterialTheme.typography.titleMedium
            )
        }
    }

    @Composable
    fun CampoTexto(
        label: String,
        isPassword: Boolean = false
    ) {
        Text(
            text = label,
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = if (isPassword)
                PasswordVisualTransformation()
            else
                VisualTransformation.None
        )
    }


    @Composable
    fun Registro(modifier: Modifier = Modifier) {
        Column(
            modifier = modifier.fillMaxWidth()
        ) {

            Text(
                text = "Registrarse",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center
            )

            Text(
                text = "¿Ya registrado? Iniciar sesión",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center
            )


            CampoTexto(label = "Nombre")

            Spacer(modifier = Modifier.height(12.dp))

            CampoTexto(label = "Correo")

            Spacer(modifier = Modifier.height(12.dp))

            CampoTexto(
                label = "Contraseña",
                isPassword = true
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Fecha de nacimiento",
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(4.dp))

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text("Seleccionar")
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = null
                    )
                }
            )
            Button(
                onClick = { /* MANDAR A LOGIN (Para iniciar sesión) */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(
                    text = "Registrarse",
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }

    }

}


