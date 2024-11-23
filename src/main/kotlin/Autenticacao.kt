class Autenticacao {
    fun autentica(): Boolean{
        println("Digite o nome do Usuário:"); val usuario = readlnOrNull()
        println("Digite a sua Senha:"); val senha = readlnOrNull()
        return if (usuario == "laercio" && senha == "SemTelhaVermelha") true else false
    }
}