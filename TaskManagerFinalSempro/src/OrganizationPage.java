import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrganizationPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrganizationPage frame = new OrganizationPage();
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
	public OrganizationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(149, 40, 94, 20);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome ");
		lblNewLabel_1.setFont(new Font("Modern No. 20", Font.BOLD, 18));
		lblNewLabel_1.setBounds(161, 11, 82, 28);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Create Task");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(78, 71, 147, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Read Task");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(78, 105, 147, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Update Task");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(78, 150, 147, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Delete Task");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_1.setBounds(78, 187, 147, 23);
		contentPane.add(btnNewButton_1_1_1);
	}

}
