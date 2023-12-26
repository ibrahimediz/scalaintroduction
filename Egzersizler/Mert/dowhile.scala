import scala.io.StdIn.readLine

@main def run()= {
    val num: Int = readLine("Bir Sayi Giriniz: ").toInt

    var faktoriyel: Long = 1
    var i = 1

    while i <= num do{
        faktoriyel *= i
        i += 1
    }
    println(s"$num'nin faktoriyeli: $faktoriyel")
}