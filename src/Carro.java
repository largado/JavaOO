class Carro {
    String cor;
    double preco;
    boolean zerokm = true;
    String tipo;
    int portas;
    Pessoa proprietario;
    //private Pessoa proprietario;
    //Pessoa proprietario = new Pessoa(); -> também pode ser feito

    public boolean transferenciaDeProprietario(Pessoa novodono) {
        this.proprietario = novodono;
        this.zerokm = false;
        System.out.println("transferència executada com sucesso");
        return true;
    }
}

