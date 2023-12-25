import scala.io.StdIn.readLine
@main def run()={
  val isimler=List("++Ali","++Veli","++Buse")

  var Isim = for isim <- isimler yield
    val temiz=isim.drop(2)
    val harf= temiz.toLowerCase()
    harf
    println(Isim)


    val sayilar= 1 to 120 by 22
    val t2=for sayi<-sayilar
    if sayi %4== 0
    yield sayi *2
    }
