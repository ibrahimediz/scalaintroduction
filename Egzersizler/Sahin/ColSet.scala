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
    for (i <- 1 to 2) {
        val ac = scala.io.StdIn.readLine(s"Lütfen $i. açıyı giriniz: ")
        aclist = aclist :+ ac
    }
}
