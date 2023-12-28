import scala.math.* 

// ------------------------------------------
// class Circle(val radius:Double):
//     def area: Double= Circle.calculateArea(radius)


// object Circle:
//     private def calculateArea(radius : Double):Double = Pi * pow(radius,2.0)

// @main def run()=
//     val circle1 = Circle(5.0)
//     println(circle1.area)

// -------------------------------
class Kisi:
    var ad = ""
    var yas = 0
    override def toString(): String = s"$ad $yas yaşında"

object Kisi: // Compainon Object 
    def apply(ad: String): Kisi = // Bir argümanlı fab methodu
        var k = new Kisi
        k.ad = ad
        k

    def apply(ad: String,yas:Int): Kisi = // iki argümanlı fab metodu
        var k = new Kisi
        k.ad = ad
        k.yas = yas
        k
end Kisi

@main def run()=
    val ali = Kisi("Ali")
    val veli = Kisi("Veli",29)
    println(ali)
    println(veli)