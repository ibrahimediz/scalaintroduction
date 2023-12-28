class BankaHesabi(val hesapNumarasi: String, val bakiye: Double){
    def hesapBilgileri(): Unit= {
        println(s"Hesap numarasi: $hesapNumarasi olan hesabinizda $bakiye bulunmaktadir.")
    
    def paraYatir(miktar: Double): Unit = {
        bakiye += miktar
        println(s"$miktar yatirildi. Yeni bakiyeniz: $bakiye")
    }
    }
}