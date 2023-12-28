
def fonk()=
    val isimListe = List("ali","ahmet","ayşe")
    val sonucList = isimListe
    .filter(isim => isim.endsWith("t"))
    .map(isim => isim.capitalize)

    println(sonucList)

def fonk2()=
    case class Kisi(isim:String,soyisim:String)
    var ali = Kisi("Ali","AYMAZ")
    val ahmet = ali.copy(isim = "Ahmet",soyisim="AYIK")
    println(ali.isim)
    println(ahmet.isim)


def fonk3()=
    def ciftMi(n:Int):Boolean = n%2 == 0
    val sayilar = List(1,2,3,4,5)
    val ciftler = sayilar.filter(ciftMi)
    println(ciftler)
    val karesi = sayilar.map((x:Int) => x*2)
    println(karesi)


def fonk4()=
    def katla(i:Int): Int = i*2
    def bestenKucuk(i:Int): Boolean = i<5
    val sayilar = List(1,2,3,4,5)
    val katlar = sayilar.filter(bestenKucuk).map(katla)
    println(katlar)

def fonk5()=
    val katla = (i:Int) => i*2
    println(List("ali","veli").map(_.toUpperCase))
    println(List("ali","veli").map(_.capitalize))
    println(List("ali","veli").map(_.length)) // List(3, 4)
    println(List("elma","armut").flatMap(_.toUpperCase)) // List(E, L, M, A, A, R, M, U, T)

    val sayilar = List(5,1,3,11,7)
    println(sayilar.map(_*2))
    println(sayilar.filter(_>3))
    println(sayilar.takeWhile(_<6))
    println(sayilar.sortWith(_ < _))
    println(sayilar.sortWith(_ > _))

def makeInt(value:String):Option[Int]=
    try
        Some(value.toInt)
    catch
        case _: NumberFormatException => 
            None

import scala.io.StdIn.readLine

def fonk6()=
    val deger=readLine("Değeri Giriniz:")
    makeInt(deger) match
        case Some(i) => println(i)
        case None => println("Sayı Girilmedi")
    val stringA = "1"
    val stringB = "a"
    val stringC = "3"
    val y = for
        a <- makeInt(stringA)
        b <- makeInt(stringB)
        c <- makeInt(stringC)
    yield 
        a+b+c
    println(y)

@main def fonk7()=
    class Adres(
        var sokak1:String,
        var sokak2:Option[String],
        var il:String,
        var ilce:String,
        var postaKodu:String
        )

    val benim = Adres("Bulut Sk.",None,"Gaziantep","Şahinbey","27065")
    val benim = Adres("Bulut Sk.",Some("Defne Apt."),"Gaziantep","Şahinbey","27065")