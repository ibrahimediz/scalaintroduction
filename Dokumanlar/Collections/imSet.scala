/* 
immutable set kullanımı
*/


@main def run()=
    val immutableSet = Set(1,2,3,4,5,2,2,3,4) 
    println(immutableSet) // HashSet(5, 1, 2, 3, 4)
    // ekleme
    val yeniSet = immutableSet + 6
    println(yeniSet)

    // kontrol
    val varmiSet = immutableSet.contains(3)
    println(s"varmiSet   $varmiSet ")
    // boyut
    val boyut = immutableSet.size
    println(s"boyut   $boyut")
    // boş bir set oluşturma
    val bosSet = Set.empty[Int]

    // filtreleme

    val filtreleme = immutableSet.filter(_ % 2 == 0)
    println(s"filtreleme   $filtreleme")

    // eleman gezip yazdırma
    immutableSet.foreach(println)

    // BİRLEŞTİRME
    val digerSet = Set(6,7,8,9)
    val birlesik  = immutableSet union digerSet
    println(s"birlesik   $birlesik")
    // FARK BULMA
    val farkSet = immutableSet diff digerSet
    println(s"farkSet   $farkSet")

    // KESİŞİM
    val kesisimSet = immutableSet intersect digerSet
    println(s"kesisimSet   $kesisimSet")
    