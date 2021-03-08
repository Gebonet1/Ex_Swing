package T19;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Color;

public class Peliculas {

	private JFrame frame;
    private String[] pelis={"Quantum of Solace","Avatar"};
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Peliculas window = new Peliculas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Peliculas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 476, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setSelectedIndex(3);
		comboBox.setMaximumRowCount(5);
		comboBox.setBackground(Color.GRAY);
		comboBox.addItem("Avatar");
		comboBox.addItem("Quantum of solace");
		frame.getContentPane().add(comboBox, BorderLayout.CENTER);
	}

}
