package mx.edu.utxj.ti.idgs.tarea7_ddi_200070.presentation

data class WeatherResponse(
    val main: Main
)

data class Main(
    val temp: Float
)