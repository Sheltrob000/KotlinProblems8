fun main() {
    cityWeather("Ankara", 27, 31, 82)
    cityWeather("Tokyo", 32, 36, 10)
    cityWeather("cape Town", 59, 64, 2)
    cityWeather("Guatemala City", 50, 55, 7)
}

fun cityWeather(city :String, tempLow :Int, tempHigh :Int, rainchance: Int){
    println("city: $city")
    println("Low temperature: $tempLow, High temperature: $tempHigh")
    println("Chance of rain: $rainchance%")
    println("")




}