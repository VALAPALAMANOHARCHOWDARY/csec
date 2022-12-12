package mysql_read;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ticket {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket window = new ticket();
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
	public ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking System");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(159, 24, 326, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(33, 96, 117, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("From:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(33, 153, 117, 31);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("To:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(33, 195, 117, 31);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("No.of Tickets:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(33, 257, 182, 31);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setBounds(175, 107, 190, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(175, 164, 182, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(175, 206, 182, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(225, 268, 132, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(143, 329, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
