package br.com.exemplo.basico;

import com.construtores.Cliente;

public class GerenciarCliente{
	public static void main(String[] args){
		//Instância da classe Cliente

		Cliente cl2 = new Cliente();
		cl2.setId(10);
		cl2.setNome("Vinicius");
		cl2.setEmail("vinicius@uol.com.br");
		System.out.println(cl2.nomePorId(10));
	}
}
