/* hesapnumarası ve bakiye özelliklerine sahip bir banka hesap sınıfı oluşturan bir scala kodu yazalım
Hesaba para yatırma ve çekme yöntemleri tanımlayalım
*/

class Hesap(hesapNumarası:Long , bakiye:Double ){
        val hesapNumarası:Long = hesapNumarası
        val bakiye:Double = bakiye
        
        def paraYatir(miktar:Int):Int = {
            bakiye = bakiye+miktar;
        }
        def paraCek(miktar:Int):Int = {
            bakiye = bakiye-miktar;
        }
         def getBakiye:String = {
        s"Bu hesapta ${ekmek.isim} TL bulunmaktadır"
    }
}

@main def run()=
    val hesap1 = new Hesap(123, 1500)
    hesap1.paraCek(200)
    hesap1.paraYatir(100)
    println(hesap.getBakiye)