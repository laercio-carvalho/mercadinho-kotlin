class Produtos {
    fun resolucao(){
        println("Coloque o nome do que deseja comprar")
        val comeca = readLine()?:""
        println("Quantos $comeca você deseja comprar?")
        val quantidadeProduto = readLine()?.toIntOrNull()?:0

        val resultado = mercadoria(quantidadeProduto, comeca)
        println("O valor da compra total de $quantidadeProduto $comeca é: "+ resultado +"0 R$")
    }
    fun mercadoria(quantidade: Int, produto: String):Float{

        return when (produto){
            "3 Bombons"             -> quantidade * 0.5f
            "Absorventes"           -> quantidade * 5f
            "Agua com Gas"          -> quantidade * 2.5f
            "agua mineral"          -> quantidade * 2f
            "Agua Sanitaria"        -> quantidade * 3f
            "Bolacha Maria ou Agua/Sal" -> quantidade * 6f
            "Bombril"               -> quantidade * 0.5f
            "Cabo USB"              -> quantidade * 10f
            "Cachaça"               -> quantidade * 20f
            "Caneta"                -> quantidade * 2f
            "Cocada"                -> quantidade * 2.5f
            "Coloral"               -> quantidade * 2.5f
            "Cuzcuz"                -> quantidade * 3f
            "Detergente"            -> quantidade * 2.5f
            "Escova de Dentes"      -> quantidade * 5f
            "Esponja"               -> quantidade * 1.5f
            "Estrato de Tomate"     -> quantidade * 3f
            "Farinha de Mandioca"   -> quantidade * 10f
            "Farinha de Trigo"      -> quantidade * 6f
            "Feijão"                -> quantidade * 8f
            "Guarda-Chuva"          -> quantidade * 30f
            "Guardanapos"           -> quantidade * 2f
            "Maionese"              -> quantidade * 5f
            "Margarina"             -> quantidade * 4f
            "Meias"                 -> quantidade * 7f
            "Milho em Conserva"     -> quantidade * 4f
            "Oleo"                  -> quantidade * 10f
            "Oregano"               -> quantidade * 3f
            "Palito de Dentes"      -> quantidade * 1.5f
            "Pasta de Dentes"       -> quantidade * 5f
            "Pá"                    -> quantidade * 6f
            "Recheado"              -> quantidade * 3.5f
            "Refrigerante 2L"       -> quantidade * 6f
            "Refrigerante 250ml"    -> quantidade * 2f
            "Rodo"                  -> quantidade * 8f
            "Sabao em Pedra"        -> quantidade * 5f
            "Sabao em Pó"           -> quantidade * 5f
            "Sabonete"              -> quantidade * 4f
            "Sabonete Liquido"      -> quantidade * 10f
            "Sal"                   -> quantidade * 2f
            "Sardinha"              -> quantidade * 7f
            "Suco Frisco"           -> quantidade * 1.5f
            "Tempeiro Caseiro"      -> quantidade * 3.5f
            "Vassoura"              -> quantidade * 12f
            "Vinho São Braz"        -> quantidade * 10f
            "Vinagre"               -> quantidade * 3f
            else                        -> 0f
        }
    }
}