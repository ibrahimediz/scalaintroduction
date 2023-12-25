import scala.io.StdIn.readLine

@main def run()={
val num1:Int  = readLine("Sayi giriniz:").toInt
var num2:Int=0
for (i <- 1 to num1)
do num2 += i
println{s"Sonuc: $num2"}
val num1:Int  = readLine("Sayi giriniz:").toInt
var num2:Int=0
for (i <- 1 to num1)
do num2 += i
println{s"Sonuc: $num2"}
}

/* Yukarıdaki örnekten faydalanarak girilen bir sayının değişkene alınarak
sıfırdan girilen sayıya kadar olan tüm sayıların toplamını ekrana yazan scala kodunu yazınız
*/