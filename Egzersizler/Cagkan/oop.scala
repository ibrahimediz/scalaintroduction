class Musteri(MusteriIsmi : String = "ALi",MusterisoyIsmi="veli"){
        val isim:String = MusteriIsmi
        val surname:String=MusterisoyIsmi
        var mevduat:Int=
       
}
class BankaHesabı(Hesap_no:Hesap,IP_ID:String){
    private def getIcerikName:String={
        icerik.mkString(", ")
    }

    def getTanim:String = {
        s"Hesap ${ekmek.isim} ekmeği ile $getIcerikName içeriğine sahiptir"
    }

    def addIcerik(ekstraIcerik:String):Unit={
        icerik.append(ekstraIcerik)
    }
}