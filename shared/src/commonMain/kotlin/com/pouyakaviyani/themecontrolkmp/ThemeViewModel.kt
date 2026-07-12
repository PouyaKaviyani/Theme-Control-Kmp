package com.pouyakaviyani.themecontrolkmp

import com.pouyakaviyani.themecontrolkmp.theme.ThemeType
import com.russhwolf.settings.Settings
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ThemeViewModel {
    private val settings: Settings = Settings()
    private val themeKey = "selected_theme_mode"

    // خواندن مقدار ذخیره شده (پیش‌فرض روی SYSTEM)
    private val _currentTheme = MutableStateFlow(getSavedTheme())
    val currentTheme: StateFlow<ThemeType> = _currentTheme

    private fun getSavedTheme(): ThemeType {
        val savedName = settings.getString(themeKey, ThemeType.System.name)
        return try {
            ThemeType.valueOf(savedName)
        } catch (e: Exception) {
            ThemeType.System
        }
    }

    // ذخیره انتخاب جدید کاربر
    fun setTheme(mode: ThemeType) {
        settings.putString(themeKey, mode.name)
        _currentTheme.value = mode
    }
}