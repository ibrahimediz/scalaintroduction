/* 
kullanıcıdan alınan 5 harfi bir liste içerisinde ekleyip ekrana yazdıran scala kodunu yazınız
*/

import scala.io.StdIn.readLine

@main def run()=

    val list = readLine("List'i giriniz:").toList
    
    println(s"Girilen liste: $list")
   
    