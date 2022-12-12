package cse_project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecom {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom window = new ecom();
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
	public ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 567, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AMAZON");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(180, 36, 144, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(103, 315, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\CSE\\Downloads\\images.jpg"));
		lblNewLabel_1.setBounds(22, 115, 166, 189);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("200");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_3.setBounds(70, 340, 67, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("ADD TO CART");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(42, 386, 133, 28);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\CSE\\Downloads\\download.jpg"));
		lblNewLabel_4.setBounds(233, 115, 220, 189);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("250");
		lblNewLabel_5.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblNewLabel_5.setBounds(319, 340, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.setBounds(276, 389, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
