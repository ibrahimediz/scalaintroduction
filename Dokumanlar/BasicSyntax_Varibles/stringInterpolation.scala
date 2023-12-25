import scala.io.StdIn.readLine

@main def run()={
val isim = readLine("İsiminiz Nedir:")
val yas = readLine("Yaşınız").toInt
println(s"$isim $yas yaşında ")

// yukarıda yer alan örnekten faydalanarak girilen iki sayının toplamını ekrana yazdıran scala kodunu yazınız
// strinter.scala


// ##################### s interpolation
// val isim = "Ahmet"
// val yas = 30
// val metin = s"$isim $yas yaşında"
// val metin2 = s"${2+yas} ${-1.abs}"
// println(metin2)
// var kelime = "Dolar"
// // println(s"Ahmet bey  $$kelime  ile mi maaş alıyorsunuz!") TODO : incele
// // val metin3:String = """
// //                     Merhaba Scala Eğitimine Hoşgeldiniz
// //                 adres : www.scala.com
// // """
// // println(metin3)
// val isim1 = "Ahmet"
// val yas1 = 30
// println(s"""{"isim":"$isim1"}""")
// println(s"""isim:"$isim",
//         |yas:$yas1""".stripMargin)


// ############## f interpolation
// val boy = 1.92312d
// val isim = "Subutay"
// println(f"$isim%s 'in boyu $boy%2.2f kadardır")
// println(f"3/19 20%% 'den daha küçüktür")

// ############### raw interpolation
// println("a\nb")
// println(raw"a\nb")
}

