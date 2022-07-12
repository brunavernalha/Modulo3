//package br.com.bradesco.caixaeletronico.services;
//
//public class SaqueImpl implements Saque {
//    @Override
//    public Double execute(double valor, int numeroDaConta){
//
//        if (valor >= 5100.0){
//            System.out.println("Limite de saque excedido. Para continuar tente novamente.");
//        } else if (valor<=5000.00) {
//            System.out.println("Você sacou " + valor);
//        }
//        else{
//            System.out.println("Opção invalida, tente novamente!");
//        }
//        return valor;
//    }
//
//}

package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class SaqueImpl implements Deposito {

    private final MemoriaContaRepository repository;

    public SaqueImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }


    @Override
    public void execute(double valor, int numeroDaConta) {

        Conta conta = repository.findById(numeroDaConta);
        conta.retirarSaldo(valor);

        System.out.println("Você sacou: " + valor);

        System.out.println("Numero da Conta : " + numeroDaConta);

        System.out.println("Saldo em Conta : " + conta.getSaldo());

    }

}


