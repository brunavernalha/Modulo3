package br.com.bradesco.caixaeletronico.services;

public interface Saque {

    Double execute(double valor, int numeroDaConta);
}