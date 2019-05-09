package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.loja.Categoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos extends JFrame{
	//######################Elementos para a categoria
	static JLabel lblIdCat = new JLabel("Id Categoria:");
	static JLabel lblNomeCat = new JLabel("Nome Categoria:");
	static JLabel lblDescCat = new JLabel("Descricao:");
	
	static JTextField txtIdCat = new JTextField();
	static JTextField txtNomeCat = new JTextField();
	static JTextField txtDescCat = new JTextField();
	
	static JButton btnCadCat = new JButton("Cadastrar Categoria");
	
	//######################Elementos para o Fornecedor
	static JLabel lblIdFor = new JLabel("Id Fornecedor:");
	static JLabel lblRS = new JLabel("Razao Social:");
	static JLabel lblCnpj = new JLabel("CNPJ:");
	
	static JTextField txtIdFor = new JTextField();
	static JTextField txtRS = new JTextField();
	static JTextField txtCnpj = new JTextField();

	static JButton btnCadFor = new JButton("Cadastrar Fornecedor");
	
	//######################Elementos para Produtos
	static JLabel lblIdPr = new JLabel("Id Produto:");
	static JLabel lblNomePr = new JLabel("Nome do Produto:");
	static JLabel lblDescPr = new JLabel("Descricao Produto:");
	static JLabel lblCategoria = new JLabel("Selecione uma Categoria:");
	static JLabel lblFornecedor = new JLabel("Selecione um Fornecedor:");
	static JLabel lblPrecoPr = new JLabel("Preco do Produto:");
	
	static JTextField txtIdPr = new JTextField();
	static JTextField txtNomePr = new JTextField();
	static JTextField txtDescPr = new JTextField();
	static JTextField txtCategoria = new JTextField();
	static JTextField txtFornecedor = new JTextField();
	static JTextField txtPrecoPr = new JTextField();
	
	static JButton btnCadPr = new JButton("Cadastrar Produto");
	
	public static void main(String[] args){
		JFrame gerenciar = new JFrame();
		gerenciar.setTitle("Gerenciar Produtos");
		gerenciar.setSize(700,400);
		gerenciar.setLocationRelativeTo(null);
		gerenciar.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gerenciar.setResizable(true);
		//#######################Desativa redimensionamento
		gerenciar.getContentPane().setLayout(null);
		lblIdCat.setBounds(10,10,150,30);
		gerenciar.add(lblIdCat);
		txtIdCat.setBounds(10,45,80,30);
		gerenciar.add(txtIdCat);
		lblNomeCat.setBounds(10,75,150,30);
		gerenciar.add(lblNomeCat);
		txtNomeCat.setBounds(10,110,200,30);
		gerenciar.add(txtNomeCat);
		lblDescCat.setBounds(10,145,150,30);
		gerenciar.add(lblDescCat);
		txtDescCat.setBounds(10,180,400,30);
		gerenciar.add(txtDescCat);
		btnCadCat.setBounds(10,250,200,30);
		gerenciar.add(btnCadCat);
		lblIdFor.setBounds(10,300,200,30);
		gerenciar.add(lblIdFor);
		txtIdFor.setBounds(10,335,200,30);
		gerenciar.add(txtIdFor);
		lblRS.setBounds(10,370,300,30);
		gerenciar.add(lblRS);
		txtRS.setBounds(10,405,250,30);
		gerenciar.add(txtRS);
		lblCnpj.setBounds(10,440,250,30);
		gerenciar.add(lblCnpj);
		txtCnpj.setBounds(10,475,115,30);
		gerenciar.add(txtCnpj);
		btnCadFor.setBounds(10,545,200,30);
		gerenciar.add(btnCadFor);
		lblIdPr.setBounds(515,10,300,30);
		gerenciar.add(lblIdPr);
		txtIdPr.setBounds(515,45,300,30);
		gerenciar.add(txtIdPr);
		lblNomePr.setBounds(515,70,300,30);
		gerenciar.add(lblNomePr);		
		txtNomePr.setBounds(515,105,300,30);
		gerenciar.add(txtNomePr);
		lblDescPr.setBounds(515,140,300,30);
		gerenciar.add(lblDescPr);
		txtDescPr.setBounds(515,175,300,110);
		gerenciar.add(txtDescPr);
		lblCategoria.setBounds(515,280,300,30);
		gerenciar.add(lblCategoria);
		txtCategoria.setBounds(515,315,300,30);
		gerenciar.add(txtCategoria);
		lblFornecedor.setBounds(515,350,300,30);
		gerenciar.add(lblFornecedor);
		txtFornecedor.setBounds(515,385,300,30);
		gerenciar.add(txtFornecedor);
		lblPrecoPr.setBounds(515,420,300,30);
		gerenciar.add(lblPrecoPr);
		txtPrecoPr.setBounds(515,455,300,30);		
		gerenciar.add(txtPrecoPr);
		btnCadPr.setBounds(515,525,300,30);
		gerenciar.add(btnCadPr);
		//#######################Desabilitar os controles txtField do Fornecedor e Produtos (Para criar uma ordem)
		
		txtIdFor.setEnabled(false);
		txtRS.setEnabled(false);
		txtCnpj.setEnabled(false);
		btnCadFor.setEnabled(false);
		txtIdPr.setEnabled(false);
		txtNomePr.setEnabled(false);
		txtDescPr.setEnabled(false);
		txtCategoria.setEnabled(false);
		txtFornecedor.setEnabled(false);
		txtPrecoPr.setEnabled(false);
		btnCadPr.setEnabled(false);
		
		//######################Criar o objeto Categoria e passar os dados do formulário para ele
		
		        Categoria cat = new Categoria();
		
		//######################Passagem dos dados para o objeto no momento do clique
		
		        btnCadCat.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				cat.setId(Integer.parseInt(txtIdCat.getText()));
				cat.setNome(txtNomeCat.getText());
				cat.setDescricao(txtDescCat.getText());
		//######################Desabilitar as caixas da categoria
				txtIdCat.setEnabled(false);
				txtNomeCat.setEnabled(false);
				txtDescCat.setEnabled(false);
				btnCadCat.setEnabled(false);
		//######################Habilitar as caixas do fornecedor
				txtIdFor.setEnabled(true);
				txtRS.setEnabled(true);
				txtCnpj.setEnabled(true);
				btnCadFor.setEnabled(true);
			}	
			});
		//######################Instanciar a classe fornecedor e passar os dados para o objeto no momento em que o botão de cadastro for clicado
				Fornecedor f = new Fornecedor();
				
				btnCadFor.addActionListener(new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e){
		        f.setId(Integer.parseInt(txtIdFor.getText()));
		        f.setRazaoSocial(txtIdFor.getText());
		        f.setCnpj(txtCnpj.getText());
		        
		        txtIdFor.setEnabled(false);
		        txtRS.setEnabled(false);
		        txtCnpj.setEnabled(false);
		        btnCadFor.setEnabled(false);
		        
		    	txtIdPr.setEnabled(true);
				txtNomePr.setEnabled(true);
				txtDescPr.setEnabled(true);
				txtCategoria.setEnabled(true);
				txtFornecedor.setEnabled(true);
				txtPrecoPr.setEnabled(true);
				btnCadPr.setEnabled(true);
		//#######################Criando um objeto baseado em produtos para passar os dedos no momento do clique do botão cadastro
				Produto pr = new Produto();
				btnCadPr.addActionListener(new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e){
				pr.setId(Integer.parseInt(txtIdPr.getText()));
				pr.setNome(txtNomePr.getText());
				pr.setDescricao(txtDescPr.getText());
				pr.setCategoria(cat);
				pr.setFornecedor(f);
				pr.setPreco(Double.parseDouble(txtPrecoPr.getText()));
				
				txtIdPr.setEnabled(false);
				txtNomePr.setEnabled(false);
				txtDescPr.setEnabled(false);
				txtCategoria.setEnabled(false);
				txtFornecedor.setEnabled(false);
				txtPrecoPr.setEnabled(false);
				btnCadPr.setEnabled(false);
				
		//########################Caixa de Confirmação
				
				JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
				
		//########################Habilitar categorias
				
				
						
					}
				});
     
		        
				}
				});
				
		//#######################Definir o gerenciamento do Layout como absoluto, ou seja, nulo
		gerenciar.setVisible(true);
	}
}
	
