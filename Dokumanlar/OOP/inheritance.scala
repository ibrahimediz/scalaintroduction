class Arac(val tekerlekSayisi:Int,val renk:String):  // Super Class
    def hizlan():Unit = println("Run Run")


class Bisiklet(val bisikletRengi: String,val bisikletTipi:String) extends Arac(2,bisikletRengi): // Subclass
    def maksimumHiz(): Int =
        bisikletTipi match
            case "yol" => 60
            case _ => 20

@main def run()=
    val bisiklet = new Bisiklet("kırmızı","yol")
    bisiklet.hizlan()
    println(bisiklet.tekerlekSayisi)
    println(bisiklet.renk)
    println(bisiklet.bisikletRengi)
    println(bisiklet.maksimumHiz())        