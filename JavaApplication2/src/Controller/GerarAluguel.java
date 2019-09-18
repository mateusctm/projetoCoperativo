/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AluguelDeAutomovel;

import Model.Cliente;
import Model.Diaria;
import Model.Funcionario;
import Model.Mensal;
import Model.Automovel;

public class GerarAluguel {

    public AluguelDeAutomovel gerarAluguel(Cliente cliente, Funcionario funcionario, Automovel automovel, int tipo) {
AluguelDeAutomovel t = new AluguelDeAutomovel() {};

        if (tipo == 1) {
           Diaria d = new Diaria();
           t = d;
           
        }
        if (tipo == 2) {
            Mensal m = new Mensal();
            t = m;
        }
return t;
    }

}
