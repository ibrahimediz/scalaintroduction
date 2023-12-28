class Musteri(MusteriIsmi : String = "ALi",MusterisoyIsmi:String="veli",Tutar:double=123){
        val isim:String = MusteriIsmi
        val surname:String=MusterisoyIsmi
        var tutar:double=tutar

        def parayatır(balance:Int){
            balance=balance+tutar
        }
          def paracek(balance:Int){
            balance=balance-tutar
        }
}
