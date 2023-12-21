package Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class KullanıcıSil extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
					KullanıcıSil frame = new KullanıcıSil();
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
	public KullanıcıSil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAd = new JLabel("Ad");
		lblAd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAd.setBounds(164, 165, 45, 13);
		contentPane.add(lblAd);
		
		JLabel lblSoyad = new JLabel("Soyad");
		lblSoyad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSoyad.setBounds(164, 208, 45, 13);
		contentPane.add(lblSoyad);
		
		JLabel lblTelefonNo = new JLabel("Telefon No");
		lblTelefonNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefonNo.setBounds(164, 254, 65, 13);
		contentPane.add(lblTelefonNo);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(164, 293, 45, 13);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(255, 162, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(255, 205, 96, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(255, 251, 96, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(255, 290, 96, 19);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("SİL");
		btnNewButton.setBounds(217, 336, 85, 21);
		contentPane.add(btnNewButton);
	}

}
