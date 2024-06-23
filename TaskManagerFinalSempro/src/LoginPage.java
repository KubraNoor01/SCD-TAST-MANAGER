import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign In");
		lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD, 18));
		lblNewLabel.setBounds(177, 21, 65, 28);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(146, 120, 169, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSignInYour = new JLabel("sign in your account here");
		lblSignInYour.setFont(new Font("Lucida Handwriting", Font.PLAIN, 15));
		lblSignInYour.setBounds(104, 52, 261, 28);
		contentPane.add(lblSignInYour);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter your credential ");
		lblNewLabel_1_1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(146, 71, 169, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(69, 123, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password:");
		lblNewLabel_1_2.setBounds(69, 158, 72, 14);
		contentPane.add(lblNewLabel_1_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(146, 155, 169, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(177, 200, 89, 23);
		contentPane.add(btnNewButton);
	}
}
