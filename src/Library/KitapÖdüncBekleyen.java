package Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class KitapÖdüncBekleyen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblKitapId;
	private JTextField tfKitapId;
	private JButton btnAra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KitapÖdüncBekleyen frame = new KitapÖdüncBekleyen();
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
	public KitapÖdüncBekleyen() {
		setTitle("Kitap Ödünç Bekleyen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 180, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(2, 80, 783, 677);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 248, 220));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "Kitap Ad\u0131", "\u00DCye Ad\u0131", "\u00DCye Soyad\u0131", "Teslim Tarihi"
			}
		));
		table.setBounds(213, 483, 248, 87);
		//contentPane.add(table);
		scrollPane.setViewportView(table);
		
		lblKitapId = new JLabel("ID");
		lblKitapId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblKitapId.setBounds(57, 35, 79, 24);
		contentPane.add(lblKitapId);
		
		tfKitapId = new JTextField();
		tfKitapId.setBounds(130, 39, 96, 19);
		contentPane.add(tfKitapId);
		tfKitapId.setColumns(10);
		
		btnAra = new JButton("Ara");
		btnAra.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAra.setBounds(277, 38, 85, 21);
		contentPane.add(btnAra);
		
	}

}
