package br.com.bradesco.caixaeletronico.services;

import java.util.Scanner;
public class ObtemComandoImpl implements ObtemComando{
    public int execute(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nPara prosseguir, digite o número: ");
        int comando = entrada.nextInt();
        return comando;
    }
}
