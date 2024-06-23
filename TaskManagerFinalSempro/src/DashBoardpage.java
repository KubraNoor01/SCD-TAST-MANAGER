import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;

public class DashBoardpage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoardpage frame = new DashBoardpage();
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
	public DashBoardpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("DashBoard");
		lblNewLabel_1.setFont(new Font("Modern No. 20", Font.BOLD, 18));
		lblNewLabel_1.setBounds(28, 22, 122, 28);
		contentPane.add(lblNewLabel_1);
		
		separator = new JSeparator();
		separator.setBounds(28, 48, 94, 20);
		contentPane.add(separator);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("For Organization");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(93, 57, 171, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("For Work");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(93, 93, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Personal Use");
		rdbtnNewRadioButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_1_1.setBounds(93, 133, 171, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
	}
}
