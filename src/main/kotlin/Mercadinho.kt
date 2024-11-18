fun main() {
    val autenticacao = Autenticacao()
    val entradaDeDados = Entrada()
    val produto = Produtos()
    if (autenticacao.autentica().startsWith("Seja bem-vindo",ignoreCase = true)) {
        entradaDeDados.mainAutenticado()
        produto.resolucao()
    }else{
        println("Autenticação falhou: Tente novamente!")
    }
}