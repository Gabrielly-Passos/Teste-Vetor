package br.com.teste.beans;

import javax.swing.JOptionPane;

public class Programa4 {

	public static void main(String[] args) {
		
         int resp = 0;
         String nome = null;
         
         while(resp == 0)
         {   nome =JOptionPane.showInputDialog("Digite seu nome");
        	 resp =JOptionPane.showConfirmDialog(null,
        	       "Deseja continuar?", "CAMADAS",
                	JOptionPane.YES_NO_OPTION,
                 	JOptionPane.QUESTION_MESSAGE);
         }
	}

}
