/*
iki açısı girilen bir üçgenin üçüncü açısını hesapladıktan sonra
1. set koleksiyonunu kullanarak bu üçgenin tipini belirleyiniz
2. seçenekleri bir map içerisinde tutularak ekrana yansıtılmalıdır.
Seçenekler:
    "İkizkenar Üçgen"
    "Dik Üçgen"
    "Eşkenar Üçgen"
    "Çeşit Üçgen"
*/

import  scala.io.StdIn.readLine

@main def run()={
    val aci1:Int = readLine("1. Açıyı Giriniz:").toInt // aci1 bilgisi isteniyor
    val aci2:Int = readLine("2. Açıyı Giriniz:").toInt // aci1 bilgisi isteniyor

    def aciHesapla(aci1: Int,aci2:Int):Int = // 3 açının toplamının 180 olması kontrol edilip 3. açı değeri dönüyor
        if (aci1 + aci2) < 180 then
            180 - (aci1 + aci2)
        else
            0

    def aciSetOlustur(aci1:Int,aci2:Int,aci3:Int)= // açı değerleri tekrarsız koleksiyon olan Set ile sadeleştiriliyor.
        val aciSet = Set(aci1,aci2,aci3)
        aciSet
    val tipMap = Map(1->"Eşkenar",2->"İkizkenar",3->"Çeşitkenar",90->"Dik")  // aci kümesinin eleman sayısına göre tip belirleniyor

    var aci3 = aciHesapla(aci1,aci2)
    var aciSet = Set.empty[Int]
    if aci3 != 0 then // aci toplamlarında sorun yoksa 
        aciSet =  aciSetOlustur(aci1,aci2,aci3)
    else
        println("Açılarda Hata!!!")
    if !aciSet.isEmpty then  // ! işareti ile ifade olumsuza döndü
        println(s" ${tipMap(aciSet.size)} Üçgen")
    else
        println("Set oluşturmada hata var")
    if aciSet.contains(90) then // herhangi bir açı 90 ise bu bir dik üçgendir.
        println(s" ${tipMap(90)} Üçgen")  

    

}