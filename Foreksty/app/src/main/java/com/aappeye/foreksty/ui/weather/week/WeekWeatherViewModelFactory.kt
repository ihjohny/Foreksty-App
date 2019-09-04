package com.aappeye.foreksty.ui.weather.week

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aappeye.foreksty.data.provider.SettingsProvider
import com.aappeye.foreksty.data.repository.ForecastRepository

class WeekWeatherViewModelFactory(
    private val forecastRepository: ForecastRepository,
    private val settingsProvider: SettingsProvider
) : ViewModelProvider.NewInstanceFactory(){
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return WeekWeatherViewModel(forecastRepository, settingsProvider) as T
    }
}