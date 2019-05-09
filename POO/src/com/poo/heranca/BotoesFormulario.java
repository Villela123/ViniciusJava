package com.poo.heranca;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BotoesFormulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNomeFan;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtEndereco;
	private JTextField txtCnpj;
	private JTextField txtRazaoSocial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotoesFormulario frame = new BotoesFormulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BotoesFormulario() {
		setTitle("Cadastro Pessoa Juridica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(71, 11, 28, 14);
		contentPane.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(98, 8, 96, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome fantasia:");
		lblNome.setBounds(14, 42, 81, 14);
		contentPane.add(lblNome);
		
		txtNomeFan = new JTextField();
		txtNomeFan.setBounds(98, 39, 96, 20);
		contentPane.add(txtNomeFan);
		txtNomeFan.setColumns(10);
		
		JLabel lblEmail = new JLabel("    E-Mail:");
		lblEmail.setBounds(41, 73, 48, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(98, 70, 96, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(40, 104, 48, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(98, 101, 96, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(36, 135, 63, 14);
		contentPane.add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(98, 132, 96, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblCnpj = new JLabel("      CNPJ:");
		lblCnpj.setBounds(41, 164, 48, 14);
		contentPane.add(lblCnpj);
		
		txtCnpj = new JTextField();
		txtCnpj.setBounds(98, 161, 96, 20);
		contentPane.add(txtCnpj);
		txtCnpj.setColumns(10);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social:");
		lblRazoSocial.setBounds(23, 195, 66, 14);
		contentPane.add(lblRazoSocial);
		
		txtRazaoSocial = new JTextField();
		txtRazaoSocial.setBounds(98, 192, 96, 20);
		contentPane.add(txtRazaoSocial);
		txtRazaoSocial.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		PessoaJuridica pj = new PessoaJuridica();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pj.setId(Integer.parseInt(txtId.getText()));
				pj.setNomeFantasia(txtNomeFan.getText());
				pj.setEmail(txtEmail.getText());
				pj.setTelefone(txtTelefone.getText());
				pj.setEndereco(txtEndereco.getText());
				pj.setCnpj(txtCnpj.getText());
				pj.setRazaoSocial(txtRazaoSocial.getText());
		
				pj.cadastrar();
				
			}
		});
		btnCadastrar.setBounds(257, 100, 89, 52);
		contentPane.add(btnCadastrar);
	}
}
