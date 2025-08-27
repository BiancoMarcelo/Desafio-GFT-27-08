package Desafio2;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo(){
        System.out.printf("Moto: %s, Ano: %s,  %s cc.\n", getModelo(), getAno(), cilindradas);
    }


}
