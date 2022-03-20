public class CriaObjetoPessoa {
    public static void main(String[] args) {
        Pessoa alex = new Pessoa();
        alex.nome = "Alexandro";
        alex.cpf = "134";

        Carro carroDoAlex = new Carro();
        carroDoAlex.zerokm = true;
        carroDoAlex.proprietario = alex;

        System.out.println(carroDoAlex.proprietario.nome);

        System.out.println(carroDoAlex.proprietario);

        System.out.println(alex);


    }

}
