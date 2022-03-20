public class CriaObjetoCarroSemPessoa {
    public static void main(String[] args) {
     Carro carroDoAlex = new Carro();

     carroDoAlex.proprietario = new Pessoa();

        carroDoAlex.proprietario.setNome("Josão");

        System.out.println(carroDoAlex.proprietario.nome);

        System.out.println(carroDoAlex.proprietario);




    }
}
