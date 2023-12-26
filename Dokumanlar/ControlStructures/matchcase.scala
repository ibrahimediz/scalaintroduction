
def matchcaseAnlatim()= {
    // val x = 10
    // val sonuc = x match {
    //     case 1 => "Bir"
    //     case 2 => "İki"
    //     case _ => "Bilinmeyen"
    // }
    // println(sonuc)

    // Birden fazla durumun eşleşmesi
    // val x = "Merhaba"

    // val result = x match {
    //     case "Merhaba" | "Selamlar" => "Selamlar"
    //     case "Hoşçakal" => "Güle Güle"
    //     case _ => "Bilinmeyen"
    // }
    // println(result)

    // tip kontrolü
    // val x: Any = 10
    // val result = x match
    //     case i: Int => i*2 /// -------------
    //     case s: String => s.length
    //     case _ => "Bilinmeyen Tip"
    // println(result)
    
    // val x = 10
    // var sonuc = x match
    //     case n if n %2 == 0 => "Çift" // Guards
    //     case _ => "Tek" // isteğe bağlıdır
}
//// default değerin kullanılması
import scala.io.StdIn.readLine

def run()= {
    val sayi = readLine("Sayıyı Giriniz").toInt
    val s1 = 300
    val sonuc = sayi match
        case 0 => println("0")
        case 1 => println("1")
        case gelen => println(s" kullanıcıdan gelen=>  $gelen")
}

@main def ornek3() =
    val sayi = 25
    sayi match
        case a if 0 to 9 contains a => println("0-9 aralığı: $a")
        case b if 10 to 19 contains b => println(s"10-19 aralığı: $b")
        case c if 20 to 29 contains c => println(s"20-29 aralığı: $c")
        case _ => println("Öyle mi")
    

def ornek2()=
    def doluBos(a :Matchable): Boolean = a match
        case 0 | "" | false => false
        case _ => true
    val x = 0
    println(doluBos(x))

def pattern(x: Matchable): String = x match {

  // constant patterns
  case 0 => "sıfır"
  case true => "doğru"
  case "hello" => "'merhaba' dedin"
  case Nil => "boş bir Liste"

  // sequence patterns
  case List(0, _, _) => "ilk elemanı 0 olan 3 elemanlı bir liste"
  case List(1, _*) => "1 ile başlayan ve herhangi sayıda elemanı olan bir liste"
  case Vector(1, _*) => "1 ile başlayan ve herhangi sayıda elemanı olan bir vektör"

  // tuple patterns
  case (a, b) => s"$a ve $b değerlerini aldım"
  case (a, b, c) => s"$a, $b ve $c değerlerini aldım"

  // constructor patterns
  // case Person(first, "Alexander") => s"Alexander, ilk adı = $first"
  // case Dog("Zeus") => "Zeus adında bir köpek buldum"

  // type test patterns
  case s: String => s"bir string aldım: $s"
  case i: Int => s"bir int aldım: $i"
  case f: Float => s"bir float aldım: $f"
  case a: Array[Int] => s"int dizisi: ${a.mkString(",")}"
  case as: Array[String] => s"string dizisi: ${as.mkString(",")}"
//   case d: Dog => s"köpek: ${d.name}"
  case list: List[?] => s"bir Liste aldım: $list"
  case m: Map[?, ?] => m.toString

  // the default wildcard pattern
  case _ => "Bilinmeyen"
}

    
