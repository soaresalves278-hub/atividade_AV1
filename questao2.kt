fun auditarEntregas(enderecos: List<String?>) {
    for (endereco in enderecos) {
        val enderecoTratado = endereco ?: "Endereço Desconhecido"

        if (enderecoTratado == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoTratado")
        }
    }
}

fun main() {
    val lista = listOf("Rua das Flores, 123", null, "Avenida Brasil, 500", null)

    auditarEntregas(lista)
}