object diskAreaCalculator {
  def main(args: Array[String]): Unit = {
    val radius = 5
    val area = calculateDiskArea(radius)
    println(s"The area is $area")
  }

  def calculateDiskArea(radius: Double): Double = {
    val pi = Math.PI
    pi * radius * radius
  }

}

