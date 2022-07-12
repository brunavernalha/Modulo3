package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutaComandoEspecificoImpl implements ExecutaComandoEspecifico {

    private final Deposito deposito;
    private final AbrirConta abrirConta;
    private ExecutaComandoEspecifico retirarSaldo;

    private Transferencia transferirSaldo;// 07/07

    public ExecutaComandoEspecificoImpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.deposito = new ExecutarDepositoImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
        this.transferirSaldo = new TransferenciaImpl(repository); // 07/07
    }

    @Override
    public boolean execute(int comando) {
        Scanner entrada = new Scanner(System.in);
        boolean resultado = true;

        if (comando == 0) {
            System.out.println("Encerrando o programa");
            resultado = false;


        } else if (comando == 1) {
            System.out.println("Sacando dinheiro");

        } else if (comando == 2) {
            System.out.println("Digite o número da conta: ");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor a ser depositado: ");
            double valor = entrada.nextInt();

            this.deposito.execute(valor, numero);
            System.out.println("Depósito realizado");

        } else if (comando == 3) {
            abrirConta.execute();

        } else if (comando == 4) { // 07/07
            System.out.println("Digite o número da conta origem: ");
            int numero = entrada.nextInt();

            System.out.println("Digite o número da conta destino: ");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor a ser transferido: ");
            double valor = entrada.nextInt();

            this.transferirSaldo.execute(valor, numero, numero);
            System.out.println("Transferencia realizado");

        } else {
            System.out.println("Comando inválido!");
        }

        return resultado;
    }
}