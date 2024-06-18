object tempConverter {
    def main(args: Array[String]): Unit = {
        val celcius = 35
        val fahrenheit = cToF(celcius)
        println(s"The temperaturs is equal to $fahrenheit cleaF")
    }

    def cToF(celcius: Double): Double = {
        celcius * 1.8 + 32
    }
}