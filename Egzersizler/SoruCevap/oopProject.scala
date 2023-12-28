/* 
Sınıflar:
Müşteri (Customer):

Müşteri adı-soyadı (fullName)
T.C. Kimlik numarası (idNumber)
Hesaplar listesi (accounts)
Hesap (Account):

Hesap numarası (accountNumber)
Bakiye (balance)
Hesap türü (accountType: vadesiz, birikim, vb.)
Banka (Bank):

Müşteri listesi (customers)
Hesap açma fonksiyonu (openAccount)
Hesap kapatma fonksiyonu (closeAccount)
Para yatırma fonksiyonu (deposit)
Para çekme fonksiyonu (withdraw)
Hesap özeti alma fonksiyonu (getAccountStatement)
Banka raporu oluşturma fonksiyonu (generateBankReport)
İş Mantığı:
Bir müşteri, bankada hesap açabilir ve birden fazla hesap açabilir.
Her hesap, bakiye ve hesap türü bilgilerini içerir.
Müşteriler hesaplarına para yatırabilir ve çekebilir.
Hesap özeti, bir müşterinin hesap hareketlerini içerir.
*/

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class Hesap(val hesapNo:String,var bakiye:Double,val hesapTip:String):
    override def toString(): String = s"Hesap No: $hesapNo, Tür: $hesapTip Bakiye:$bakiye"
    def paraYatir(miktar: Double):Unit=
        bakiye += miktar
    
    def paraCek(miktar:Double ):Unit = 
        if (miktar <= bakiye) then
            bakiye -= miktar
        else
            println("Yetersiz Bakiye")
    
class Musteri(val isim:String,val soyisim:String,val tckimlikno:String):
    var hesaplar:mutable.Map[String,Hesap]=mutable.Map()
    
    def hesapAc(hesapTip:String):Unit = 
        val hesapNo = s"${tckimlikno}_${hesaplar.size+1}"
        val yenihesap = new Hesap(hesapNo,0.0,hesapTip)
        hesaplar += (hesapNo -> yenihesap)
        println(s"Hoş geldiniz, ${isim} ${soyisim}! Yeni Hesabınız Oluşturuldu. Hesap numaranız: $hesapNo")
        
    def hesapKapat(hesapNo:String):Unit = 
        hesaplar.remove(hesapNo)
        println(s"Hesabınız kapatıldı. Müşteri: $isim $soyisim,Hesap Numarası:$hesapNo")
    
    override def toString(): String = s"Müşteri: $isim $soyisim T.C. Kimlik No:$tckimlikno"

class Banka:
    var musteriler: ListBuffer[Musteri] = ListBuffer()
    def addMusteri(musteri:Musteri):Unit=
        musteriler += musteri
        println(s"Yeni Müşteri Eklendi:${musteri.isim} ${musteri.soyisim}")

    def hesapAc(musteri:Musteri,hesapTip:String):Unit =
        musteri.hesapAc(hesapTip)

    def hesapKapat(musteri:Musteri,hesap:Hesap):Unit = 
        musteri.hesapKapat(hesap.hesapNo)
    
    def paraYatirma(hesap:Hesap,miktar:Double):Unit =
        hesap.paraYatir(miktar)
    
    def paraCek(hesap:Hesap,miktar:Double):Unit=
        hesap.paraCek(miktar)
    
    def hesapBilgisi(hesap:Hesap):String=
        hesap.toString()
    
    def musteriBilgisi(musteri:Musteri):String=
        musteri.toString()

    def bankaGenelRaporAl(): String = 
        var rapor = "Banka Raporu\n"
        for (musteri <- musteriler) do
            rapor += s"\n${musteriBilgisi(musteri)}\n"
            for ((hismi,hesap) <- musteri.hesaplar) do
                rapor += s"${hesapBilgisi(hesap)}"
        rapor

@main def run()=
    val banka = new Banka

    val musteri1 = new Musteri("Digital","Akademi","11233321312")
    banka.addMusteri(musteri1)

    musteri1.hesapAc("USD")

    val hesapM1 = musteri1.hesaplar.head

    banka.paraYatirma(hesapM1._2,1000)
    banka.paraCek(hesapM1._2,400)

    println(banka.bankaGenelRaporAl())
    
