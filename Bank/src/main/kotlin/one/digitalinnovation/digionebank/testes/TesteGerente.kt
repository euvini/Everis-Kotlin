package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val Vinicius = Gerente("Vinicius", "39815276866", 7000.0)
    imprimeRelatorio(Vinicius)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
