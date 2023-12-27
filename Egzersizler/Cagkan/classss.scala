class Musteri(var ad:String,var soyad:String):
    override def toString(): String = s"Adı Soyadı: $adi $soyad ==== Müşteri No: $musteriNo ===> $musteriTip"
    private var musteriNo :String ="" 
    private var musteriTip : Int = 0

     def this(
       ad:String,
       soyad:String,
       musteriNo:String="123",
    

    ) =
        this(ad,soyad)
        _musteriNo=musteriNo
    
    
     def this(
       ad:String,
       soyad:String,
       musteriTip:Int,
    

    ) =
        this(ad,soyad)
        _musteriTip=musteriTip


