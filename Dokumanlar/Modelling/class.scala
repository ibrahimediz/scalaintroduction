// class Kisi(var ad:String,var meslek:String)
// class Kitap(var baslik:String,var yazar:String,var yil:Int)
// class Film(val ad:String,val yonetmen:String,val yil:Int)

// def baslangic()=
//     // val k = new Kisi("İlber ORTAYLI","Akademisyen")
//     // UAM
//     val k = Kisi("İlber ORTAYLI","Tarih Profesörü")
//     println(k) // Kisi@6e948f1c
//     // özelliklere erişilebilir
//     println(k.ad)
//     println(k.meslek)
//     // özellikler değiştirilebilir
//     k.ad = "Celal ŞENGÖR"
//     k.meslek = "Jeoloji Profesörü"
//     println(k.ad)
//     println(k.meslek)
// ---------------------------------------------------

//// field ve metodlar
// class Kisi(var ad:String,var soyad:String):
//     println("Başlatma işlemi başladı")
//     val tamAd = ad + " " + soyad 

//     // bir sınıf metodu
//     def tamAdiYazdir: Unit = 
//         // Yukarıda yazdığımız tamAd alanına erişelim
//         println(tamAd)

//     tamAdiYazdir
//     println("Başlatma işlemi sona erdi")

// @main def run()=
//     val k = Kisi("İlber","ORTAYLI")

// ---------------------------------------------------
//// Varsayılan Parametreler
// class Soket(val zamanAsimi: Int = 5_000,val bekleme: Int=5_000):
//     override def toString(): String = s"zamanAsimi: $zamanAsimi, bekleme:$bekleme"

// @main def run()=
//     val s1 = Soket()
//     println(s1.toString())
//     val s2 = Soket(2500)
//     println(s2.toString())
//     val s3 = Soket(2500,3000)
//     println(s3.toString())
//     val s4 = Soket(zamanAsimi = 2000)
//     println(s4.toString())
//     val s5 = Soket(bekleme = 3000)
//     println(s5.toString())
//     val s6 = Soket(zamanAsimi=3000,bekleme = 3000)
//     println(s6.toString())


//------------------------------
// Destek Constructor
import java.time.*

// [1] birincil constructor
class Ogrenci(
    var adi:String,
    var tcKimlikNo:String
):
    private var _basvuruTarihi :Option[LocalDate] = None
    private var _ogrenciNo : Int = 0
// [2] öğrenci başvurusu tamamlandığıda kullanılan bir constructor
    def this(
        ad:String,
        tcKimlikNo:String,
        basvuruTarihi:LocalDate
    ) = 
        this(ad,tcKimlikNo)
        _basvuruTarihi = Some(basvuruTarihi)
// [3] öğrenci onaylandığında ve şimdi bir öğrenci numarası olduğunda kullanılan constructor
    def this(
        ad:String,
        tcKimlikNo:String,
        ogrenciNo:Int
    ) = 
        this(ad,tcKimlikNo)
        _ogrenciNo = ogrenciNo

@main def run()=
    val o1 = Ogrenci("Meryem","123")
    val o2 = Ogrenci("Meryem","123",LocalDate.now)
    val o3 = Ogrenci("Meryem","123",456)