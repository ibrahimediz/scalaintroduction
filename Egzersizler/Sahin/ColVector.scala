@main def run()={
    val o1 = Vector("ali","berrin","ceren","efe","ali","betül")
    val o2 = Vector(45,23,12,38,46)
    
    val v1 = o1 ++ o2
    //val v1 = o1 ::: o2
    println("v1: "+v1)

    val v2 = o1.zip(o2)
    println("v2: "+v2)

    val v3 = o1.map(_.toUpperCase)
    println("v3: "+v3)

    val v4 = o1.sortBy(_.length())
    println("v4: "+v4)

    //var i = 0
    //while i > 1 do{
    //    o1.drop(i)
    //}
    //println("v5: "+o1)

    val v5 = o1.drop(3)
    println(v5)

    val v6 = o2.filter(_ % 3 == 0)
    println("v6: "+v6)
}

/* 
o1 = Vector("ali","berrin","ceren","efe","ali","betül")
o2 = Vector(45,23,12,38,46)
Yukarıdaki vektörlerden faydalanarak
1. v1 iki vektörü değişkeni içerisinde birleştirin
2. v2 zip metodu ile iki vektörü birleştirin
3. v3 o1 vektöründe tüm harfler büyük harfe dönsün
4. v4 o1 vektörü harf uzunluğuna göre sıralansın
5. v5 o1 vektörü 3. elemandan itibaren başlayacak şekilde temizlensin
6. v6 o2 vektöründeki 3 e bölünebilen sayılar listelensin
*/