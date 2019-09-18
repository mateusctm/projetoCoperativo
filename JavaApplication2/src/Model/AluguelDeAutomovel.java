/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.time.LocalDate;

/**
 *
 * @author aluno
 */
public abstract class AluguelDeAutomovel {
    
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private double valor;
    private Automovel automovel;
    private Pessoa pessoa;

    public AluguelDeAutomovel(LocalDate dataInicial, LocalDate dataFinal, double valor, Automovel automovel, Pessoa pessoa) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.valor = valor;
        this.automovel = automovel;
        this.pessoa = pessoa;
    }

    public AluguelDeAutomovel() {
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
