import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.NumericRange.Inclusive

def tanimlama()=
    case class Kisi(isim:String)
    var strler1 = ArrayBuffer[String]()
    var sayilar1 = ArrayBuffer[Int]()
    var kisiler1 = ArrayBuffer[Kisi]()
    // Boyutlar değişebilir
    var strler2 = ArrayBuffer[String]("")
    var sayilar2 = ArrayBuffer[Int](100000)
    var kisiler2 = ArrayBuffer[Kisi](Kisi("a"))
    // ---------------
    val sayilar3 = ArrayBuffer(1,2,3,4)
    val kisiler3 = ArrayBuffer(
        Kisi("Ahmet"),
        Kisi("Veli"),
        Kisi("Ayşe"))
    println(kisiler3)


def ekleme()=
    var sayilar = ArrayBuffer(1,2,3)
    println(sayilar) // ArrayBuffer(1, 2, 3)
    sayilar += 4
    println(sayilar) // ArrayBuffer(1, 2, 3, 4)
    sayilar ++= List(5,6)
    println(sayilar) // ArrayBuffer(1, 2, 3, 4, 5, 6)



def silme()=
    // REPL üzerinden denenebilir !!!!!!!!!!! 
    var a = ArrayBuffer.range('a','h') // ArrayBuffer(a, b, c, d, e, f, g)
    a -= 'a' // ArrayBuffer(b, c, d, e, f, g)
    a --= Seq('b','c') // ArrayBuffer(d, e, f, g)
    a --= Set('d','e') // ArrayBuffer(f, g)

@main def guncelleme()=
    var a = ArrayBuffer(1,2,3,4)
    a(2) = 100
    print(a)