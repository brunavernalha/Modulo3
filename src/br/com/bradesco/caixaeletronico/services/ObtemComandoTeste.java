package br.com.bradesco.caixaeletronico.services;

import java.util.Scanner;

public class ObtemComandoTeste implements ObtemComando {

    @Override // sobrepor o método da Interface
    public int execute(){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("\nDigite a opção:");
        System.out.println(); // apenas para pular linha
        int comando = entrada.nextInt(); // entrada do usuário
        return comando;
    }
}
