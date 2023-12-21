package Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class KitapDüzenle extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KitapDüzenle frame = new KitapDüzenle();
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
	public KitapDüzenle() {
		setTitle("Kitap Düzenle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKitapAd = new JLabel("ID");
		lblKitapAd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKitapAd.setBounds(150, 168, 45, 13);
		contentPane.add(lblKitapAd);
		
		JLabel lblKitapAd_1 = new JLabel("Kitap Adı");
		lblKitapAd_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKitapAd_1.setBounds(150, 198, 78, 13);
		contentPane.add(lblKitapAd_1);
		
		JLabel lblSayfaSays = new JLabel("Sayfa Sayısı");
		lblSayfaSays.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSayfaSays.setBounds(150, 228, 78, 13);
		contentPane.add(lblSayfaSays);
		
		JLabel lblKitapTr = new JLabel("Kitap Türü");
		lblKitapTr.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKitapTr.setBounds(150, 258, 78, 13);
		contentPane.add(lblKitapTr);
		
		JLabel lblYazar = new JLabel("Yazar");
		lblYazar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblYazar.setBounds(150, 288, 45, 13);
		contentPane.add(lblYazar);
		
		JLabel lblBasmYl = new JLabel("Basım Yılı");
		lblBasmYl.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBasmYl.setBounds(150, 318, 78, 13);
		contentPane.add(lblBasmYl);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(251, 166, 96, 19);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(251, 196, 96, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(251, 226, 96, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(251, 256, 96, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(251, 286, 96, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(251, 316, 96, 19);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("Düzenle");
		btnNewButton.setBounds(202, 362, 85, 21);
		contentPane.add(btnNewButton);
	}

}
