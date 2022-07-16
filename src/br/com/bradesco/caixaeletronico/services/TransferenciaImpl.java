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

public class TransferenciaImpl implements Transferencia {

    private final MemoriaContaRepository repository;

    public TransferenciaImpl(MemoriaContaRepository repository) {

        this.repository = repository;
    }

    @Override
    public double execute(double valor, int contaDestino, Conta origem) {
        Conta conta;
        conta = repository.findById(contaDestino);

        boolean transferir = conta.retirarSaldo(valor);
        if (transferir) {
            System.out.printf("Transferencia realizada com sucesso! Seu saldo atual é de R$ %.2f - !%n", conta.getSaldo());
        }

        return valor;
    }


    @Override
    public double transferir(double valor, int contaDestino, Conta origem) {
        return valor;
    }

    @Override
    public double execute(double valor, int contaDestino, String origem) {
        return valor;
    }
}
