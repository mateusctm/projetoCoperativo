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
public class Mensal extends AluguelDeAutomovel{
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public Mensal() {
    }

    public Mensal(String nome, String cpf, LocalDate dataNascimento, LocalDate dataInicial, LocalDate dataFinal, double valor, Automovel automovel, Pessoa pessoa) {
        super(dataInicial, dataFinal, valor, automovel, pessoa);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
   
    
}
