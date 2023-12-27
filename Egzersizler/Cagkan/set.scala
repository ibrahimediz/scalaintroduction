import scala.io.StdIn.readLine
@main def run()={
  val aci1:Int=readLine("1.Açıyı Giriniz:")
  val aci2:Int=readLine("2.Açıyı Giriniz:")
   def aciHesapla(aci1: Int,aci2:Int):Int = 
        if (aci1 + aci2) < 180 then
            180 - (aci1 + aci2)
        else
            0
    def aciSetOlustur(aci1:Int,aci2:Int,aci3:Int)=
        val aciSet = Set(aci1,aci2,aci3)
        aciSet
def aciSetOlustur(aci1:Int,aci2:Int,aci3:Int)=
    val aciSet = Set(aci1,aci2,aci3)
        aciSet
    
    val tipMap = Map(1->"Eşkenar",2->"İkizkenar",3->"Çeşitkenar",90->"Dik")
 var aci3=aciHesapla(aci1,aci2)
 var aciSet=Set.empty[Int]
 if aci3 !=0 then
    aciSet=aciSetOlustur(aci1,aci2,aci3)

}