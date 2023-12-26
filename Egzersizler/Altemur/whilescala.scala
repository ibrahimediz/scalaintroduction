import scala.io.StdIn.readLine

@main def run()={
    val number = readLine("Sayi Giriniz: ").toInt
    var factorial = 1
    var i = 1
    while (i <= number){
        factorial *= i
          i += 1
    }
    println(factorial)
}