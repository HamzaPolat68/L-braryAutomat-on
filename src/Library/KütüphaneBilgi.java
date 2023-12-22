package Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class KütüphaneBilgi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtkitapsayi;
	private JTextField txtüyesayi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KütüphaneBilgi frame = new KütüphaneBilgi();
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
	public KütüphaneBilgi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setForeground(Color.WHITE);
		panel.setBounds(10, 10, 576, 96);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KİTAP SAYISI");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(71, 56, 134, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ÜYE SAYISI");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(395, 56, 134, 30);
		panel.add(lblNewLabel_1);
		
		txtkitapsayi = new JTextField();
		txtkitapsayi.setBounds(80, 27, 96, 19);
		panel.add(txtkitapsayi);
		txtkitapsayi.setColumns(10);
		
		txtüyesayi = new JTextField();
		txtüyesayi.setColumns(10);
		txtüyesayi.setBounds(397, 27, 96, 19);
		panel.add(txtüyesayi);
		
		JLabel lblNewLabel_2 = new JLabel("              KÜTÜPHANE HAKKINDA");
		lblNewLabel_2.setForeground(new Color(139, 69, 19));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(33, 116, 524, 53);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnFikiratlasKtphanesiniversitemizin = new JTextPane();
		txtpnFikiratlasKtphanesiniversitemizin.setBackground(new Color(211, 211, 211));
		txtpnFikiratlasKtphanesiniversitemizin.setForeground(new Color(165, 42, 42));
		txtpnFikiratlasKtphanesiniversitemizin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnFikiratlasKtphanesiniversitemizin.setText("                                                                     FikirAtlası Kütüphanesi Üniversitemizin eğitim-öğretim ve araştırma faaliyetlerini desteklemek amacıyla 2023 yılında kurulmuştur. Bünyesinde birçok  kitap barındıran kütüphanemizden, aldığınız kitabı zamanında teslim etmek şartıyla istediğiniz kitabı ödünç alabilirsiniz. Keyifli ve bilgi dolu okumalar...");
		txtpnFikiratlasKtphanesiniversitemizin.setBounds(33, 165, 524, 207);
		contentPane.add(txtpnFikiratlasKtphanesiniversitemizin);
		
		JLabel lblNewLabel_3 = new JLabel("İLETİŞİM");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(33, 382, 103, 39);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Hamza Polatçelik\\OneDrive - Bolu Abant İzzet Baysal Üniversitesi\\Masaüstü\\indir.png"));
		lblNewLabel_4.setBounds(33, 419, 50, 50);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("polatcelikhamza94@gmail.com");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(93, 416, 246, 53);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(321, 418, 265, 53);
		contentPane.add(lblNewLabel_6);
	}
}
