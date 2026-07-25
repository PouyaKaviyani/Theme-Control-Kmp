package com.pouyakaviyani.themecontrolkmp.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.pouyakaviyani.themecontrolkmp.ThemeViewModel

@Composable
fun AppTheme(
    themeViewModel: ThemeViewModel,
    content: @Composable () -> Unit
) {
    // گوش دادن به تغییرات تم ذخیره شده
    val themeMode by themeViewModel.currentTheme.collectAsState()

    val isSystemDark = isSystemInDarkTheme()

    val colorScheme = when (themeMode) {
        ThemeType.System -> if (isSystemDark) DarkColorScheme else LightColorScheme
        ThemeType.Light -> LightColorScheme
        ThemeType.Dark -> DarkColorScheme
        ThemeType.Yalda -> YaldaColorScheme
        ThemeType.Winter -> WinterColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}