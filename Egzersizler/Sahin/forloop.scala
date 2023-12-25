import scala.io.StdIn.readLine

////@main def run()={
////val num1:Int  = readLine("Sayi giriniz:").toInt
////var num2:Int=0
////for (i <- 1 to num1)
////do num2 += i
////println{s"Sonuc: $num2"}
///* Yukarıdaki örnekten faydalanarak girilen bir sayının değişkene alınarak
//sıfırdan girilen sayıya kadar olan tüm sayıların toplamını ekrana yazan scala kodunu yazınız
//*/
//@main def run()={
//val num1:Int  = readLine("Sayi giriniz:").toInt
//for i <- 1 to num1
//if i % 9 == 0
//do println{s"Sonuc: $i"}
///* 
//Kullanıcı tarafından girilen sayıya kadar 9 ile tam bölünebilen sayıları ekrana yazdıran 
//scala kodunu yazınız
//*/
//}

@main def run()=
   val isimler = List("++Ali","++Veli","++Buse")
   val sayilar = 1 to 120 by 22
   var soru1 = for isim <- isimler yield
    val temiz = isim.drop(2)
    //val harf = temiz.toLowerCase()
    //harf
    println(soru1)
    val soru2 = for sayi <- sayilar
    if sayi % 4 == 0
    yield sayi*2
    println(soru2)

/*
val isimler = List("++Ali","++Veli","++Buse")
val sayilar = 1 to 120 by 22
yukarıdaki listelerden faydalanarak 
1. isimler listesinin List("ali","veli","buse") şeklinde dönüşmesini for ve yield kullanarak sağlayalım
2. sayilar listesinin içerisinde 4 e tam olarak bölünen sayıların 5 katını ekrana yazdıralım
*/