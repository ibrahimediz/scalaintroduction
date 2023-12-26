import scala.io.StdIn.readLine

/* 
girilen sayının faktoriyelini hesaplayan scala kodunu
while döngüsünü kullanarak yazınız
 */

 @main def run()={

    val sayi = readLine("Sayiyi giriniz:").toInt
    var faktoriyel = 1

    while faktoriyel =< sayi do
        faktoriyel= faktoriyel  * (faktoriyel+1)
    
       println(faktoriyel)  
}
