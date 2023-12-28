import scala.collection.mutable.ArrayBuffer

class Ekmek(ekmekIsmi : String = "Beyaz",ekmekMiktar:Int = -1){
        val isim:String = ekmekIsmi
        val miktar:Int = ekmekMiktar
        
        def ucretHesap(birimFiyat:Int):Int = {
            birimFiyat*ekmekMiktar
        }
}

class Sandwich(ekmek:Ekmek,icerik:ArrayBuffer[String]){
    private def getIcerikName:String={
        icerik.mkString(", ")
    }

    def getTanim:String = {
        s"Bu sandwich ${ekmek.isim} ekmeği ile $getIcerikName içeriğine sahiptir"
    }

    def addIcerik(ekstraIcerik:String):Unit={
        icerik.append(ekstraIcerik)
    }
}

@main def run()=
    val sandwich = new Sandwich(new Ekmek("Beyaz"),ArrayBuffer("Hindi Füme","Barbekü Sos"))
    println(sandwich.getTanim)
    sandwich.addIcerik("Domates")
    println(sandwich.getTanim)