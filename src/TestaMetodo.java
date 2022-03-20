public class TestaMetodo {
    public static void main(String[] args) {
        Carro fusca = new Carro();

        Carro chevete = new Carro();



        //fusca.transferenciaDeProprietario("alex");

        System.out.println(fusca.proprietario);
        System.out.println(fusca.zerokm);

        System.out.println(chevete.zerokm);
        System.out.println(chevete.proprietario);

        chevete.cor = "vermelho";

        System.out.println(chevete.cor);






    }
}
