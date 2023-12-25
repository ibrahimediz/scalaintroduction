import scala.io.StdIn.readLine

@main def run() = {
    val ilkSayi: Int = readLine("İlk Sayiyi Girin:").toInt
    val ikinciSayi: Int = readLine("İkinci Sayiyi Girin:").toInt
    println(s"Toplam: ${ilkSayi+ikinciSayi}")
}