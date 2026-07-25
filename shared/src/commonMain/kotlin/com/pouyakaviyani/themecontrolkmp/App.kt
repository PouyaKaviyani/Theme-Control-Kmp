package com.pouyakaviyani.themecontrolkmp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.pouyakaviyani.themecontrolkmp.theme.AppTheme
import com.pouyakaviyani.themecontrolkmp.theme.ThemeType

@Composable
fun App() {
    val themeViewModel = remember { ThemeViewModel() }
    AppTheme(themeViewModel = themeViewModel) {
        SettingsScreen(themeViewModel = themeViewModel)
    }
}

@Composable
fun SettingsScreen(themeViewModel: ThemeViewModel) {
    val currentTheme by themeViewModel.currentTheme.collectAsState()

    Scaffold(
        containerColor = MaterialTheme.colorScheme.background
    ){ innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = currentTheme.name,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleLarge
            )

            Button(onClick = { themeViewModel.setTheme(ThemeType.Light) }) {
                Text(
                    text = "حالت روشن",
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontWeight = FontWeight.ExtraBold
                    )
                )
            }

            Button(onClick = { themeViewModel.setTheme(ThemeType.Dark) }) {
                Text(
                    text = "حالت تاریک",
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Button(onClick = { themeViewModel.setTheme(ThemeType.System) }) {
                Text(
                    text = "پیروی از سیستم",
                    style = MaterialTheme.typography.titleSmall
                )
            }

            Button(onClick = { themeViewModel.setTheme(ThemeType.Yalda) }) {
                Text(
                    text = "یلدا",
                    style = MaterialTheme.typography.bodyLarge
                )
            }

            Button(onClick = { themeViewModel.setTheme(ThemeType.Winter) }) {
                Text(
                    text = "زمستان",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }

}