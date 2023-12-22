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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 70, 808, 584);
		contentPane.add(scrollPane);
		
		table = new JTable();
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
		lblKulAd.setBounds(44, 28, 107, 19);
		contentPane.add(lblKulAd);
		
		tfKulAd = new JTextField();
		tfKulAd.setBounds(134, 28, 96, 19);
		contentPane.add(tfKulAd);
		tfKulAd.setColumns(10);
		
		JButton btnKulAra = new JButton("Ara");
		btnKulAra.setBounds(271, 27, 85, 21);
		contentPane.add(btnKulAra);
	}
}
