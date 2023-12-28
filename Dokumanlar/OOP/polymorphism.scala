class Arac(val tekerlekSayisi:Int,val renk:String):  // Super Class
    def hizlan():Unit = println("Run Run")


class Bisiklet(val bisikletRengi: String,val bisikletTipi:String) extends Arac(2,bisikletRengi): // Subclass
    def maksimumHiz(hizLimit:Int=0): Int = 
        bisikletTipi match
            case "yol" => if (hizLimit > 60) hizLimit else 60
            case _ => if(hizLimit < 20) hizLimit else 20

    override def hizlan(): Unit = println("Ez ve geç")

@main def run()=
    val bisiklet = new Bisiklet("kırmızı","yol")
    bisiklet.hizlan()
    println(bisiklet.tekerlekSayisi)
    println(bisiklet.renk)
    println(bisiklet.bisikletRengi)
    println(bisiklet.maksimumHiz())  
    println(bisiklet.maksimumHiz(90))    