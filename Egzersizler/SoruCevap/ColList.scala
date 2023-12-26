/* 
kullanıcıdan alınan 5 harfi bir liste içerisinde ekleyip ekrana yazdıran scala kodunu yazınız
*/
import scala.io.StdIn.readLine

@main def run()={
    // Boş bir liste oluştur
    var isimListesi: List[String] = List()

    // Kullanıcıdan 5 isim al ve listeye ekle
    for (i <- 1 to 5) {
      val isim = scala.io.StdIn.readLine(s"Lütfen $i. ismi giriniz: ")
      isimListesi = isimListesi :+ isim
    }

    // İsim listesini ekrana yazdır
    println("Sıralı İsim Listesi: " + isimListesi)
  }

