/* 
Kullanıcıdan istenen yas bilgisini
 20 yaşının üstünde ise yurtdışına çıkabilir ya da 
 20 yaş altında ise vasi gerekir ifadesini, 
 tam 20 yaşında ise biraz daha beklemelisin yazan
 scala kodunu yazalım
 */
import scala.io.StdIn.readLine

@main def run()=
    val yas:Int = readLine("Yaş Bilgisini Giriniz:").toInt
    var sonuc:String = ""
    if yas>20 then
        sonuc = "Yurt dışına çıkabilir"
    else if yas == 20 then
        sonuc = "Biraz daha beklemelisin"
    else
        sonuc = "Vasi Gerekir"
    println(sonuc)

    