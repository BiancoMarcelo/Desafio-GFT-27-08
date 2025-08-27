package Desafio1;

public class SistemaBancario {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(12345, "Maria");
        contaBancaria.depositar(1000);
        contaBancaria.sacar(500);
        contaBancaria.exibirSaldo();



    }
}
