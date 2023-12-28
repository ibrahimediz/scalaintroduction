import scala.collection.mutable.ArrayBuffer
/* 
Müşteri Bilgisini iki farklı trait üzerinden gruplandırıp oluşturulacak bir müşteri classına extend yapalım.
Bu class üzerinden örnek türetip ekrana yazdıralım
*/
trait MusteriKimlik:
    def adi: String
    def soyadi: String
    def tcKimlikNo: String
    override def toString(): String = s"$tcKimlikNo => $adi $soyadi"

trait MusteriUrunBilgi:
    def musteriTip: Int
    def urunList: ArrayBuffer[String]
    def musteriSeviye() = println(s"Müşteri Seviyesi:${urunList.size}")


class Musteri(isim:String,soyisim:String,tcKimlikNo1:String) extends MusteriKimlik,MusteriUrunBilgi:
    val adi = isim
    val soyadi = soyisim
    val tcKimlikNo = tcKimlikNo1
    val urunList = ArrayBuffer("KK","KMH","MVD","AKR","KKR")
    val musteriTip = 1
    musteriSeviye()

@main def run()=
    val m = new  Musteri("aa","bb","123123123")
    println(m)