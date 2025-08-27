import Desafio2.Carro;
import Desafio2.Moto;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Ford Ka", 2020, 4);
        Moto moto = new Moto("Yamaha", "Yamaha MT-03", 2022, 321);

        carro.exibirInfo();
        moto.exibirInfo();
    }

}
