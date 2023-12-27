class Car(var marka:String, var model:String, var yil:Int=2010, var renk:String="Kırmızı")
    override def toString(): String = s"marka:$marka, model:$model, yil:$yil, renk:$renk"
    //override def toString(): String = s"zamanAsimi: $zamanAsimi, bekleme:$bekleme"

@main def run()={
    var c1 = Car("VW","Golf",2020,"Beyaz")
    //println(c1)
    println(c1.marka+" "+c1.model)
    println(c1.yil)
    println(c1.renk)

    c1.yil=2022
    c1.renk="Siyah"

    //println(c1)
    println(c1.marka+" "+c1.model)
    println(c1.yil)
    println(c1.renk)

    //val c2 = Car()
    //println(c2.toString("Audi"))
    val c3 = Car(yil = 2022)
    println(c3.toString())
}