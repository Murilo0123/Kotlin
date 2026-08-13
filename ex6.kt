data class Endereco(val cidade: String?)
data class Aluno(val nome: String, val endereco: Endereco?)
 
fun main() {
    val ana = Aluno("Ana", null)
    val beto = Aluno("Beto", Endereco("São Paulo"))
    val caio = Aluno("Caio", Endereco(null))
    // complete aqui
    val alunos = listOf(ana, beto, caio)
    
    for (aluno in alunos){
        val cidade = aluno.endereco?.cidade ?:"não informada"
        println("Aluno: ${aluno.nome}, cidade: ${cidade}")
    }
}


//Aluno: Ana, cidade: não informada
//Aluno: Beto, cidade: São Paulo
//Aluno: Caio, cidade: não informada