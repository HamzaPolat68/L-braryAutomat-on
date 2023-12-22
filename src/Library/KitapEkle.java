package Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;

public class KitapEkle extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfKitapId;
	private JTextField tfKitapAdi;
	private JTextField tfSayfaSayisi;
	private JTextField tfYazar;
	private JTextField tfBasimYili;
	private JLabel lblKitapAdi;
	private JLabel lblSayfaSayisi;
	private JLabel lblKitapTür;
	private JLabel lblYazar;
	private JLabel lblBasimYil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KitapEkle frame = new KitapEkle();
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
	public KitapEkle() {
		setTitle("Kitap Ekle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 232, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfKitapId = new JTextField();
		tfKitapId.setBounds(312, 141, 96, 19);
		contentPane.add(tfKitapId);
		tfKitapId.setColumns(10);
		
		tfKitapAdi = new JTextField();
		tfKitapAdi.setColumns(10);
		tfKitapAdi.setBounds(312, 170, 96, 19);
		contentPane.add(tfKitapAdi);
		
		tfSayfaSayisi = new JTextField();
		tfSayfaSayisi.setColumns(10);
		tfSayfaSayisi.setBounds(312, 204, 96, 19);
		contentPane.add(tfSayfaSayisi);
		
		tfYazar = new JTextField();
		tfYazar.setColumns(10);
		tfYazar.setBounds(312, 262, 96, 19);
		contentPane.add(tfYazar);
		
		tfBasimYili = new JTextField();
		tfBasimYili.setColumns(10);
		tfBasimYili.setBounds(312, 293, 96, 19);
		contentPane.add(tfBasimYili);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(197, 141, 45, 13);
		contentPane.add(lblId);
		
		lblKitapAdi = new JLabel("Kitap Adı");
		lblKitapAdi.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKitapAdi.setBounds(197, 172, 73, 13);
		contentPane.add(lblKitapAdi);
		
		lblSayfaSayisi = new JLabel("Sayfa Sayısı");
		lblSayfaSayisi.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSayfaSayisi.setBounds(197, 203, 105, 13);
		contentPane.add(lblSayfaSayisi);
		
		lblKitapTür = new JLabel("Kitap Türü");
		lblKitapTür.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKitapTür.setBounds(197, 234, 73, 13);
		contentPane.add(lblKitapTür);
		
		lblYazar = new JLabel("Yazar");
		lblYazar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblYazar.setBounds(197, 265, 45, 13);
		contentPane.add(lblYazar);
		
		lblBasimYil = new JLabel("Basım Yılı");
		lblBasimYil.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBasimYil.setBounds(197, 296, 73, 13);
		contentPane.add(lblBasimYil);
		
		JButton btnEkle = new JButton("EKLE");
		btnEkle.setBounds(258, 333, 85, 21);
		contentPane.add(btnEkle);
		
		JComboBox cbKitapTür = new JComboBox();
		cbKitapTür.setBounds(312, 231, 96, 21);
		contentPane.add(cbKitapTür);
	}
}
