package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class AbrirContaImpl implements AbrirConta {
    private final MemoriaContaRepository repository;

    public AbrirContaImpl(MemoriaContaRepository repository){
        this.repository = repository;
    }

    @Override
    public Conta execute() {
        Conta conta;
        conta = new Conta();
        repository.adiciona(conta);
        System.out.printf("Conta numero %d o saldo atual é de R$ %.2f", conta.getNumeroDaConta(), conta.getSaldo());
        return conta;
    }

}