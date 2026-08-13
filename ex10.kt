// 1) Função completa recebendo o comportamento (onClick) como parâmetro
fun botao(rotulo: String, onClick: () -> Unit) {
    println("[$rotulo] clicado")
    onClick() // Executa o código recebido
}

fun main() {
    // 2) Chamada usando a sintaxe de trailing lambda
    // A lambda sai dos parênteses porque é o último parâmetro
    botao("Enviar") {
        println("Ação executada: dados enviados com sucesso!")
    }
    
    botao("Cancelar") {
        println("Ação executada: operação cancelada.")
    }
}   