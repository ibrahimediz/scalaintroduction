enum KenarBoyutu:
    case Kucuk,Orta,Buyuk

enum KenarTipi:
    case Ince,Normal,Kalın

enum Malzeme:
    case Peynir,SiyahZeytin,Sucuk,YeşilZeytin


enum Color(val rgb: Int):
    case Red extends Color(0xFF0000)
    case Green extends Color(0x00FF00)
    case Blue extends Color(0x0000FF)


enum Gezegen(mass: Double,radius:Double):
    private final val G = 6.67300E-11
    def yuzeycekimi = G *mass / (radius*radius)
    def yuzeyagirligi(digermass : Double) = 
        digermass*yuzeycekimi

    case Merkur extends Gezegen(3.303e+23,2.4397e6)
    case Dunya extends Gezegen(5.976e+24,6.37814e6)

@main def run()=
    import KenarTipi.*
    val mevcutKenarTipi = Ince
    if mevcutKenarTipi == Ince then
        println("En ince kenar")

    mevcutKenarTipi match
        case Ince => println("Ince")
        case Normal => println("Normal")
        case Kalın => println("Kalın")

    import Gezegen.*
    val gezegen = Dunya
    println(gezegen.yuzeyagirligi(23))
