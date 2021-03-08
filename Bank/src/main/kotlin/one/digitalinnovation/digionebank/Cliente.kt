package one.digitalinnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
    ) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "231812" == senha

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}