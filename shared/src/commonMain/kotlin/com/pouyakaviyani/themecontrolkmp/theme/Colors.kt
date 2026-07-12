package com.pouyakaviyani.themecontrolkmp.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

// رنگ‌های پایه (می‌توانید تغییر دهید)
val BackgroundLight = Color(0xFFB4AC75)
val BackgroundDark = Color(0xFF312F2C)
val BackgroundYalda= Color(0xFF2C1A1A)
val BackgroundWinter = Color(0xFF0F1C2E)


val PrimaryLight = Color(0xFF213290)
val PrimaryDark = Color(0xFF363840)
val PrimaryYalda = Color(0xFFCC2A2A)
val PrimaryWinter = Color(0xFF4FC3F7)








val LightColorScheme = lightColorScheme(
    background = BackgroundLight,
    primary = PrimaryLight
)

val DarkColorScheme = darkColorScheme(
    background = BackgroundDark,
    primary = PrimaryDark
)

val YaldaColorScheme = darkColorScheme(
    background = BackgroundYalda,
    primary = PrimaryYalda
)

val WinterColorScheme = darkColorScheme(
    background = BackgroundWinter,
    primary = PrimaryWinter
)