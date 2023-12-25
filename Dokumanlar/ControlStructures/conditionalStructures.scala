
@main def run()={
    val x = 10
    // if kullanımı
    if x % 2 == 0 then
        println("X çift bir sayıdır")

    // end if (opsiyonel)
    if x % 2 == 0 then
        println("X çift bir sayıdır")
    end if


    // else kullanımı
    if x > 5 then
        println("x 5'ten büyük")
    else 
        println("x 5'e eşit değil")

    // else if kullanımı
    val y:Int = 20
    if y > 25 then
        println("y 25 ten büyüktür")
    else if y > 15 then
        println("y 15 ile 25 arasındadır")
    else
        print("y 15 ten küçük veya eşit")
    
}