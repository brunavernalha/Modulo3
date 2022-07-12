package br.com.bradesco.caixaeletronico.model;

public class Conta {

    private int numeroDaConta;

    private double saldo;

    public Conta() { // <- construtor
        saldo = 0;
    }

    //GET and SET
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionaSaldo(double valor){
        saldo = saldo + valor;
    }
    public boolean retirarSaldo(double valor){
        if (saldo >= valor){
            saldo = saldo - valor;
            return true;

        }else{
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public boolean transferirSaldo(double valor){
        if (saldo >= valor){
            saldo = saldo - valor;
            return true;

        }else{
            System.out.println("Saldo insuficiente para transferencia!");
            return false;
        }
    }
}
