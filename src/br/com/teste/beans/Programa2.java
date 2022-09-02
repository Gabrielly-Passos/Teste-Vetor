package br.com.teste.beans;

import javax.swing.JOptionPane;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      int[] idade = new int[3];
      String[] nome = new String[3];
		
      int  i = 0;
  
      
  
		
		for (i = 0; i < 3; i++) {
			
			nome[i]= JOptionPane.showInputDialog("Digite seu nome");
			idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite as idades"));
		}
		
         for (i = 0; i < 3; i++) {
		    
        	System.out.println( " o nome é " + nome[i] + " e a idade é " + idade[i]);
        	/*
			System.out.println("Idade = " + idade[i]);
			System.out.println("nome = " + nome[i]);*/
			}
		
	}

}
