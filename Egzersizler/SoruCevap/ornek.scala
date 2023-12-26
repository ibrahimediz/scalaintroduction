object FibanocciSeries{
    def main(args: Array[String]):Unit = {
        val limit: Int = 1000
        var num1:Int = 0
        var num2:Int = 1
        println(s"Fibanocci Series upto $limit")
        println(s"$num1 $num2")
        var sum: Int = num1 + num2
        while (sum <= limit) {
            print(" "+sum)
            num1 = num2
            num2 = sum
            sum = num1 + num2 
        }

    }
}
