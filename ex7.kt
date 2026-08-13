fun saudacao(nome: String, prefixo: String = "Olá") = "$prefixo, $nome!"

fun main(){
    println(saudacao("João")) //Olá, João!
    println(saudacao("Maria", "Boa noite")) //Boa noite, Maria!
}