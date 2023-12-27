import scala.io.StdIn.readLine

@main def createList() = {
    val size: Int = 5
    var list = List[String]()
    for i <- 1 to size do {
        val param = readLine(s"$i. ismi girin: ")
        list = list :+ param
    }
    println(list)
}