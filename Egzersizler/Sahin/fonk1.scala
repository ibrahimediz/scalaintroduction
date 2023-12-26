@main def run()=
    var sayi = List(1,1,2,3,5,8,13,21,34,55,89)
    var sayikare = sayi.map(i => i*i)
    println(sayikare)


/* 
List(1,1,2,3,5,8,13,21,34,55,89)
1. Yukarıda yer alan listeyi bir değişkene atayınız
2. Map fonksiyonu ile liste içerisinde yer alan her bir elemanın karesini tekrar bir liste içerisine aktarınız
3. sonucu ekrana yazdırınız
 */