/* 
kullanıcıdan alınan 5 harfi bir liste içerisinde ekleyip ekrana yazdıran scala kodunu yazınız
*/
import scala.io.StdIn.readLine

@main def run()=
    var isimler:List[String] = List("")
    for i <- 1 to 5 do
        var isim = readLine(s"$i. ismi giriniz")
        isimler = isimler +: isimler
    println(isimler)