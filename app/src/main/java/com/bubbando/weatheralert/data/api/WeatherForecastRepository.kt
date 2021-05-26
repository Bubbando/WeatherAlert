package com.bubbando.weatheralert.data.api

import com.bubbando.weatheralert.data.model.ForecastJSON

interface Repository {
    fun getForecastItemsFromLocation(location: String): List<ForecastJSON>
}