@main def run() = {
    var list: List =List(1,1,2,3,5,8,13,21,55,89)
    var kareList = list.map(i => i*i)
    println(kareList)
}