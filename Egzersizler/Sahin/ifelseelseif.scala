import scala.io.StdIn.readLine

@main def run()={
    val yas:Int  = readLine("Yas bilgisi giriniz:").toInt
    if yas > 20 then
    println("yurtdışına çıkabilir")
    else if yas == 20 then
        println("biraz daha beklemelisin")
        else
            println("vasi gerekir")
}

/* 
Kullanıcıdan istenen yas bilgisini
 20 yaşının üstünde ise yurtdışına çıkabilir ya da 
 20 yaş altında ise vasi gerekir ifadesini, 
 tam 20 yaşında ise biraz daha beklemelisin yazan
 scala kodunu yazalım
 */