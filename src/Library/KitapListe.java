package Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class KitapListe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable kitapTable;
	private JLabel lblKitapAdi;
	private JTextField tfkitapAd;
	private JButton btnKitapAra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KitapListe frame = new KitapListe();
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
	public KitapListe() {
		setTitle("Kitap Liste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 77, 785, 533);
		contentPane.add(scrollPane);
		
		kitapTable = new JTable();
		kitapTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Kitap Ad\u0131", "Sayfa Say\u0131s\u0131", "Kitap T\u00FCr\u00FC", "Yazar", "Bas\u0131m Y\u0131l\u0131", "Ekleme Tarihi", "D\u00FCzenleme Tarihi"
			}
		));
		kitapTable.setBounds(161, 426, 169, 103);
		//contentPane.add(table);
		scrollPane.setViewportView(kitapTable);
		
		lblKitapAdi = new JLabel("Kitap Adı");
		lblKitapAdi.setBounds(25, 27, 105, 27);
		contentPane.add(lblKitapAdi);
		
		tfkitapAd = new JTextField();
		tfkitapAd.setBounds(101, 31, 88, 19);
		contentPane.add(tfkitapAd);
		tfkitapAd.setColumns(10);
		
		btnKitapAra = new JButton("Ara");
		btnKitapAra.setBounds(229, 30, 85, 21);
		contentPane.add(btnKitapAra);
		
	}

}
