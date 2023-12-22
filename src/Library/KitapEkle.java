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

public class KitapEkle extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel;
	private JLabel lblSayfaSays;
	private JLabel lblKitapTr;
	private JLabel lblYazar;
	private JLabel lblBasmYl;

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
		
		textField = new JTextField();
		textField.setBounds(312, 141, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(312, 170, 96, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(312, 204, 96, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(312, 233, 96, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(312, 262, 96, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(312, 293, 96, 19);
		contentPane.add(textField_5);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(197, 141, 45, 13);
		contentPane.add(lblId);
		
		lblNewLabel = new JLabel("Kitap Adı");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(197, 172, 73, 13);
		contentPane.add(lblNewLabel);
		
		lblSayfaSays = new JLabel("Sayfa Sayısı");
		lblSayfaSays.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSayfaSays.setBounds(197, 203, 105, 13);
		contentPane.add(lblSayfaSays);
		
		lblKitapTr = new JLabel("Kitap Türü");
		lblKitapTr.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKitapTr.setBounds(197, 234, 73, 13);
		contentPane.add(lblKitapTr);
		
		lblYazar = new JLabel("Yazar");
		lblYazar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblYazar.setBounds(197, 265, 45, 13);
		contentPane.add(lblYazar);
		
		lblBasmYl = new JLabel("Basım Yılı");
		lblBasmYl.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBasmYl.setBounds(197, 296, 73, 13);
		contentPane.add(lblBasmYl);
		
		JButton btnNewButton = new JButton("EKLE");
		btnNewButton.setBounds(258, 333, 85, 21);
		contentPane.add(btnNewButton);
	}
}
