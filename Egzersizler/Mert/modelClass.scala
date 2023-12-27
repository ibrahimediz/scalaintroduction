class Musteri(var isim:String, var soyisim:String, var sehir:String = "Istanbul", var yas:Int = 25):
    override def toString(): String = s"Sayin $isim $soyisim bu ay $sehir magazamizda $yas. yas gunu indirimizinizi kullandiniz."

@main def run() = {
    val m1 = new Musteri("Ahmad", "Barit")
    println(m1.toString())
    m1.isim = "Ahmet"
    m1.soyisim = "Barut"

    println(m1.toString())

    val s1 = Musteri(m1.isim, m1.soyisim, "Ankara", 26)
    println(s1.toString())
}

class YeniMusteri(var ad:String,var soyad:String,var musteriNo:String="123",var musteriTip:Int=1):
    override def toString(): String = s"Adı Soyadı: $adi $soyad ==== Müşteri No: $musteriNo ===> $musteriTip"
    private var _musteriNo:String = ""
    private var _musteriTip:Int = 0

    def this(
        ad:String,
        soyad:String,
        musteriNo:String
    ) =
        this(ad,soyad)
        _musteriNo = musteriNo

    def this(
        ad:String,
        soyad:String,
        musteriTip:Int
    ) =
        this(ad,soyad)
        _musteriTip = musteriTip

@main def run()= {
    val musteri1 = YeniMusteri("Ali", "Veli")
    val musteri2 = YeniMusteri("Ali", "Veli", "123456")
    val musteri3 = YeniMusteri("Ali", "Veli", 1)
}