import scala.collection.mutable

class Musteri(val isim:String,val soyisim:String,val tckimliknno:String):
 var hesaplar:mutable.Map[String,Hesap]=mutable.Map()
 def hesapAc(hesapTip:String):Unit = {
    val hesapNo = s"$tckimliknno_${hesaplar.size}+1"
        val yenihesap = new Hesap(hesapNo,0.0,hesapTip)
        hesaplar += (hesapNo -> yenihesap)
        println("Hesap Oluşturuldu.")
    }
 def hesapKapat(Hesap_no:String)={
    hesaplar.remove(Hesap_no)
    Println("Hesabınız silinmiştir.Tekrar bizi tercih etmeniz dileğiyle.")
  }
class Hesap(val accountNumber:String,var Bakiye:Double,val hesaptürü:String):
    override def toString(): String = s"Hesap No: $accountNumber, Tür: $hesaptürü,bakiye:$Bakiye"
    def Parayatir(miktar: Double):Unit=
        bakiye += miktar
    
    def paraçekme(miktar:Double ):Unit = 
        if (miktar <= bakiye) then
            bakiye -= amount

class Banka:
    var musteriler:ListBuffer[Musteri]=ListBuffer()

    def hesapAc(musteri:Musteri,hesapTip:String):Unit =
        musteri.hesapAc(hesapTip)

    def hesapKapat(musteri:Musteri,hesap:Hesap):Unit = 
        musteri.hesapKapat(hesap)
    
    def paraYatir(hesap:Hesap,miktar:Double):Unit =
        hesap.paraYatir(miktar)


        