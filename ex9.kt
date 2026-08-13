fun main() {
    val nomes = listOf("Ana", "Beatriz", "Caio", "Daniela")
    
    // 1) declare a lambda emMaiusculas
    val emMaiusculas: (String) -> String = {texto -> texto.uppercase()}
    println(emMaiusculas("teste"))
    
    // 2) versão com parâmetro nomeado
    val resultadoNomeado = nomes.filter {nome -> nome.length > 4}.map {nome -> emMaiusculas(nome)}
	println("$resultadoNomeado")
    // [BEATRIZ, DANIELA]
    
    // 3) versão com it
    val resultadoIt = nomes.filter { it.length > 4 }.map {emMaiusculas(it)}

    println("$resultadoIt")
    // [BEATRIZ, DANIELA]
}
