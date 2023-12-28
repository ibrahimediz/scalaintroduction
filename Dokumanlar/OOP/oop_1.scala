
def sinifvenesne()=
    class Ekmek
    val beyazEkmek = new Ekmek

def alanlatitanimlamak()=
    class Ekmek {
        var isim: String = "Beyaz"
        var miktar: Int = -1
    }
    val beyazEkmek = new Ekmek
    println(beyazEkmek.miktar)
    beyazEkmek.miktar = 2
    println(beyazEkmek.miktar)


def constructortanimlamak()=
    class Ekmek(ekmekIsmi : String = "Beyaz"):
        val isim:String = ekmekIsmi

    // class Ekmek(ekmekIsmi : String = "Beyaz") {
    //     val isim:String = ekmekIsmi}

def methodtanimlamak()=
    class Ekmek(ekmekIsmi : String = "Beyaz",ekmekMiktar:Int = -1){
        val isim:String = ekmekIsmi
        val miktar:Int = ekmekMiktar
        
        def ucretHesap(birimFiyat:Int):Int = {
            birimFiyat*ekmekMiktar
        }
    }

