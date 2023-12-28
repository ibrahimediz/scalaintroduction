import scala.collection.mutable.ListBuffer
class Hesap(
    var hesapNumarasi: String,
    var bakiye: Double,
    var hesapTuru: String
)

class Musteri(
    var musteriAdi: String,
    var tckn: String,
    var hesapListesi: ListBuffer[Hesap] = ListBuffer()
)

class Banka(
    var musteriListesi: ListBuffer[Musteri] = ListBuffer()
)  

def hesapAc(musteri: Musteri, hesapNumarasi: String, baslangicBakiye: Double, hesapTuru: String): Unit = {
    val yeniHesap = new Hesap(hesapNumarasi, baslangicBakiye, hesapTuru)
    musteri.hesapListesi += yeniHesap
    println(s"Sayin ${musteri.musteriAdi}, $hesapTuru hesabi basari ile olusturuldu.")
}

def hesapKapa(musteri: Musteri, hesapNumarasi: String): Unit = {
    val hesapKontrol = musteri.hesapListesi.find(_.hesapNumarasi == hesapNumarasi)
    hesapKontrol match {
        case Some(Hesap) => musteri.hesapListesi -= Hesap
        println(s"Sayin ${musteri.musteriAdi}, $hesapNumarasi numarali hesabiniz basari ile kapatildi.")
        case None =>
        println(s"Sayin ${musteri.musteriAdi}, $hesapNumarasi numarali hesabiniz bulunamadi.")
    }
}

def paraYatir(musteri: Musteri, hesapNumarasi: String, miktar: Double): Unit = {
    val hesapKontrol = musteri.hesapListesi.find(_.hesapNumarasi == hesapNumarasi)

    hesapKontrol match {
        case Some(Hesap) => 
            hesap.bakiye += miktar
            println(s"Sayin ${musteri.musteriAdi}, $hesapNumarasi numarali hesabiniza $miktar tutari yatirildi.")
        case None =>
            println(s"Sayin ${musteri.musteriAdi}, hesabiniz bulunamadi.")
    }
}

def paraCek(musteri: Musteri, hesapNumarasi: String, miktar: Double): Unit = {
    val hesapKontrol = musteri.hesapListesi.find(_.hesapNumarasi == hesapNumarasi)

    hesapKontrol match {
        case Some(Hesap) =>
            if (Hesap.bakiye >= miktar) then
                Hesap.bakiye -= miktar
                println(s"Sayin ${musteri.musteriAdi}, $hesapNumarasi numarali hesabiniza $miktar tutari cekildi.")
            else
                println(s"Sayin ${musteri.musteriAdi}, $hesapNumarasi numarali hesabiniza yeterli bakiye bulunamadi.")
        case None =>
            println(s"Sayin ${musteri.musteriAdi}, hesabiniz bulunamadi.")
    }
}

def hesapOzetiAl(musteri: Musteri, hesapNumarasi: String): Unit = {
    val hesapKontrol = musteri.hesapListesi.find(_.hesapNumarasi == hesapNumarasi)

    hesapKontrol match {
        case Some(Hesap) => 
            Hesap.bakiye += miktar
            println(s"Sayin ${musteri.musteriAdi}, $hesapNumarasi numarali hesabiniza $miktar tutari yatirildi.")
        case None =>
            println(s"Sayin ${musteri.musteriAdi}, hesabiniz bulunamadi.")
    }
}

def bankaRaporuOlustur(): Unit = {
    for 
        musteri <- musteriListesi
        hesap <- musteri.hesapListesi
    yield {
        println(s"${Musteri.musteriAdi} - ${Hesap.hesapNumarasi} - ${Hesap.hesapTuru} - Bakiye: ${Hesap.bakiye}")
    }
}
