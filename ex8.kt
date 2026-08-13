fun matricular(nome: String, curso: String = "ADS", periodo: Int = 1) {
    println("$nome — $curso — ${periodo}º período")
}

fun main(){
    matricular("Pedro")
    matricular("Pedro", periodo = 2)
    matricular(periodo = 4, nome = "Pedro", curso = "Gastronomia")
}