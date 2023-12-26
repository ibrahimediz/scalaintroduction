@main def run()={
    var sayilar = List(1,1,2,3,5,8,13,21,34,55,89)
    var kat = sayilar.map(_ * 2) 
    println(kat)
}