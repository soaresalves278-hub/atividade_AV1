fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10.0
        "PROMO20" -> valor - 20.0
        else -> valor
    }
}

fun main() {
    print("Digite o valor do produto: ")
    val valor = readln().toDouble()

    print("Digite o cupom (ou aperte Enter para nenhum): ")
    val textoDigitado = readln()

    val cupom = if (textoDigitado == "") null else textoDigitado

    val resultado = calcularDesconto(valor, cupom)
    println("Valor a pagar: R$ $resultado")
}