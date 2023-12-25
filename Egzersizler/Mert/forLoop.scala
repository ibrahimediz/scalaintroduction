import scala.io.readLine

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
    
}