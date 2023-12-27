@main def run()={
    o1 = Vector("ali","berrin","ceren","efe","ali","betül")
    o2 = Vector(45,23,12,38,46)
     val v1=o1:::o2
     val v2 = o1.zip(o2)
     val v3=o2.map(_.toUpperCase) 
     val v4=o1.sortBy(_.length)
     val v5 = o1.drop(3)
     val v6 = o2.filter(_ % 3 == 0)
}