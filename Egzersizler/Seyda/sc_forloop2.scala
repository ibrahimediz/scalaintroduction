import scala.io.StdIn.readLine

@main def run()=

    val sayi = readLine("Sayiyi giriniz:").toInt
    var toplam = 0

    for (i <- 1 to sayi) {
        toplam= toplam+i
    }

    println(s"Toplam: $toplam")


/* 
Kullanıcı tarafından girilen sayıya kadar 9 ile tam bölünebilen sayıları ekrana yazdıran 
scala kodunu yazınız
*/
