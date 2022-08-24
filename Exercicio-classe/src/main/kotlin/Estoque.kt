object Estoque {
    package storeclass

    object Store {

        val listaProdutos = mutableListOf<String>()

        fun addProdutos(produto: String){
            listaProdutos.add(produto)
        }
    }
}