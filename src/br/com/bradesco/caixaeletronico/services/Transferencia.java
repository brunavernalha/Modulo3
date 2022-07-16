package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;

/**
//Transf um valor era a conta de origem, para a conta de destino.
*/

public interface Transferencia {

    double execute(double valor, int contaDestino, Conta origem);

    /**
     * @param valor        Valor que quero transferir
     * @param contaDestino Número da conta que vai receber o dinheiro
     * @param origem       Conta de onde vai partir a transação
     * @return
     */

    double transferir(double valor, int contaDestino, Conta origem);

    double execute(double valor, int contaDestino, String origem);
}

