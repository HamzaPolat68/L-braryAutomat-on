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

public class Kitapiade extends JFrame {

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
					Kitapiade frame = new Kitapiade();
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
	public Kitapiade() {
		setTitle("Kitap İade");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 150, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(257, 134, 96, 19);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(257, 168, 96, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(257, 202, 96, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(257, 236, 96, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(257, 270, 96, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(257, 304, 96, 19);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(167, 137, 59, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblKitapAd = new JLabel("Kitap Adı");
		lblKitapAd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKitapAd.setBounds(167, 171, 80, 13);
		contentPane.add(lblKitapAd);
		
		JLabel lblSayfaSays = new JLabel("Sayfa Sayısı");
		lblSayfaSays.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSayfaSays.setBounds(167, 205, 80, 13);
		contentPane.add(lblSayfaSays);
		
		JLabel lblKitapTr = new JLabel("Kitap Türü");
		lblKitapTr.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKitapTr.setBounds(167, 239, 80, 13);
		contentPane.add(lblKitapTr);
		
		JLabel lblYazar = new JLabel("Yazar");
		lblYazar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblYazar.setBounds(167, 273, 59, 13);
		contentPane.add(lblYazar);
		
		JLabel lblBsmYl = new JLabel("Basım Yılı");
		lblBsmYl.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBsmYl.setBounds(167, 307, 80, 13);
		contentPane.add(lblBsmYl);
		
		JButton btnNewButton = new JButton("İade Et");
		btnNewButton.setBounds(219, 346, 85, 21);
		contentPane.add(btnNewButton);
	}

}
