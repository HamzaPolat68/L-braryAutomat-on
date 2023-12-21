package Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class CustomerHomePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerHomePage frame = new CustomerHomePage();
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
	public CustomerHomePage() {
		setTitle("CustomerHomePage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(188, 143, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKAdi = new JLabel("Kullanıcı Adı:");
		lblKAdi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblKAdi.setBounds(10, 32, 110, 28);
		contentPane.add(lblKAdi);
		
		JLabel lblUnvan = new JLabel("Ünvan:");
		lblUnvan.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUnvan.setBounds(10, 80, 110, 28);
		contentPane.add(lblUnvan);
		
		JLabel lblKAdiDol = new JLabel("");
		lblKAdiDol.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblKAdiDol.setBounds(110, 32, 90, 28);
		contentPane.add(lblKAdiDol);
		
		JLabel lblUnvanDol = new JLabel("");
		lblUnvanDol.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblUnvanDol.setBounds(110, 80, 90, 28);
		contentPane.add(lblUnvanDol);
		
		JPanel kitapPanel = new JPanel();
		kitapPanel.setForeground(new Color(51, 0, 255));
		kitapPanel.setBackground(new Color(255, 239, 213));
		kitapPanel.setBounds(10, 149, 766, 108);
		contentPane.add(kitapPanel);
		kitapPanel.setLayout(null);
		
		JButton btnKitapLis = new JButton("Kitap Listesi");
		btnKitapLis.setBackground(new Color(233, 150, 122));
		btnKitapLis.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnKitapLis.setBounds(29, 46, 118, 32);
		kitapPanel.add(btnKitapLis);
		
		JButton btnKitapAra = new JButton("Kitap Ara");
		btnKitapAra.setBackground(new Color(210, 180, 140));
		btnKitapAra.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnKitapAra.setBounds(213, 46, 109, 32);
		kitapPanel.add(btnKitapAra);
		
		JButton btnKitapOduncAl = new JButton("Kitap Ödünç Al");
		btnKitapOduncAl.setBackground(new Color(184, 134, 11));
		btnKitapOduncAl.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnKitapOduncAl.setBounds(386, 46, 118, 32);
		kitapPanel.add(btnKitapOduncAl);
		
		JButton btnKitapIade = new JButton("Kitap İade");
		btnKitapIade.setBackground(new Color(211, 211, 211));
		btnKitapIade.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnKitapIade.setBounds(574, 46, 128, 32);
		kitapPanel.add(btnKitapIade);
		
		JLabel lblKitapIs = new JLabel("KİTAP İŞLEMLERİ");
		lblKitapIs.setForeground(new Color(0, 0, 0));
		lblKitapIs.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKitapIs.setBounds(10, 137, 125, 13);
		contentPane.add(lblKitapIs);
		
		JButton btnKütüpBilgi = new JButton("Kütüphane Bilgisi");
		btnKütüpBilgi.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnKütüpBilgi.setBounds(10, 508, 150, 45);
		contentPane.add(btnKütüpBilgi);
		
		JButton btnCikis = new JButton("Çıkış");
		btnCikis.setForeground(new Color(255, 0, 0));
		btnCikis.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCikis.setBounds(665, 520, 100, 30);
		contentPane.add(btnCikis);
		
		JButton btnOduncKitap = new JButton("Ödünç Alınan Kitaplar");
		btnOduncKitap.setBackground(new Color(60, 179, 113));
		btnOduncKitap.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOduncKitap.setBounds(93, 287, 200, 60);
		contentPane.add(btnOduncKitap);
		
		JButton btnBekleyenKitap = new JButton("Ödünç Almayı Bekleyen");
		btnBekleyenKitap.setBackground(new Color(144, 238, 144));
		btnBekleyenKitap.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBekleyenKitap.setBounds(459, 287, 200, 60);
		contentPane.add(btnBekleyenKitap);
	}

}
