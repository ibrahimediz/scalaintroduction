import scala.io.StdIn
import scala.io.StdIn.readLine

@main def run()={
    val sayi1 = readLine("Sayi Giriniz: ").toInt
    var x:Int = 0
    for (i <- 1 to sayi1) do
        x += i
    println(x)
}