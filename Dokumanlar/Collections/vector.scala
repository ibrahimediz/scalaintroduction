
def tanımlama()=
    val sayilar = Vector(1,2,3,4,5)
    val metinler = Vector("bir","iki")
    case class Kisi(isim:String)
    val kisiler = Vector(
        Kisi("Ayşe"),
        Kisi("Ali"),
        Kisi("Veli")
    )
    println(sayilar)
    println(metinler)
    println(kisiler)

def ekleme()=
    val a = Vector(1,2,3)
    val b = a :+ 4
    val c = a ++ Vector(4,5)
    println(b)
    println(c)

def erisim()=
    val v1 = Vector(1,2,3,4,5)
    val v2 = Vector("a","b","c")
    //.             0.   1.  2. 
    println(v1(0))
    println(v2(2))
    for i <- v1.indices do
        println(v1(i))

@main def digerleri()=
    val v1 = Vector(1,2,3,4,5)
    val v2 = Vector("ali","berrin","ceren")
    // Arama
    println(v1.contains(3))
    println(v2.indexOf("berrin"))
    // Değişiklik
    val v3 = v1.updated(2,100)
    // Sıralama
    val v4 = v1.sorted
    val v5 = v2.sortBy(_.length)
    println(v4)
    println(v5)
    // Dönüştürme
    val v6 = v2.map(_.toUpperCase) 
    println(v6)
    println(v5)
    // süzme
    val v7 = v1.filter(_ % 2 == 0)
    val v8 = v2.filter(_.length > 1)
    println(v7)
    println(v8)

    // birleştirme
    val v9 = v1.zip(v2)
    println(v9)

    // bölme 
    val (v10,v11) = v1.splitAt(3) // vektor içerisindeki 3 elemanından itibaren bölme işlemi gerçekleşti
    val v12 = v1.grouped(2) // eleman sayisi 
    println(v10)
    println(v11)
    for i <- v12 do println(s"grouped $i")

    // Kısaltma
    val v13 = v1.drop(2) // indis numarası verildi
    val v14 = v1.take(2) // indis numarası verildi
    println(v13)
    println(v14)

    // Temizleme
    val v15 = v1.empty

    println(v15)
