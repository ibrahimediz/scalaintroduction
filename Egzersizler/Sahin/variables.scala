
@main def casting()={
    // Implicit Cast
    val b: Byte = 127
    val i: Int = b

    val face: Char = 'e'
    val sayi:Int = face // 101
    println(sayi)
    // Explicit Cast
    val x: Long = 9_1115_4321L
    println(x)
    val y: Float = x.toFloat
    // val z: Long = y
    println(y)

}
