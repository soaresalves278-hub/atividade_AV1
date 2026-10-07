fun main() {
    validarBioInfantil("Gosto de desenhar!")
    validarBioInfantil(null)
    validarBioInfantil("Texto gigante que passa do limite de cinquenta caracteres permitidos...")
}

fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}