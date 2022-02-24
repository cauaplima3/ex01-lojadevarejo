class Fornecedor{
    var cnpjDoFornecedor:String
    var razaoSocial:String
    var nomeFantasia:String
    var telefoneDoFornecedor:String
    var enderecoDoFornecedor:String

    constructor(
        cnpjDoFornecedor: String,
        razaoSocial: String,
        nomeFantasia: String,
        telefoneDoFornecedor: String,
        enderecoDoFornecedor: String
    ){
        this.cnpjDoFornecedor = cnpjDoFornecedor
        this.enderecoDoFornecedor = enderecoDoFornecedor
        this.telefoneDoFornecedor = telefoneDoFornecedor
        this.nomeFantasia = nomeFantasia
        this.razaoSocial = razaoSocial
    }

    override fun toString(): String {
        return super.toString()
    }
}

