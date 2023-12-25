import scala.io.StdIn.readLine

@main def run()={
val num1 = readLine("Num1:").toInt
val num2 = readLine("Num2:").toInt
val toplam = num1 + num2
//println(s"Toplam:$toplam ")
println(s"Toplam:${num1+num2} ")
}