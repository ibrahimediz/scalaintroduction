import scala.io.StdIn.readLine

@main def run()={

val yas = readLine("Yaşınız Nedir:").toInt

if yas > 20 then
        println("Yurtdısına cikabilir")
    else if yas == 20 then
        println("Biraz daha beklemen gerekir")
    else
        println("Vasi gerekir")

}