abstract class EvcilHayvan(ad: String):
    def selam: String
    def yas: Int
    override def toString(): String = s"$ad $yas yasinda"

class Kopek(ad:String,var yas:Int) extends EvcilHayvan(ad):
    val selam = "Wof"

@main def run()=
    val d = Kopek("Biber",2)
    println(d)