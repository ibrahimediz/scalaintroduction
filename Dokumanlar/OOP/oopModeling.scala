/* 
trait
mixin
class
instances
subtyping
access modifier
*/

// trait Showable:
//     def show: String
trait Showable:
    def show: String // abstract members
    def showHtml = "<p>" + show + "</p>" // concrete members

class Document(text: String) extends Showable:
    def show = text

trait SelamlamaServisi:
    def cevir(text: String):String
    def merhabaDe = cevir("Merhaba")

trait CeviriServisi:
    def cevir(text:String):String = "..."

trait ComposedServis extends SelamlamaServisi,CeviriServisi
// Sınıf tanımlama
class Servisim(isim:String) extends  ComposedServis,Showable:
    def show = s"$isim $merhabaDe"

def bolum1()=
    val s1:Servisim = Servisim("Servis 1")
    println(s1.show)
    // Subtyping
    val s2:SelamlamaServisi = s1
    val s3:CeviriServisi = s1
    val s4:Showable = s1 


open class Kisi(isim: String)
class YazilimGelisitirici(isim: String,favoriDil:String) extends  Kisi(isim)
def bolum2()=
    val k=Kisi(isim="Ali")


class Counter:
    private var currentCount=0
    def tick():Unit = currentCount += 1
    def count: Int = currentCount

@main def run()=
    val c1 = Counter()
    println(c1.count)
    c1.tick()
    c1.tick()
    println(c1.count)

