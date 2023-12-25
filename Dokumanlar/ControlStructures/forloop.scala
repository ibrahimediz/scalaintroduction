/* for loop */
// @main def run()={
//     // Temel Kullanım
//     for (i <- 1 to 5) {
//         println(s"Sayı:$i")
//     }

//     // Adım Belirterek Kullanım
//     for (i <- 1 to 10 by 2) {
//         println(s"Tek Sayı:$i")
//     }

//     // Dizi üzerinden gezinme 
//     val isimler:Array[String] = Array("Ahmet","Mehmet","Ayşe")
//     for (isim <- isimler) {
//         println(s"İsim:$isim")
//     }

//     // Tuple Kullanımı
//     val koordinatlar = List((1,2),(3,4),(5,6))
//     for ((x,y) <- koordinatlar) {
//         println(s"Koordinat:($x,$y)")
//     }

// }


// #########################
def temelFor()=
    // Temel For Döngüsü Örnekleri
    val sayilar = Seq(1,2,3)
    for i <- sayilar do println(i)
    // ya da 
    for (i <- 1 to 10) {
        println(i)
    }
    // ya da 
    for i <- sayilar
    do
        val x = i*2
        println(s"i = $i, x= $x")
// ##########################
def uretkenler()=
    val sayilar = 1 to 10
    val sayilar2 = 1 to 10 by 2
    var harfler = 'a' to 'z' // türkçe karakterler içerisinde bulunmamaktadır.
    println(sayilar)
    println(sayilar2)
    println(harfler)
// Çoklu üretken
def cokluUretgen()=
    for
        i <- 1 to 4
        j <- 'a' to 'd'
        k <- 1 to 11 by 3
    do
        println(s"$i -- $j -- $k")
// Guards 
def guards()=
    for i <- 1 to 100
    if i % 5 == 0
    if i % 7 == 0
    do
        println(i)

// Map ile Kullanımı
def mapilekullanim()=
    val baskentler = Map(
        "Turkiye" -> "Ankara",
        "Almanya" -> "Berlin",
        "Fransa" -> "Paris")
    for (k,v) <- baskentler
    do
        println(k+"->"+v)
// ##############################
@main def yieldKullanimi()=
    val l1 =
        for i <- 5 to 7
            yield i * 2 
    println(l1) 
    // ya da
    val l2 = (5 to 7).map(i=>i*2)
    println(l2)
    // bir koleksiyon içinde elemanlara etki uygulamak için
    // val isimList = List("_ahmet","_mehmet","_ayşe")
    // var temizIsim = isimList.map(x=>x.drop(1))
    // var basHarf = temizIsim.map(x=>x.capitalize)
    // println(basHarf) 
    // // ya da
    // val isimList = List("_ahmet","_mehmet","_ayşe")
    // var temizIsim = for isim <- isimList yield 
    //     val temiz = isim.drop(1)
    //     val basharf = temiz.capitalize
    //     basharf
    // println(temizIsim)

    val sayilar = 1 to 20
    println(sayilar.filter(x=>x>=3 && x <= 10))
    // ya da 
    print(for (x<-sayilar if x>=3 && x <= 10) yield x)
    // ya da 
    var y1 =  for x <- sayilar
        if x>= 3
        if x<=10
    yield x
    println(y1)