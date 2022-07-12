//App é a classe principal = super classe / main
package br.com.bradesco.caixaeletronico;

import br.com.bradesco.caixaeletronico.services.SelecionaComando;

public class App {

    public static void main(String[] args) {

        System.out.println("\nCaixa eletrônico ligado!"); //sout -> automático -> System.out.println()

        SelecionaComando selecionaComando = new SelecionaComando();

        while (selecionaComando.executar()) {System.out.println("\nExecutando um novo comando!");}

        System.out.println("\nCaixa eletrônico desligando!");

    }
}
