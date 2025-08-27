package Desafio1;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria (int numeroConta, String titular){
        this(numeroConta,titular,0.0);
    }

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor>0){
            saldo += valor;
            System.out.printf("Depositando R$: %s.\n", valor);
        } else {
            System.out.println("Valor de deposito deve ser maior que zero");
        }
    }

    public void sacar (double valor) {
        if (valor > 0){
            if (valor <= saldo){
                saldo -= valor;
                System.out.printf("Sacando R$: %s.\n",valor);
            } else {
                System.out.println("Saldo insuficiente para sacar ");
            }
        } else {
            System.out.println("Valor deve ser positivo para saque");
        }
    }

    public void exibirSaldo (){
        System.out.printf("Saldo atual de R$ %s \n", saldo);
    }




    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
