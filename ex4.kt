fun main() {
    val apelido: String? = null 
    println(apelido!!.uppercase())
    //Exception: java.lang.NullPointerException
}



fun main() {
    val apelido: String? = null ?:"SEM APELIDO"
    println(apelido?.uppercase())
}