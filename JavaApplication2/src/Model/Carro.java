/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author aluno
 */
public class Carro extends Automovel {
    protected String chassi;
    protected int portas;

    public Carro() {
    }

    public Carro(String chassi, int portas) {
        this.chassi = chassi;
        this.portas = portas;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    
    
    
}
