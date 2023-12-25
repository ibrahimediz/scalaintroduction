
@main def casting()={
    // Implicit Cast
    val b: Byte = 127
    val i: Int = b

    val face: Char = 'e'
    val sayi:Int = face // 101
    println(sayi)
    // Explicit Cast
    val x: Long = 9_8765_4321L
    println(x)
    val y: Float = x.toFloat
    // val z: Long = y
    println(y)

}

def veritipleri()= {
    // ilkel veri tipleri
    val yas: Int = 25
    val buyukNum :Long = 12345678901234L
    val pi : Float = 3.14f
    val e : Double = 2.71828
    val isOk : Boolean = true
    val ilkHarf:Char = 'A'
    val selamver: String = "Merhaba Garanti BBVA"
    val kucukNum: Short = 32767
    val ufakNum: Byte = 127

    // Unit
    def printMesaji():Unit={
        println("Bu fonksiyon bir değer döndürmüyor")
    }
    // Any,AnyVal,AnyRef
    val anyDeger:Any = 42
    val anyDegerli:AnyVal = 42
    val anyRef:AnyRef = "Referans türü örnek"

    // Tuple
    var kisi:(String,Int) = ("Ahmet",30)

    // Option
    val olaBilir: Option[String] = Some("Ayşe")
    val olaMaz : Option[String] = None

    // List
    val sayilar: List[Int] = List(1,2,3,4,5)

    // Array
    var arr: Array[Int] = Array(1,2,3,4,5)
    

}

def valvarfarki()={
    /* 
    Çoklu satır açıklama
    */
    // Açıklama
    // Değişken Belirlerken;
    // var
    var x = 10
    x = 20
    println(x)
    // val
    val y = 20
    // y = 30
    println(y)
}


def degiskenTanimlama() =
    {
        // Değişkenin tipini bilmiyorum
        var x = 20
        val y = "Merhabalar"

        // Değişkenin tipini biliyorum
        var z:Int = 10
        val t:String = "Merhabalar"
    }

