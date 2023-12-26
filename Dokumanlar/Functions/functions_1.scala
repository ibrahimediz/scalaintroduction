def ornek1()=
    var sayilar = List(1,2,3,4)
    var ikiKatlar = sayilar.map(_ * 2) // List(2,4,6)
    println(ikiKatlar)
    /* 
        _ * 2 => Verilen her elemanı 2 ile çarp
    */
    var ikiKatlar1 = sayilar.map((i:Int) => i*2)
    var ikiKatlar2 = sayilar.map((i) => i*2)
    var ikiKatlar3 = sayilar.map(i => i*2)
    println(ikiKatlar1)
    println(ikiKatlar2)
    println(ikiKatlar3)
    // foreach
    sayilar.foreach((i: Int)=>println(i))
    // ya da 
    sayilar.foreach(i=>println(i))
    // ya da 
    sayilar.foreach(println(_))
    //
    sayilar.foreach(println)

def ornek2()=
    val ikile = (i: Int) => i * 2
    val ucle = (i: Int) => i * 3
    val dortle = (i: Int) => i * 4
    println(List(1,2,3).map(ikile))
    val fonkList = List(ikile,ucle,dortle)
    val fonkMap = Map("2x"->ikile,"3x"->ucle,"4x"->dortle)


// Method ve Fonksiyon Farkı
// def ornek3()=
    // val ciftMethod(i:Int) = i % 2 == 0 // Method ?????
    // val ciftFonk = (i :Int) => i % 2 == 0 // Fonksiyon

// Fonksiyon Tanımlama
def fonk(isim :String):String = {
    s"Merhaba, $isim"
}

@main def ornek4()=
    println(fonk("Garanti"))
    isimSoyisimYaz("Garanti")("Akademi")
    val sonuc = islemYap((x) => x*2,5)
    println(sonuc)

def isimSoyisimYaz(isim:String)(soyisim :String):Unit={
    println(s"$isim $soyisim")
}

def islemYap(f: Int => Int,x :Int):Int ={
    f(x)
}


