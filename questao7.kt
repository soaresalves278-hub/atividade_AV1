fun main() {
    val listaEmails = listOf("cliente@email.com", null, "", "suporte@empresa.com", "")
    limparBancoDeDados(listaEmails)
}

fun limparBancoDeDados(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        val tamanho = email?.length ?: 0

        if (tamanho == 0) {
            contasInvalidas++
            println("Aviso: Conta invalida/nula detectada. Agendada para delecao.")
        } else {
            println("Conta valida: $email")
        }
    }

    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}