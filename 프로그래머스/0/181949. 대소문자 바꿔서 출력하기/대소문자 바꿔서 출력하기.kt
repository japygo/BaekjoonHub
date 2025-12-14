fun main(args: Array<String>) {
    val s1 = readLine()!!
    val result = s1.map {
        if (it in 'a'..'z') it.uppercase()
        else it.lowercase()
    }
    println(result.joinToString(""))
}