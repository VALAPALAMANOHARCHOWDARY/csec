package mysql_read;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class reg {

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
		frame.setBounds(100, 100, 553, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sno");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(62, 68, 68, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(62, 105, 68, 26);
		frame.getContentPane().add(lblName);
		
		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarks.setBounds(62, 142, 68, 26);
		frame.getContentPane().add(lblMarks);
		
		t1 = new JTextField();
		t1.setBounds(159, 71, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(159, 112, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(159, 149, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sno=t1.getText();
				String name=t2.getText();
				String marks=t3.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mreccse","root","mysql");
					String query="insert into cse values('"+sno+"','"+name+"','"+marks+"')";
					java.sql.Statement st=con.createStatement();
					st.executeUpdate(query);
		            JOptionPane.showMessageDialog(btnNewButton, "done");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(113, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
