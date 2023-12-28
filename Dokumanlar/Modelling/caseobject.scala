import Mesaj.SarkiCal
sealed trait Mesaj:
    case class SarkiCal(isim:String) extends Mesaj
    case class SesYukselt(miktar:Int) extends Mesaj
    case class SesAlcalt(miktar:Int) extends  Mesaj
    case object CalmayiDurdur extends Mesaj

// def mesalariIsle(mesaj: Mesaj): Unit = mesaj match
//     case SarkiCal(isim) => sarkiCal(isim)
//     case SesYukselt(miktar) => sesYuklet(miktar)


// @main def run()=