import scala.io.StdIn.readLine

@main def run()= {
    val aci1:Int = readLine(s"1. aciyi girin: ").toInt
    val aci2:Int = readLine(s"2. aciyi girin: ").toInt
    val aci3:Int = 0

    def aciHesapla(aci1: Int, aci2:Int):Int = {
        if (aci1 + aci2) < 180 then
            aci3 = 180 - aci1 - aci2
        else
            0
    }
    
    def aciSetOlustur()={
        
    }
}