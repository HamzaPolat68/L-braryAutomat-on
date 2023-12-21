package Library;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfKAdi;
	private JPasswordField tfSifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kullanıcı Adı");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(243, 253, 117, 28);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblSifre = new JLabel("Şifre");
		lblSifre.setForeground(new Color(0, 0, 0));
		lblSifre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSifre.setBounds(243, 289, 117, 28);
		lblSifre.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblSifre);
		
		tfKAdi = new JTextField();
		tfKAdi.setBounds(352, 254, 96, 19);
		contentPane.add(tfKAdi);
		tfKAdi.setColumns(10);
		
		tfSifre = new JPasswordField();
		tfSifre.setBounds(352, 296, 96, 19);
		contentPane.add(tfSifre);
		
		JButton btnGiris = new JButton("Giriş");
		btnGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGiris.setBounds(312, 350, 117, 28);
		contentPane.add(btnGiris);
		
		JButton btnUyeOl = new JButton("Üye Ol");
		btnUyeOl.setBounds(312, 405, 117, 28);
		contentPane.add(btnUyeOl);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Hamza Polatçelik\\OneDrive - Bolu Abant İzzet Baysal Üniversitesi\\Masaüstü\\login.jpg"));
		lblNewLabel_1.setBounds(21, -77, 962, 728);
		contentPane.add(lblNewLabel_1);
		
		
		
		
	}
}
