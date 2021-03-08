package T19;


import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;


public class Ex_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex_1 frame = new Ex_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Ex_1() {
		saludar();
	}
	
	public void saludar() {
		setTitle("Saludador");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 436, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 263, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		
		
		JButton btnNewButton = new JButton("Saludador");
		btnNewButton.setBounds(169, 185, 127, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setBounds(122, 48, 265, 58);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(122, 121, 229, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		/*JOptionPane.showMessageDialog(null, "Hello " + name1);*/
		
	}
}
