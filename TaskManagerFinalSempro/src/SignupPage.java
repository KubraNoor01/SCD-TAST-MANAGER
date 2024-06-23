import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class SignupPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupPage frame = new SignupPage();
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
	public SignupPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(164, 11, 99, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create your account here");
		lblNewLabel_1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(109, 34, 228, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setBounds(26, 95, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email:");
		lblNewLabel_2_1.setBounds(26, 141, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Password:");
		lblNewLabel_2_1_1.setBounds(26, 181, 54, 19);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField = new JTextField();
		textField.setBounds(122, 92, 186, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 138, 186, 20);
		contentPane.add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 180, 186, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(117, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(219, 227, 89, 23);
		contentPane.add(btnClear);
	}
}
