def run()=
    // Temel For Döngüsü Örnekleri
    val sayilar = Seq(1,2,3)
    for i <- sayilar do println(i)
    // ya da 
    for (i <- 1 to 10) {
        println(i)
    }
    // ya da 
    for i <- sayilar
    do
        val x = i*2
        println(s"i = $i, x= $x")

/* Yukarıdaki örnekten faydalanarak girilen bir sayının değişkene alınarak
sıfırdan girilen sayıya kadar olan tüm sayıların toplamını ekrana yazan scala kodunu yazınız
*/
import scala.io.StdIn.readLine
@main def cevap()={
    val x:Int = readLine("Sayıyı Giriniz:").toInt
    var sonuc:Int = 0
    for (i <- 1 to x)
    do
        sonuc += i
    println(s"İşlem Sonucu $sonuc")
    
}


/* 
Kullanıcı tarafından girilen sayıya kadar 9 ile tam bölünebilen sayıları ekrana yazdıran 
scala kodunu yazınız
*/
