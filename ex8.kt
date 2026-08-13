fun matricular(nome: String, curso: String = "ADS", periodo: Int = 1) {
    println("$nome — $curso — ${periodo}º período")
}

fun main(){
    matricular("Pedro") //Pedro — ADS — 1º período
    matricular("Pedro", periodo = 2) //Pedro — ADS — 2º período
    matricular(periodo = 4, nome = "Pedro", curso = "Gastronomia") //Pedro — Gastronomia — 4º período
}
