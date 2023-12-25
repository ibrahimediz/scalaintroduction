/*
val isimler = List("++Ali","++Veli","++Buse")
val sayilar = 1 to 120 by 22
yukarıdaki listelerden faydalanarak 
1. isimler listesinin List("ali","veli","buse") şeklinde dönüşmesini for ve yield kullanarak sağlayalım
2. sayilar listesinin içerisinde 4 e tam olarak bölünen sayıların 5 katını ekrana yazdıralım
*/


@main def egzersiz4()={
    val isimler = List("++Ali","++Veli","++Buse")
    val sayilar = 1 to 120 by 22
    var soru1 = for isim <- isimler yield
        var temiz = isim.drop(2)
        var harf = temiz.toLowerCase()
        harf
    println(soru1)
    val soru2 = for sayi <- sayilar
    if sayi % 4 == 0
    yield sayi*2
    println(soru2)
}

