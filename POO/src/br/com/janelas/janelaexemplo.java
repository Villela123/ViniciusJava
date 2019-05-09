package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class janelaexemplo extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaexemplo frame = new janelaexemplo();
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
	public janelaexemplo() {
		setTitle("Gerenciar Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdDoCliente = new JLabel("Id do Cliente");
		lblIdDoCliente.setBounds(20, 11, 80, 14);
		contentPane.add(lblIdDoCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(95, 8, 96, 20);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.setBounds(201, 7, 89, 23);
		contentPane.add(btnAcessar);
	}
}
