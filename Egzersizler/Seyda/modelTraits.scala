/* 
Müşteri Bilgisini iki farklı trait üzerinden gruplandırıp oluşturulacak 
bir müşteri classına extend yapalım.
Bu class üzerinden örnek türetip ekrana yazdıralım
*/
trait Address:
    def city: String
    def zipCode: Int

trait Person:
    def name: String
    def age: Int

class Customer(custId: Int) extends Address,Person {
    val city="Istanbul"
    val zipCode=3434
    val name="Seyda"
    val age=30
}


@main def run()=
    val cust1 = Customer(1)
    println(cust1)