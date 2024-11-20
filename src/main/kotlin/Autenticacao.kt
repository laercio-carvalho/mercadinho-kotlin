class Autenticacao {
    fun autentica(): String{
        println("Digite o nome do Usuário:"); val usuario = readlnOrNull()
        println("Digite a sua Senha:"); val senha = readlnOrNull()
        return if (usuario == "laercio" && senha == "SemTelhaVermelha")
            "Seja bem-vindo: $usuario!"
        else "Usuário ou Senha Inválido(s)"
    }
}