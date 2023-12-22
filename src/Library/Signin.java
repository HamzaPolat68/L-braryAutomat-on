package Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Signin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfkulad;
	private JLabel lblsifre;
	private JTextField tfsifre;
	private JLabel lblemail;
	private JTextField tfEmail;
	private JTextField tftel;
	private JLabel lbltel;
	private JButton btnKayitOl;
	private JTextField tfsoyad;
	private JTextField tfad;
	private JLabel lblNewLabel_4;
	private JLabel lblkulad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signin frame = new Signin();
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
	public Signin() {
		setTitle("Signin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setName("Signin");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblad = new JLabel("Ad");
		lblad.setBounds(272, 106, 68, 28);
		lblad.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(lblad);
		
		JLabel lblNewLabel_4;
		lblkulad = new JLabel("Kullanıcı Adı");
		lblkulad.setBounds(272, 192, 68, 28);
		lblkulad.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(lblkulad);
		
		tfkulad = new JTextField();
		tfkulad.setBounds(388, 197, 96, 19);
		contentPane.add(tfkulad);
		tfkulad.setColumns(10);

		
		lblsifre = new JLabel("Şifre");
		lblsifre.setBounds(272, 235, 68, 28);
		lblsifre.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(lblsifre);
		
		tfsifre = new JTextField();
		tfsifre.setBounds(388, 240, 96, 19);
		contentPane.add(tfsifre);
		tfsifre.setColumns(10);
		
		lblemail = new JLabel("E-Mail");
		lblemail.setBounds(272, 278, 68, 28);
		lblemail.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(lblemail);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(388, 283, 96, 19);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		tftel = new JTextField();
		tftel.setBounds(388, 326, 96, 19);
		contentPane.add(tftel);
		tftel.setColumns(10);
		
		lbltel = new JLabel("Telefon No");
		lbltel.setBounds(272, 321, 68, 28);
		lbltel.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(lbltel);
		
		btnKayitOl = new JButton("Kayıt Ol");
		btnKayitOl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKayitOl.setBounds(324, 387, 117, 28);
		btnKayitOl.setForeground(Color.RED);
		btnKayitOl.setBackground(Color.BLACK);
		contentPane.add(btnKayitOl);
		
		JLabel lblsoyad = new JLabel("Soyad");
		lblsoyad.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblsoyad.setBounds(272, 149, 68, 28);
		contentPane.add(lblsoyad);
		
		tfsoyad = new JTextField();
		tfsoyad.setColumns(10);
		tfsoyad.setBounds(388, 154, 96, 19);
		contentPane.add(tfsoyad);
		
		tfad = new JTextField();
		tfad.setColumns(10);
		tfad.setBounds(388, 111, 96, 19);
		contentPane.add(tfad);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Hamza Polatçelik\\OneDrive - Bolu Abant İzzet Baysal Üniversitesi\\Masaüstü\\signin (1).jpg"));
		lblNewLabel_4.setBounds(148, 59, 472, 456);
		contentPane.add(lblNewLabel_4);
		
	
	}
}
