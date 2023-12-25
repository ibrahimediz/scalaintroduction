import scala.io.readLine

//soru1
def run() = {
    val belirtilenSayi: Int = readLine("Sayi Girin:").toInt
    var toplam: Int = 0
    for (i <- 1 to belirtilenSayi)
    do
        toplam += i
        println(s"İşlem Sonucu $toplam")
}

//soru2