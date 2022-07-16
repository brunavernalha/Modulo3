package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutaComandoEspecificoImpl implements ExecutaComandoEspecifico {

    private final Deposito deposito;
    private final AbrirConta abrirConta;
    private final Saque saque;
    private final Transferencia transferencia;



    public ExecutaComandoEspecificoImpl() {

        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.deposito = new ExecutarDepositoImpl(repository);
        this.saque = new SaqueImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
        this.transferencia = new TransferenciaImpl(repository);
    }

    @Override
    public boolean execute(int comando) {
        Scanner entrada = new Scanner(System.in);
        boolean resultado = true;

        if (comando == 0) {
            System.out.println("Encerrando o programa");
            resultado = false;

        } else if (comando == 1) {
            System.out.println("Digite o número de sua conta: ");
            int numeroDaConta = entrada.nextInt();
            System.out.println("Digite o valor a ser sacado: ");
            double valorASerSacado = entrada.nextInt();
            this.saque.execute(valorASerSacado, numeroDaConta);


        } else if (comando == 2) {
            System.out.println("Digite o número de sua conta: ");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor a ser depositado: ");
            double valor = entrada.nextInt();

            this.deposito.execute(valor, numero);
            System.out.println("Depósito realizado");


        } else if (comando == 3) {
            abrirConta.execute();
        }

        else if (comando == 4) {
            System.out.println("Digite o número de sua conta: ");
            int contaDestino = entrada.nextInt();
            System.out.println("Digite o valor a ser transferido: ");
            double valor = entrada.nextInt();
            System.out.println("Digite a conta do favorecido: ");
            String origem = entrada.next();
            this.transferencia.execute(valor, contaDestino, origem);
        }

        else {
            System.out.println("Comando inválido!");
        }

        return resultado;
    }
}