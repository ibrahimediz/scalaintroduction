@main def run()=
    var sayilar = List(1,2,3,4)
    var ikiKatlar = sayilar.map(_ * 2) // List(2,4,6)
    println(ikiKatlar)
    /* 
        _ * 2 => Verilen her elemanı 2 ile çarp
    */
    var ikiKatlar1 = sayilar.map((i:Int) => i*2)
    var ikiKatlar2 = sayilar.map((i) => i*2)
    var ikiKatlar3 = sayilar.map(i => i*2)
    println(ikiKatlar1)
    println(ikiKatlar2)
    println(ikiKatlar3)
    