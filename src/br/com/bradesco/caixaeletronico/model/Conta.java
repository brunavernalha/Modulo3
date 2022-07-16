package br.com.bradesco.caixaeletronico.model;

public class Conta {

    private int numeroDaConta;

    private double saldo;

    private String transferencia;

    public Conta() {
        saldo = 0;
    }


    //GET and SET

    public String getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(String transferencia) {
        this.transferencia = transferencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Transferencia



    //Deposito

    public void adicionaSaldo(double valor){
        saldo = saldo + valor;
    }

    //Saque
    public boolean retirarSaldo(double valor){
        if (saldo >= valor){
            saldo = saldo - valor;
            return true;

        }else{
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

}
