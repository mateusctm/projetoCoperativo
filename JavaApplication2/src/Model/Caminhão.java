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
public class Caminhão extends Automovel{
     protected String chassi;
    protected int eixos;

    public Caminhão() {
    }

    public Caminhão(String chassi, int eixos) {
        this.chassi = chassi;
        this.eixos = eixos;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    
}
