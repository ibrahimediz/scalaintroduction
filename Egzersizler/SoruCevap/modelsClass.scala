/* 
Araba ya da Müşteri analojisini kullanarak 
1. Class üretin
2. Class üzerinden 4 farklı fields olsun
3. run fonksiyonu içerisinde bu field lardan 2 sini değiştirin
4. toString Fonksiyonunu override ederek tüm alanların olduğu yeni bir değer oluşturun
5. son iki field alanına varsayılan değerler atanmış olsun 
6. bu değerler olmadan ve bu değerleri dahil ederek yeni örnekler türetelim
*/

// 1 ve 2
class Car(var marka:String, var model:String, var yil:Int=2010, var renk:String="Kırmızı"): //5. 
    override def toString(): String = s"marka:$marka, model:$model, yil:$yil, renk:$renk"  // 4.
    //override def toString(): String = s"zamanAsimi: $zamanAsimi, bekleme:$bekleme"

@main def run()={
    var c1 = Car("VW","Golf",2020,"Beyaz")
    //println(c1)
    println(c1.marka+" "+c1.model)
    println(c1.yil)
    println(c1.renk)

    // 3.
    c1.yil=2022 
    c1.renk="Siyah"

    //println(c1)
    println(c1.marka+" "+c1.model)
    println(c1.yil)
    println(c1.renk)

    //val c2 = Car()
    //println(c2.toString("Audi"))
    val c3 = Car("Fiat","Şahin") // 6.
    println(c3.toString())
}