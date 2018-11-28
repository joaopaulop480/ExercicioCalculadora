
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ViewCalculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField textVisor;
	/**
	 * Variavel usada para salvar os valores que estão no visor assim que selecionado um botão operador.
	 */
	private double operadorAnterior;
	/**
	 * Variavel Operador salva qual operação o usuario pretende fazer
	 * @value 
	 * 1 = Soma
	 * 2 = Subtração
	 * 3 = Multiplicação
	 * 4 = Divisão
	 */
	private int operador;
	
	/**
	 * Variavel Ultimo botão salva o tipo de botão que foi selecionado pela ultima vez: 
	 * {@value 
	 * 0 = Numero
	 * 1 = Operador
	 * 2 = Resultado
	 * }
	 */
	private int ultimoBotao; // 0 = numero / 1 = operador / 2 = resultado
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCalculadora frame = new ViewCalculadora();
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
	public ViewCalculadora() {
		
		operador = 0;
		operadorAnterior = 0;
		ultimoBotao = 0;
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 355, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textVisor = new JTextField();
		textVisor.setHorizontalAlignment(SwingConstants.TRAILING);
		textVisor.setBackground(Color.WHITE);
		textVisor.setEditable(false);
		textVisor.setBounds(10, 11, 319, 35);
		contentPane.add(textVisor);
		textVisor.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				inserirNumero(7);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn7.setBounds(10, 67, 50, 50);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				inserirNumero(4);
			
				
			}
		});
		btn4.setBounds(10, 128, 50, 50);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inserirNumero(1);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn1.setBounds(10, 189, 50, 50);
		contentPane.add(btn1);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inserirNumero(8);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn8.setBounds(70, 67, 50, 50);
		contentPane.add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inserirNumero(5);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn5.setBounds(70, 128, 50, 50);
		contentPane.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inserirNumero(2);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2.setBounds(70, 189, 50, 50);
		contentPane.add(btn2);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inserirNumero(9);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn9.setBounds(130, 67, 50, 50);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inserirNumero(6);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn6.setBounds(130, 128, 50, 50);
		contentPane.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inserirNumero(3);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn3.setBounds(130, 189, 50, 50);
		contentPane.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inserirNumero(0);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn0.setBounds(10, 250, 110, 50);
		contentPane.add(btn0);
		
		JButton btnVirgula = new JButton(",");
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inserirPonto();
			}
		});
		btnVirgula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVirgula.setBounds(130, 250, 50, 50);
		contentPane.add(btnVirgula);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ultimoBotao = 1;
				operadorAnterior = Double.parseDouble(textVisor.getText());
				operador = 4;
				textVisor.setText(null);
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDiv.setBounds(190, 67, 50, 50);
		contentPane.add(btnDiv);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ultimoBotao = 1;
				operadorAnterior = Double.parseDouble(textVisor.getText());
				operador = 3;
				textVisor.setText(null);
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMult.setBounds(190, 128, 50, 50);
		contentPane.add(btnMult);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(textVisor.getText().equals("")) {
					textVisor.setText("-");
					ultimoBotao = 0;
				}else {
					ultimoBotao = 1;
					operadorAnterior = Double.parseDouble(textVisor.getText());
					operador = 2;
					textVisor.setText(null);	
					
				}
				
				

			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSub.setBounds(190, 189, 50, 50);
		contentPane.add(btnSub);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textVisor.getText() == null) {
					
				}else {
					ultimoBotao = 1;
					operadorAnterior = Double.parseDouble(textVisor.getText());
					operador = 1;
					textVisor.setText(null);
				}

			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSoma.setBounds(190, 250, 50, 50);
		contentPane.add(btnSoma);
		
		JButton btnApagar = new JButton("CE");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVisor.setText(null);
				operador = 0;
				ultimoBotao = 0;
			}
		});
		btnApagar.setForeground(Color.RED);
		btnApagar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnApagar.setBounds(250, 67, 80, 110);
		contentPane.add(btnApagar);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ultimoBotao == 1) {
					//Colocar erro
				}else {
					
				switch (operador) {
				case 1:
					somar();
					break;
				case 2:
					subtrair();
					break;
				case 3:
					multiplicar();
					break;
				case 4:
					try {
						dividir();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					break;
				default:
					break;
				}
				}

				operador = 0;
				ultimoBotao = 2;
			}
		});
		btnResultado.setForeground(Color.BLUE);
		btnResultado.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnResultado.setBounds(250, 189, 80, 110);
		contentPane.add(btnResultado);
	}
	
	/**
	 * Metodo para inserir um numero no visor da caluladora
	 * @param numero
	 */
	
	private void inserirNumero(int numero) {
			if(ultimoBotao == 0) {
			textVisor.setText(textVisor.getText() + numero);
			ultimoBotao = 0;
			}else {
				textVisor.setText(String.valueOf(numero));
				ultimoBotao = 0;
			}
	}
	/**
	 * Metodo para inserir um Ponto Flutuante no visor da calculadora
	 */
	private void inserirPonto() {
		
		if(!textVisor.getText().contains(".")) {
			textVisor.setText(textVisor.getText() + ".");
		}
		
	}
	/**
	 * Metodo para somar valores na calculadora.
	 */
	private void somar() {
		textVisor.setText(String.valueOf(operadorAnterior + Double.parseDouble(textVisor.getText())));
		
	}
	/**
	 * Metodo para subtrair valores na calculadora.
	 */
	private void subtrair() {

		textVisor.setText(String.valueOf(operadorAnterior - Double.parseDouble(textVisor.getText())));
		
	}
	/**
	 * Metodo para multiplicar valores na calculadora.
	 */
	private void multiplicar() {
		textVisor.setText(String.valueOf(operadorAnterior * Double.parseDouble(textVisor.getText())));
		
	}
	/**
	 * Metodo para dividir valores na calculadora.
	 */
	private void dividir() throws InterruptedException {
		
		if(Double.parseDouble(textVisor.getText()) == 0) {
			JOptionPane.showMessageDialog(null, "Erro: Divisor igual a zero!");
			textVisor.setText(null);
			operador = 0;
			ultimoBotao = 0;
			
		}else {
			textVisor.setText(String.valueOf(operadorAnterior / Double.parseDouble(textVisor.getText())));
		}
		
	}
	
}
