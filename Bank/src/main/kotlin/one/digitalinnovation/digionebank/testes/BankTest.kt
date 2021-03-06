package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Bank

fun main() {
    val digiOneBank = Bank(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
}