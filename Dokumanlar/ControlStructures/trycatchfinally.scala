import scala.io.StdIn.readLine

@main def run()=
    try
        val s1:Int = readLine("1. Sayıyı Giriniz:").toInt
        val s2:Int = readLine("2. Sayıyı Giriniz:").toInt
        // NumberFormatException
        // ArithmeticException
        println(s1/s2)
    catch
       case nfe: NumberFormatException =>  println("Hata var")
       case aex: ArithmeticException => aex.printStackTrace()
    finally
        // Kaynaklar kapanmalıdır
        println("İyi Günler")
