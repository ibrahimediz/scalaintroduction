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