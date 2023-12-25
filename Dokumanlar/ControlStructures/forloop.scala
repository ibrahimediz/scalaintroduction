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
@main def guards()=
    for i <- 1 to 100
    if i % 5 == 0
    if i % 7 == 0
    do
        println(i)

