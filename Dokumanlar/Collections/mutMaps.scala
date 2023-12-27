import scala.collection.mutable.Map

@main def run()=
    var mutMap =Map(
        "1"->"Bir",
        "2"->"İki"
        ) 
    // Ekleme
    mutMap += ("3"->"Üç")
    print(mutMap)
    // Erişim
    println(mutMap("1"))
    // elemanlar arasında döngü ile gezebilme
    mutMap.foreach {
        case (anahtar,deger) => println(s" $anahtar,$deger")
    }
        // kontrol
    println(mutMap.contains("2"))

    // boyut
    println(mutMap.size)

    // boş tanımlama
    val bosMap = Map.empty[String,String]

    // filtreleme
    val filtremutMap = mutMap.filter {
        case (anahtar,deger) => 
            deger.startsWith("İ")
    }
    println(filtremutMap)

    // Güncelleme 
    mutMap("1") = "One"

    // Eleman ekleme veya güncelleme (varsa güncelle,yoksa ekle)
    mutMap.getOrElseUpdate("4","Four")

    // Silme
    mutMap -= "2"
    println(mutMap)
