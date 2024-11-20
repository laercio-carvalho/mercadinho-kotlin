class Entrada {
    fun mainAutenticado() {
        println("Informe o nome do Cliente:");                      val nomeCliente: String = readLine()?:""
        println("Seja bem-vindo $nomeCliente")
    }
}