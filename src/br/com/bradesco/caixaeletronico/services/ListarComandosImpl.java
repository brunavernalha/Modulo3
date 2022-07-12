package br.com.bradesco.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos {
    @Override
    public void execute(){
        System.out.println("\nOlá, seja bem-vindo (a)!\nQual a opção desejada?");
        System.out.println();
        System.out.println("1 - Saque");
        System.out.println("2 - Deposito");
        System.out.println("3 - Abrir uma Nova Conta");
        System.out.println("4 - Transferencia");
        System.out.println("0 - Sair da Conta");
    }
}
