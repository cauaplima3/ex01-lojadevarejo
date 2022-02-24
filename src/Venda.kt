class Venda {
    var formaDePagamento: Array<String>
    var numeroDoCartao: String
    var nomeDoCartao: String
    var validadeDoCartao: Short
    var cvvDoCartao: String
    var cpfDoComprador: String
    var quantidadeDeParcelas: Array<String>

    constructor(
        formaDePagamento: Array<String>,
        numeroDoCartao: String,
        nomeDoCartao: String,
        validadeDoCartao: Short,
        cvvDoCartao: String,
        cpfDoComprador: String,
        quantidadeDeParcelas: Array<String>
    ){
        this.formaDePagamento = formaDePagamento
        this.numeroDoCartao = numeroDoCartao
        this.nomeDoCartao = nomeDoCartao
        this.validadeDoCartao = validadeDoCartao
        this.cvvDoCartao = cvvDoCartao
        this.cpfDoComprador = cpfDoComprador
        this.quantidadeDeParcelas = quantidadeDeParcelas
    }

    override fun toString(): String {
        return super.toString()
    }
}