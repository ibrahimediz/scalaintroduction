import scala.io.StdIn.readLine

@main def run()=

    val sayi = readLine("Sayiyi giriniz:").toInt
    var toplam = 0

    for (i <- 1 to sayi) {
        toplam= toplam+i
    }

    println(s"Toplam: $toplam")
    

/* Yukarıdaki örnekten faydalanarak girilen bir sayının değişkene alınarak
sıfırdan girilen sayıya kadar olan tüm sayıların toplamını ekrana yazan scala kodunu yazınız
*/