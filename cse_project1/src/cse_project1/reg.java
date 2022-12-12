package cse_project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class reg {

	private JFrame frame;
	private JTextField t1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg window = new reg();
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
	public reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 511, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(179, 11, 120, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(70, 64, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(70, 97, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(121, 62, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 95, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("submit");
		
		btnNewButton.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent e) {
			String name=t1.getText();
			JOptionPane.showMessageDialog(btnNewButton,"Hey    "+name+"   Your Registration Done!");
				
				
			}
		});
		btnNewButton.setBounds(83, 174, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		r1.setBounds(70, 144, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		r2.setBounds(190, 144, 109, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"c", "c++", "java"}));
		c1.setBounds(350, 128, 30, 22);
		frame.getContentPane().add(c1);
		
		
		JButton btnNewButton_1 = new JButton("click");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected()) 
				{
					JOptionPane.showMessageDialog(btnNewButton,"selected :male");
				}
				else if(r2.isSelected()) 
				{
					JOptionPane.showMessageDialog(btnNewButton,"selected :female");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"selected :gender");
				}
				string 
			}
		});
		btnNewButton_1.setBounds(200, 174, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
