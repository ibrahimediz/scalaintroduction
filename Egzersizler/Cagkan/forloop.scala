import scala.io.StdIn.readLine
@main def run()=
    val x:Int=readLine("Sayıyı giriniz:").toInt
    var y:Int=0
      for (i <- 1 to x) {

        y+=i
            println(s"İşlem Sonucu $y")
    }
    
