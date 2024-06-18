object runTimeCal {
    def main(args: Array[String]): Unit = { 
        val Ez1= 2
        val Temp = 3
        val Ez2 = 2
    
        val totEz = Ez1 + Ez2

        val paceEZ = 8
        val paceTempo = 7

        val timeEZ = paceEZ * totEz
        val timeTempo = paceTempo * Temp

        val totTime = timeEZ + timeTempo

        println(s"Total time taken to reach home $totTime")
    }
}