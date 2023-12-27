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

 import scala.io.StdIn.readLine

 @main def run()={

val aci1 = readLine("Lütfen 1. açıyı giriniz: ").toInt
val aci2 = readLine("Lütfen 2. açıyı giriniz: ").toInt

val aci3 = 180 - (aci1+aci2)

def aciSetOlustur(aci1:Int, aci2:Int, aci3:Int)=
    val aciSet = Set(aci1,aci2,aci3)
    aciSet

val tipMap = Map(1->"Eşkenar", 2->"İkizkenar", 3->"ÇeşitKenar",4->"Dik")

aciSetOlustur(aci1,aci2,aci3)

 }