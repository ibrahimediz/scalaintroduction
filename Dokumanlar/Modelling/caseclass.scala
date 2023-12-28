case class Kisi(isim:String,iliski:String)

@main def run()=
    val ergun = Kisi("Ergun","Amca")
    println(ergun.isim)

    ergun match 
        case Kisi(isim,iliski) => println("İsim: "+ isim)
    
    var ayse = Kisi("Ayşe","Teyze")
    println(ayse == ergun)
    println(ergun)

    val mehmet = ergun.copy(isim="Mehmet")
    println(mehmet)