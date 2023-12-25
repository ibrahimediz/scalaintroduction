import scala.io.readLine

@main def run () = {
    val yas: Int = readLine("Yasinizi Girin:").toInt

    if yas > 20 then
        println("Yurtdisina cikabilir.")
    else if yas == 20 then
        println("Biraz daha beklemeli.")
    else
        println("Vasi gerekir.")
}