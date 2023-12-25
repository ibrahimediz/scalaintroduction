import scala.io.StdIn.readLine

//soru1
def soru1() = {
    val belirtilenSayi: Int = readLine("Sayi Girin:").toInt
    var toplam: Int = 0
    for (i <- 1 to belirtilenSayi)
    do
        toplam += i
        println(s"İşlem Sonucu $toplam")
}

//soru2
def soru2() = {
    val girilenSayi: Int = readLine("Sayi Girin:").toInt
    for i <- 1 to girilenSayi
    if i % 9 == 0
    do
        println(i)
}

//soru3
@main def soru3 = {
    val isimler = List("++Ali", "++Veli", "++Buse")
    var yeniIsim = for isim <- isimler yield
        val kaldir = isim.drop(2)
        val kucukHarf = kaldir.toLowerCase()
        kucukHarf
    println(yeniIsim)

    val sayilar = 1 to 120 by 22
    val sonuc = for i <- sayilar
    if i % 4 == 0
    yield i*2
    println(sonuc)
}