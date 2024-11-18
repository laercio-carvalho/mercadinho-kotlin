class Autenticacao {
    fun autentica(): String{
        val usuario: String?
        val senha: String?
        println("Digite o nome do Usuário:"); usuario = readlnOrNull()
        println("Digite a sua Senha:"); senha = readlnOrNull()
        return if (usuario == "laercio" && senha == "SemTelhaVermelha"){
            "Seja bem-vindo: $usuario!"
        }else{
            "Usuário ou Senha Inválido(s)"
        }
    }
}