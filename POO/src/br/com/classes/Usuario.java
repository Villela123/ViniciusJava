package br.com.classes;

public class Usuario {
//Declara��o dos atributos da classe Usu�rio
	public String login;
	public String senha;

//Declara��o dos m�todos da classse Usu�rio

	public void cadastrar() {
		System.out.println("Cadastro realizado com sucesso!");
	}

	// Declara��o do m�todo logar para permitir o acesso ao sistema
	public void logar() {
		if (login.equals("adm") && senha.equals("123")) {
			System.out.println("Bem Vindo!");
		} else {
			System.out.println("Login ou Senha incorreto");
		}

	}

	// Declara��o do m�todo logout
	public void logout() {
		System.out.println("Voc� saiu do aplicativo");
	}

}
