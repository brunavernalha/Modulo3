package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class SaqueImpl implements Saque {

    private final MemoriaContaRepository repository;

    public SaqueImpl(MemoriaContaRepository repository) {

        this.repository = repository;
    }


    @Override
    public Double execute(double valor, int numeroDaConta) {


        Conta conta;
        conta = repository.findById(numeroDaConta);
        conta.retirarSaldo(valor);

        System.out.println("Você sacou: " + valor);

        System.out.println("Numero da Conta : " + numeroDaConta);

        System.out.println("Saldo em Conta : " + conta.getSaldo());

        boolean saqueRealizado = conta.retirarSaldo(valor);
        if (saqueRealizado) {
            System.out.printf("Saque realizado! Seu saldo atual é de R$ %.2f - !%n", conta.getSaldo());
        }
        return valor;
    }

}