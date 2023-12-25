package Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class KullanıcıListe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblKulAd;
	private JTextField tfKulAd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KullanıcıListe frame = new KullanıcıListe();
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
	public KullanıcıListe() {
		setTitle("Kullanıcı Liste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 222, 173));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(2, 70, 786, 688);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(253, 245, 230));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "Ad", "Soyad", "Telefon No", "E-mail"
			}
		));
		table.setBounds(241, 465, 157, 62);
		//contentPane.add(table);
		scrollPane.setViewportView(table);
		
		lblKulAd = new JLabel("Kullanıcı Adı");
		lblKulAd.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblKulAd.setBounds(44, 28, 107, 19);
		contentPane.add(lblKulAd);
		
		tfKulAd = new JTextField();
		tfKulAd.setBounds(150, 29, 96, 19);
		contentPane.add(tfKulAd);
		tfKulAd.setColumns(10);
		
		JButton btnKulAra = new JButton("Ara");
		btnKulAra.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnKulAra.setBounds(279, 28, 85, 21);
		contentPane.add(btnKulAra);
	}
}
