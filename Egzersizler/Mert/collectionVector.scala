@main def run()= {
    val o1 = Vector("ali","berrin","ceren","efe","ali","betül")
    val o2 = Vector(45,23,12,38,46)

    //1
    val v1 = o1 ++ o2
    println(v1)

    //2
    val v2 = o1.zip(o2)
    println(v2)

    //3
    val v3 = o1.map(_.toUpperCase)
    println(v3)

    //4
    val v4 = o1.sortBy(_.length)
    println(v4)

    //5
    val v5 = o1.drop(2)
    println(v5)

    //6
    val v6 = o2.filter(_ % 3 == 0)
    println(v6)
}