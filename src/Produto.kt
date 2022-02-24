class Produto{
    var nomeDoProduto:String
    var idDoProduto:Long
    var tipoDoProduto:String
    var precoDoProduto:String
    var fornecedorDoProduto:Fornecedor

    constructor(
        nomeDoProduto: String,
        idDoProduto: Long,
        tipoDoProduto: String,
        precoDoProduto: String,
        fornecedorDoProduto: Fornecedor
    ){
        this.nomeDoProduto = nomeDoProduto
        this.idDoProduto = idDoProduto
        this.tipoDoProduto = tipoDoProduto
        this.precoDoProduto = precoDoProduto
        this.fornecedorDoProduto = fornecedorDoProduto
    }

    override fun toString(): String {
        return super.toString()
    }
}