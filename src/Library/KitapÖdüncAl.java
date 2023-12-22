package Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class KitapÖdüncAl extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfKitapId;
	private JButton btnOduncAl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KitapÖdüncAl frame = new KitapÖdüncAl();
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
	public KitapÖdüncAl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKitapId = new JLabel("ID");
		lblKitapId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKitapId.setBounds(165, 242, 60, 13);
		contentPane.add(lblKitapId);
		
		tfKitapId = new JTextField();
		tfKitapId.setBounds(259, 240, 96, 19);
		contentPane.add(tfKitapId);
		tfKitapId.setColumns(10);
		
		btnOduncAl = new JButton("Ödünç Al");
		btnOduncAl.setBounds(211, 285, 85, 21);
		contentPane.add(btnOduncAl);
	}

}
