package br.com.janelas;

import javax.swing.JFrame;

public class GerenciarUsuarios extends JFrame{

	public static void main(String[] args) {
		//Inst�ncia da classe JFrame 
		JFrame janela = new JFrame();
		janela.setSize(500,400);
		janela.setTitle("Gerenciar Usu�rios");
		janela.setLocationRelativeTo(null);//alinha a janela ao centro da tela
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setVisible(true);

	}

}
