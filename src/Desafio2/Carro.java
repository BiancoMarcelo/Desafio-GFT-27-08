package Desafio2;

public class Carro extends Veiculo{
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override
    public void exibirInfo(){
        System.out.printf("Carro: %s, Ano: %s, %s portas.\n", getModelo(), getAno(), portas);
    }


}
