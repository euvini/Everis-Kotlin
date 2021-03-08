package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val Lucas = Cliente(
        nome = "Lucas Queiroz",
        cpf = "054.565.888.74",
        clienteTipo = ClienteTipo.PF,
        senha = "231812"
    )
    println(Lucas)

    autenticacao().autentica(Lucas)
}