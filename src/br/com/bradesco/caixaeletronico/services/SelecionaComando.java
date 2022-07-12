package br.com.bradesco.caixaeletronico.services;

import java.util.Scanner;

public class SelecionaComando {
    ListarComandos listarComandos;
    ObtemComando obtemComando;
    ExecutaComandoEspecifico executaComandoEspecifico;
    Saque saque;

    public SelecionaComando() {
        this.listarComandos = new ListarComandosImpl();
        this.obtemComando = new ObtemComandoImpl();
        this.executaComandoEspecifico = new ExecutaComandoEspecificoImpl();

    }
    public boolean executar() {
        listarComandos.execute();
        int comando = obtemComando.execute();
        return executaComandoEspecifico.execute(comando);
    }

}
