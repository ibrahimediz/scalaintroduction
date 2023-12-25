import scala.io.StdIn
import scala.io.StdIn.readLine
@main def run()={
    val sayi1 = readLine("Yas Giriniz: ").toInt
    if sayi1 > 20 then
        println("Yurtdisina cikabilirsiniz")
    else if sayi1 == 20 then
        println("Biraz daha bekleyniz")
    else
        println("Olmaz")
}

