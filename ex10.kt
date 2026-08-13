fun botao(rotulo: String, onClick: () -> Unit) {
    println("[$rotulo] clicado")
    onClick()
}

fun main() {
    
    botao("Enviar") {
        println("Ação executada: dados enviados com sucesso!")
        //[Enviar] clicado
        //Ação executada: dados enviados com sucesso!
    }
    
    botao("Cancelar") {
        println("Ação executada: operação cancelada.")
        //[Cancelar] clicado
        //Ação executada: operação cancelada.
    }
}   
