/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Model.Automovel;
import Model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here

   
        ArrayList<Pessoa> Funcionarios = new ArrayList();
        ArrayList<Pessoa> Clientes = new ArrayList();
        ArrayList<Automovel> automoveis = new ArrayList();
        ArrayList<AluguelDeautomovel> Alugueis = new 
        ArrayList<AluguelDeautomovel>();
        
        int txt = 0;
        
        do{
           txt = Integer.parseInt(JOptionPane.showInputDialog(null,"1 cadastrar funcionario\n2 cadastrar Cliente\n 3 cadastrar automovel\n 4 criar alugueis\n 5 sair"));
        }while(txt != 5);
    }
    
    }

 
    


 