/* 
Sequences
Maps
Sets
*/
def tanimlama()=
    val sayilar = List(1,2,3,4,5)
    val isimler = List("Ahmet","Mehmet","Orçun")

    val isimler2 = "Ahmet"::"Mehmet"::"Orçun"::Nil
    // Nil boş liste anlamına gelir List() ile aynı şey

    /* 
    Nil bir nesnedir, bir fonksiyon veya değer değildir.
    Nil'in tipi List[Nothing]'dir.
    Nil'in tek bir örneği vardır.
    Nil'e herhangi bir eleman eklemek mümkün değildir.
    Nil'in boyutu 0'dır.
    */
    val elemenlar: List[String | Int | Double] = List(1,"İki",3.0)
    val elemanlarAny: List[Any] = List(1,"iki",3.0)

    val b = (1 to 5).toList  // List(List(1, 2, 3, 4, 5)
    val c = (1 to 10 by 2).toList // List(1, 3, 5, 7, 9)
    var e = (1 until 5).toList //  List(1, 2, 3, 4)
    var f = List.range(1,5) //  List(1, 2, 3, 4)
    var g = List.range(1,10,3) //  List(1, 4, 7)
    println(List(b,c,e,f,g))


@main def elemanEkleme()=
    val l1 = List(20,30,40)
    // başlangıca eleman eklemek için
    val l2 = 10 :: l1 // List(10, 20, 30, 40)
    // 1 den fazla eleman eklemek istersek
    val l3 = List(0,10) ::: l1 // List(0, 10, 20, 30, 40)
    println(List(l2,l3))
    // ya da 
    var l1a = List(20,30,40) 
    println(10 +: l1) // List(10, 20, 30, 40)
    println(l1 :+ 50) // List(20, 30, 40, 50)