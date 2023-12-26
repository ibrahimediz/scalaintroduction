@main def run()={
    var sayi = List(1,1,2,3,5,8,13,21,34,55,89)
    var sayikare = sayi.map((i:Int) => i*i)
    println(sayikare)
}