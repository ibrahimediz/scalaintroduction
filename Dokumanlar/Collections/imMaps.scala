// Immutable Map
@main def tanimlama()=
    val immap = Map(
        "1"->"Bir",
        "2"->"İki"
        )
    println(immap)
    // yeni değer 
    val yeniMap = immap + ("3"->"Üç")
    println(yeniMap)
    // Erişim
    println(immap("1"))

    // elemanlar arasında döngü ile gezebilme
    immap.foreach {
        case (anahtar,deger) => println(s" $anahtar,$deger")
    }

    // kontrol
    println(immap.contains("2"))

    // boyut
    println(immap.size)

    // boş tanımlama
    val bosMap = Map.empty[String,String]

    // filtreleme
    val filtreimmap = immap.filter {
        case (anahtar,deger) => 
            deger.startsWith("İ")
    }
    println(filtreimmap)

    