trait Cust1:
    def id: Int

trait Cust2:
    def country: String

class Cust(name: String) extends Cust1, Cust2:
    val id=5
    val country="TR"
    override def toString(): String = s"Name:$name  from:$country  Id:$id"

@main def run()=
        val n = Cust("Sahin")
        println(n)