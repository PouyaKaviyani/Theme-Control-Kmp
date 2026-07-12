package com.pouyakaviyani.themecontrolkmp.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import themecontrolkmp.shared.generated.resources.IRAN_Sans
import themecontrolkmp.shared.generated.resources.Res

val iranSans @Composable get() = FontFamily(
    Font(
        resource = Res.font.IRAN_Sans,
        weight = FontWeight.Normal
    )
)

val Typography: Typography @Composable get() = Typography(
    bodySmall = TextStyle(
        fontFamily = iranSans,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 20.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = iranSans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = iranSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    titleSmall = TextStyle(
        fontFamily = iranSans,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 20.sp
    ),
    titleMedium = TextStyle(
        fontFamily = iranSans,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 36.sp
    ),
    titleLarge = TextStyle(
        fontFamily = iranSans,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 36.sp
    )
)