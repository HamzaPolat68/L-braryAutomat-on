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

public class KitapÖdüncAlan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField tfKitapId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KitapÖdüncAlan frame = new KitapÖdüncAlan();
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
	public KitapÖdüncAlan() {
		setTitle("Kitap Ödünç Alan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(2, 80, 783, 677);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(250, 250, 210));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Kitap Ad\u0131", "Üye Adı", "Üye Soyadı", "Veriliş Tarihi", "Teslim Tarihi"
			}
		));
		table.setBounds(209, 419, 164, 84);
		//contentPane.add(table);
		scrollPane.setViewportView(table);
		
		JLabel lblKitapId = new JLabel("ID");
		lblKitapId.setBounds(57, 35, 79, 24);
		lblKitapId.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblKitapId);
		
		tfKitapId = new JTextField();
		tfKitapId.setBounds(130, 39, 96, 19);
		contentPane.add(tfKitapId);
		tfKitapId.setColumns(10);
		
		JButton btnOduncAl = new JButton("Ödünç Al");
		btnOduncAl.setBounds(277, 38, 85, 21);
		btnOduncAl.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(btnOduncAl);
	}
}
