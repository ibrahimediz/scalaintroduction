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

    val b = (1 to 5).toList  // List(1, 2, 3, 4, 5)
    val c = (1 to 10 by 2).toList // List(1, 3, 5, 7, 9)
    var e = (1 until 5).toList //  List(1, 2, 3, 4)
    var f = List.range(1,5) //  List(1, 2, 3, 4)
    var g = List.range(1,10,3) //  List(1, 4, 7)
    println(List(b,c,e,f,g))


def elemanEkleme()=
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

def erisim()=
    val l1 = List(20,30,40)
    var ilkEleman: Int = l1(0)
    println(ilkEleman)

def silme()=
    val l1 = List(20,30,40,50,60,70)
    val filterList = l1.filter(_!=40)
    val filterNotList = l1.filterNot(_!=40)
    println(filterList)
    println(filterNotList)

def birlestime()=
    var al1:List[Any] = List(20,30,40)
    var al2:List[Any] = List(200,300,400)
    val asonuc = al1 +: al2 // bir eleman olarak eklendi
    println(asonuc) // List(List(20, 30, 40), 200, 300, 400)
    //-----------------
    var bl1:List[Any] = List(20,30,40)
    var bl2:List[Any] = List(200,300,400)
    val bsonuc = bl1 ++ bl2 // iki listeyi tek listede birleştirmek
    println(bsonuc) // List(20, 30, 40, 200, 300, 400)


        // println(s" => $")
@main def yfonksiyonlar()=
    val sayilar = List(1,2,3,4,5)
    // head ve tail
    val ilkEleman = sayilar.head // 1
    val geriKalan = sayilar.tail // 2,3,4,5

    println(s"ilkEleman => $ilkEleman")
    println(s"geriKalan => $geriKalan")

    // isEmpty
    println(sayilar.isEmpty)

    // length
    println(sayilar.length)

    // map 
    val kareList = sayilar.map(x=>x*x)
    println(kareList)

    // foldLeft
    val toplam = sayilar.foldLeft(0)((acc,x) => acc + x)
    println(s"foldLeft => $toplam") // foldLeft => 15