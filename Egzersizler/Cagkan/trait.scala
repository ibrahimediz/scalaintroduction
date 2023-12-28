trait MustInfo:
    def id: Int
    def name: String
    def surname: String 

trait MustDetail:
    def numLegs:Int
    def avgmoney:Int 

class Must(name:String) extends MustInfo,MustDetail:
    val numlegs: Int=2
    override def toString(): String = s"$name is a Mahmut"

@main def run()=
    val deneme=Must("Mesut")
    println(deneme)

