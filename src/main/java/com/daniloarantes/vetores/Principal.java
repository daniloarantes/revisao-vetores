
package com.daniloarantes.vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo Arantes <danilo at daniloarantes.com>
 */
public class Principal {

    public static void main(String[] args) {
        Veiculo v = new Veiculo();

        v.cadVeiculo();
        JOptionPane.showMessageDialog(null, v.veiculosCadastrados());

        /*
        Maneira de implementar utilizando somente uma linha 
        
            JOptionPane.showMessageDialog(null, 
               v.getMarca(Integer.parseInt(JOptionPane.showInputDialog("Digite o código"))));
         */
        
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite um código"));
        JOptionPane.showMessageDialog(null, v.getMarca(indice));

    }
}
