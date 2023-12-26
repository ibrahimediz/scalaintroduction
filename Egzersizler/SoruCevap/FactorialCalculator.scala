import scala.io.StdIn.readLine

object FactorialCalculator {
  def main(args: Array[String]):Unit={
    val number: Int = readLine("Faktoriyel için sayıyı giriniz:").toInt
    var factorial : Long = 1
    var i : Int= number
    while i > 0 do
        factorial *= i
        i-=1
    println(factorial)
  }

}
