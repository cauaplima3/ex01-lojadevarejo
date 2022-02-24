class Trasportadora{
    var nomeDaTrasportadora:String
    var cnpjDaTrasportadora:String
    var enderecoDaTrasportadora:String

    constructor(
        nomeDaTrasportadora: String,
        cnpjDaTrasportadora: String,
        enderecoDaTrasportadora: String
    ){
        this.nomeDaTrasportadora = nomeDaTrasportadora
        this.cnpjDaTrasportadora = cnpjDaTrasportadora
        this.enderecoDaTrasportadora = enderecoDaTrasportadora
    }

    override fun toString(): String {
        return super.toString()
    }
}