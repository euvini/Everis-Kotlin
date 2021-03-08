package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val Vinicius = Gerente("Vinicius", "39815276866", 7000.0, "senha2318")
    imprimeRelatorio(Vinicius)
    autenticacao().autentica(Vinicius)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())