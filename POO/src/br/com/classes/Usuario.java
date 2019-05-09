package br.com.classes;

public class Usuario {
//Declaração dos atributos da classe Usuário
	public String login;
	public String senha;

//Declaração dos métodos da classse Usuário

	public void cadastrar() {
		System.out.println("Cadastro realizado com sucesso!");
	}

	// Declaração do método logar para permitir o acesso ao sistema
	public void logar() {
		if (login.equals("adm") && senha.equals("123")) {
			System.out.println("Bem Vindo!");
		} else {
			System.out.println("Login ou Senha incorreto");
		}

	}

	// Declaração do método logout
	public void logout() {
		System.out.println("Você saiu do aplicativo");
	}

}
