object sphereVolume {
    def main(args: Array[String]): Unit = {
        val radius = 5
        val volume = calSphereVol(radius)
        println(s"Voulme of the sphere is $volume")
    }

    def  calSphereVol(radius : Double): Double = {
        val pi = Math.PI
        (4/3) * pi * Math.pow(radius, 3)
    }
}