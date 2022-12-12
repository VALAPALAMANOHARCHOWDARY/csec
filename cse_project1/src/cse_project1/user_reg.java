package cse_project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class user_reg {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user_reg window = new user_reg();
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
	public user_reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 566, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel.setBounds(182, 11, 173, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(69, 63, 90, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(69, 101, 90, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setFont(new Font("Arial", Font.BOLD, 17));
		r1.setBounds(192, 103, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setFont(new Font("Arial", Font.BOLD, 17));
		r2.setBounds(336, 103, 109, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone NO.");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3.setBounds(50, 143, 109, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fav.LANGUAGE");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_4.setBounds(33, 187, 126, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email ID");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_5.setBounds(58, 232, 101, 27);
		frame.getContentPane().add(lblNewLabel_5);
		
		t1 = new JTextField();
		t1.setBounds(164, 65, 200, 22);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(164, 146, 160, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Arial", Font.BOLD, 17));
		c1.setModel(new DefaultComboBoxModel(new String[] {"c++", "c", "java", "python"}));
		c1.setBounds(218, 189, 106, 22);
		frame.getContentPane().add(c1);
		
		t3 = new JTextField();
		t3.setBounds(168, 237, 133, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=t1.getText();
				String p=t2.getText();
				
				String i=(String) c1.getSelectedItem();
				if(r1.isSelected()) 
				{
					JOptionPane.showMessageDialog(btnNewButton,"Name:"+n+"|\n Gender: Male  \n phone:"+p+" \n selected:"+i);
				}
				else if(r2.isSelected()) 
				{
					JOptionPane.showMessageDialog(btnNewButton,"Name:"+n+"|\n Gender: Female  \\n phone:\"+p+\"\n selected:"+i);
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"Name:"+n+"|\n Gender: Please select \\n phone:\"+p+\" \n selected:"+i);
				}
			}
		});
		btnNewButton.setFont(new Font("Baskerville Old Face", Font.BOLD, 21));
		btnNewButton.setBounds(218, 306, 137, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
