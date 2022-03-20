class Carro {
    String cor;
    double preco;
    boolean zerokm = true;
    String tipo;
    int portas;
    String proprietario;

    public boolean transferenciaDeProprietario(String novodono) {
        this.proprietario = novodono;
        this.zerokm = false;
        System.out.println("transferència executada com sucesso");
        return true;
    }
}

