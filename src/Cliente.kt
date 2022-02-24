class Cliente {

    var nomeDoCliente: String
    var emailDoCliente: String
    var cpfDoCliente: String

    constructor (

        nomeDoCliente: String,
        emailDoCliente: String,
        cpfDoCliente: String

    ) {
        this.nomeDoCliente = nomeDoCliente
        this.emailDoCliente = emailDoCliente
        this.cpfDoCliente = cpfDoCliente
    }

    override fun toString(): String {
        return super.toString()
    }

}