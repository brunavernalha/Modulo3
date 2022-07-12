//package br.com.bradesco.caixaeletronico.services;
//
//import br.com.bradesco.caixaeletronico.model.Conta;
//
//public class TransferenciaImpl implements Conta {
//    public class Transferencia{
//        public void executa(Conta conta, double valor){
//            retirarSaldo(conta);
//            conta.removerSaldo
//        }
//    }
//
//}

package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class TransferenciaImpl implements Deposito {

    private final MemoriaContaRepository repository;

    public TransferenciaImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }


    @Override
    public void execute(double valor, int numeroDaConta) {

        Conta conta = repository.findById(numeroDaConta);
        conta.transferirSaldo(valor);

        System.out.println("Você Transferiu: " + valor);

        System.out.println("Numero da Conta Transferida: " + numeroDaConta);

        System.out.println("Saldo em Conta: " + conta.getSaldo());

    }

}