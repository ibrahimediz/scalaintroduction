/* hesapnumarası ve bakiye özelliklerine sahip bir banka hesap sınıfı oluşturan bir scala kodu yazalım
Hesaba para yatırma ve çekme yöntemleri tanımlayalım
*/

class Account(id: Int=1, bal: Double=100){
    val accountNo:Int = id
    val balanceAmnt:Double = bal
}

class Parayatir(account:Account){
    private def getAccount:Int={
        
    }
}