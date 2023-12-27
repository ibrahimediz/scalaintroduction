object StringUtil{
    def toUpperCase(input: String):String = input.toUpperCase
    def toLowerCase(input: String):String = input.toLowerCase
    def capitalize(input: String):String = input.capitalize
    val slogan = "Jamiryo"
}

@main def run()=
    import StringUtil.* // paketten veya dışarıdan gelirse
    println(toUpperCase("Garanti"))
    println(toLowerCase("SCALA"))
    println(capitalize("digital"))
    println(slogan)
    // import StringUtil.{toUpperCase,toLowerCase}

