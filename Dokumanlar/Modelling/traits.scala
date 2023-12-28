trait Personel:
    def id: Int
    def name: String
    def surname: String 

trait HasLegs:
    def numLegs:Int
    def walk():Unit
    def stop() = println("Stopped Walking")

trait HasTail:
    def tailColor: String
    def wagTail() = println("Tail is wagging")
    def stopTail() = println("Tail is stopped")


class IrishSetter(name : String) extends HasLegs,HasTail:
    val numLegs = 4
    val tailColor = "Red"
    def walk(): Unit = println("I'm walking")
    override def toString(): String = s"$name is ad Dog" 

@main def run()=
    val d = IrishSetter("Big Red")
    println(d)