class Vendedor {
    var nomeDoVendedor: String
    var dataDeNascimentoDoVendedor: String
    var cpfDoVendedor: String
    var emailDoVendedor: String
    var cargaHoraria: Byte
    var telefoneDoVendedor: String
    var enderecoDoVendedor: String
    var ramalDoVendedor: Short
    var generoDoVendedor: String

    constructor(
        nomeDoVendedor: String,
        dataDeNascimentoDoVendedor: String,
        cpfDoVendedor: String,
        emailDoVendedor: String,
        cargaHoraria: Byte,
        telefoneDoVendedor: String,
        enderecoDoVendedor: String,
        ramalDoVendedor: Short,
        generoDoVendedor: String
    ){
        this.nomeDoVendedor = nomeDoVendedor
        this.dataDeNascimentoDoVendedor = dataDeNascimentoDoVendedor
        this.cpfDoVendedor = cpfDoVendedor
        this.emailDoVendedor = emailDoVendedor
        this.cargaHoraria = cargaHoraria
        this.telefoneDoVendedor = telefoneDoVendedor
        this.enderecoDoVendedor = enderecoDoVendedor
        this.ramalDoVendedor = ramalDoVendedor
        this.generoDoVendedor = generoDoVendedor
    }

    override fun toString(): String {
        return super.toString()
    }
}
