import scala.collection.mutable


@main def run()=
    var mutableSet = mutable.Set(1,2,3,4,5,2,2,3,4) 
    println(mutableSet) // HashSet(5, 1, 2, 3, 4)
    // ekleme
    mutableSet += 6
    mutableSet.add(7)

    // kontrol
    val varmiSet = mutableSet.contains(3)
    println(s"varmiSet   $varmiSet ")
    // boyut
    val boyut = mutableSet.size
    println(s"boyut   $boyut")
    // boş bir mutable.Set oluşturma
    val bosSet = mutable.Set.empty[Int]

    // filtreleme

    val filtreleme = mutableSet.filter(_ % 2 == 0)
    println(s"filtreleme   $filtreleme")

    // eleman gezip yazdırma
    mutableSet.foreach(println)

    // BİRLEŞTİRME
    val digerSet = mutable.Set(6,7,8,9)
    val birlesik  = mutableSet union digerSet
    mutableSet ++= digerSet
    println(s"birlesik   $birlesik")
    // FARK BULMA
    val farkSet = mutableSet diff digerSet
    println(s"farkSet   $farkSet")

    // KESİŞİM
    val kesisimSet = mutableSet intersect digerSet
    mutableSet retain (x => digerSet.contains(x))
    println(s"kesisimSet   $kesisimSet")
    

    /// kesişim,birleşim ve fark ve subsetOf
    // mutableSet.subsetOf(digetSet)