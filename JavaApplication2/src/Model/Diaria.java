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
public class Diaria extends AluguelDeAutomovel {
    
   private double valorDiaria;
   private String valorMensal;
   private String valorAnual;

    public Diaria() {
    }

    public Diaria(double valorDiaria, String valorMensal, String valorAnual, LocalDate dataInicial, LocalDate dataFinal, double valor, Automovel automovel, Pessoa pessoa) {
        super(dataInicial, dataFinal, valor, automovel, pessoa);
        this.valorDiaria = valorDiaria;
        this.valorMensal = valorMensal;
        this.valorAnual = valorAnual;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(String valorMensal) {
        this.valorMensal = valorMensal;
    }

    public String getValorAnual() {
        return valorAnual;
    }

    public void setValorAnual(String valorAnual) {
        this.valorAnual = valorAnual;
    }

}
