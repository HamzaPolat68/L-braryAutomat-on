package Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class KitapSil extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfKitapId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KitapSil frame = new KitapSil();
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
	public KitapSil() {
		setTitle("Kitap Sil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfKitapId = new JTextField();
		tfKitapId.setBounds(276, 255, 96, 19);
		contentPane.add(tfKitapId);
		tfKitapId.setColumns(10);
		
		JLabel lblKitapId = new JLabel("ID");
		lblKitapId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKitapId.setBounds(195, 257, 56, 13);
		contentPane.add(lblKitapId);
		
		JButton btnSil = new JButton("SİL");
		btnSil.setBounds(234, 296, 85, 21);
		contentPane.add(btnSil);
	}

}
