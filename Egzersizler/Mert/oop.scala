class BankaHesabi(val hesapNumarasi: String, val bakiye: Double){
    def hesapBilgileri(): Unit= {
        println(s"Hesap numarasi: $hesapNumarasi olan hesabinizda $bakiye bulunmaktadir.")
    }
    def paraYatir(miktar: Double): Unit = {
        bakiye += miktar
        println(s"$miktar yatirildi. Yeni bakiyeniz: $bakiye")
    }

    def paraCek(miktar: Double): Unit = {
        bakiye -= miktar
        println(s"$miktar cekildi. Yeni bakiyeniz: $bakiye")
    }
}

@main def run()= {
    val hesap = new BankaHesabi("12345678", 1000.0)

    hesap.hesapBilgileri()
    hesap.paraYatir(200.0)
    hesap.paraCek(600.0)
    
}