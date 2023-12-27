//class Car(var marka:String, var model:String, var yil:Int=2010, var renk:String="Kırmızı"):
//    override def toString(): String = s"marka:$marka, model:$model, yil:$yil, renk:$renk"
//    //override def toString(): String = s"zamanAsimi: $zamanAsimi, bekleme:$bekleme"
//
//@main def run()={
//    var c1 = Car("VW","Golf",2020,"Beyaz")
//    //println(c1)
//    println(c1.marka+" "+c1.model)
//    println(c1.yil)
//    println(c1.renk)
//
//    c1.yil=2022
//    c1.renk="Siyah"
//
//     //println(c1)
//     println(c1.marka+" "+c1.model)
//     println(c1.yil)
//     println(c1.renk)
//
////     //val c2 = Car()
////     //println(c2.toString("Audi"))
//     val c3 = Car("Fiat","Şahin") // 6.
//     println(c3.toString())
//}
//
//
/* 
aşağıdaki sınıf tanımından faydalanarak 
1. müsterino alanını private bir değişken haline getirip destekleyici bir constructor üretiniz
2. musteritip alanını private bir değişken haline getirir destekleyici bir constructor üretiniz
sınıfı yukarıdaki adımlar üzerinden tekrar tanımlayınız ve birer nesne üreterek ekrana yazdırınız
*/

class Musteri(var ad:String,var soyad:String,var musteriNo:String="123",var musteriTip:Int=1):
    override def toString(): String = s"Adı Soyadı: $adi $soyad ==== Müşteri No: $musteriNo ===> $musteriTip"

    private var _musteriNo:String

    def this(
        ad:String,
        soyad:String,
        _musteriNo:String,
        musteriTip:Int
    )=
