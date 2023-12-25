import scala.io.StdIn.readLine

@main def run()={
    val sayi1:Int = readLine("1. Sayıyı Giriniz:").toInt
    val sayi2:Int = readLine("2. Sayıyı Giriniz:").toInt
    println(s"$sayi1 + $sayi2 = ${sayi1 + sayi2} ")
}
