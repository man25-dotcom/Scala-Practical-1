object  costCal {
    def main(args: Array[String]): Unit = {
        val coverPrice = 24.95
        val discount = 0.40
        val noOfCopies = 60
        val shipCost = calShipCost(noOfCopies)
        val totWholesaleCost = calTotWholesaleCost(coverPrice, discount, noOfCopies, shipCost)
        println(f"The total wholesale cost is Rs. $totWholesaleCost%.2f")
    }

    def calDiscountedPrice(coverPrice : Double, discount : Double): Double = {
        coverPrice * (1 - discount)
    }

    def calShipCost(noOfCopies : Int): Double = {
        if(noOfCopies <= 50) {
            3.0
        } else {
            3.0 + (noOfCopies - 50) * 0.75
        }
    }

    def calTotWholesaleCost(coverPrice : Double, discount: Double, noOfCopies: Int, shipCost : Double): Double = {
        val discountedPrice = calDiscountedPrice(coverPrice, discount)
        val totalBookCost = discountedPrice * noOfCopies
        totalBookCost + shipCost
    }
}