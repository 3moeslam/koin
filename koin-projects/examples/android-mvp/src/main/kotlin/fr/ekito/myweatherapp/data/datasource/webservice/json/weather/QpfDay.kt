package fr.ekito.myweatherapp.data.datasource.webservice.json.weather

import com.google.gson.annotations.Expose

data class QpfDay(
        @Expose var `in`: Double? = null,
        @Expose var mm: Int? = null
)
