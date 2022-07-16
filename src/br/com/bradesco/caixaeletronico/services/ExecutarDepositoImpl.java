package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class ExecutarDepositoImpl implements Deposito {

    private final MemoriaContaRepository repository;

    public ExecutarDepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }


    @Override
    public double execute(double valor, int numeroDaConta) {

        Conta conta = repository.findById(numeroDaConta);
        conta.adicionaSaldo(valor);

        System.out.println("Você depositou: " + valor);

        System.out.println("Numero da Conta : " + numeroDaConta);

        System.out.println("Saldo da Conta : " + conta.getSaldo());

        return valor;
    }

}
