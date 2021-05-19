package com.daniloarantes.vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo Arantes <danilo at daniloarantes.com>
 */
public class Veiculo {

    private String marca[] = new String[3];
    private String modelo[] = new String[3];

    // Método criado para preencher os vetores
    public void cadVeiculo() {
        for (int i = 0; i < marca.length; i++) {
            marca[i] = JOptionPane.showInputDialog("Digite a marca " + (i + 1));
            modelo[i] = JOptionPane.showInputDialog("Digite o modelo " + (i + 1));
        }
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        String resultado = "";
        int indice = 0;

        /*
        While utilizado para montar uma string colocando 
        cada marca embaixo da outra
        
        Volks
        Honda
        Toyota
         */
        while (indice < marca.length) {
            resultado += marca[indice] + "\n";
            indice++;
        }

        return resultado;
    }

    /* 
    Sobrecarga do método getMarca recebendo um valor inteiro como índice
    que será utilizado para realizar pesquisa dentro dos vetores marca e
    modelo, retornando o valor na determinada posição    
     */
    public String getMarca(int indice) {
        return marca[indice] + " - " + modelo[indice];
    }

    public String getModelo() {
        String resultado = "";
        int indice = 0;

        while (indice < modelo.length) {
            resultado += modelo[indice] + "\n";
            indice++;
        }

        return resultado;
    }

    /*
    Método utilizado para retornar uma String no formato "marca - modelo"
    para todos os registros dos vetores
     */
    public String veiculosCadastrados() {
        String resultado = "";
        int indice = 0;

        while (indice < modelo.length) {
            resultado += marca[indice] + " - " + modelo[indice] + "\n";
            indice++;
        }

        return resultado;
    }

}
