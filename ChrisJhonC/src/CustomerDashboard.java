import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;

public class CustomerDashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerDashboard frame = new CustomerDashboard();
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
	public CustomerDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 484);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#449397"));

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#90D1C8"));
		panel.setBounds(10, 47, 113, 344);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Profile Picture");
		btnNewButton.setBackground(Color.decode("#449397"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton.setBounds(10, 11, 89, 59);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Hello!");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(34, 81, 44, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Chris Jhon Cobrador");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(10, 100, 111, 32);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Shopping Cart");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 143, 101, 14);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("CART");
		btnNewButton_1.setForeground(Color.decode("#243531"));  
		btnNewButton_1.setBackground(Color.decode(  "#449397"));
		setBackground(Color.decode("#449397"));
		btnNewButton_1.setBounds(10, 161, 89, 35);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Deals");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(10, 207, 46, 14);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("PROMOS");
		btnNewButton_2.setForeground(Color.decode("#243531")); 
		btnNewButton_2.setBackground(Color.decode("#449397"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.setBounds(10, 224, 89, 35);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LOGOUT");
		btnNewButton_3.setForeground(Color.decode("#243531"));
		btnNewButton_3.setBackground(Color.decode("#449397"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(10, 283, 89, 25);
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#7CC0CF"));
		panel_1.setBounds(10, 11, 775, 25);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CJ's Tech Finds");
		lblNewLabel.setBounds(10, -2, 111, 25);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		 JComboBox<String> comboBox = new JComboBox<>();
		 String[] items = {"Computers", "Laptops", "Phones"};
		  for (String item : items) {
              comboBox.addItem(item);
          }
		comboBox.setBounds(664, 0, 111, 25);
		panel_1.add(comboBox);
		comboBox.setBackground(Color.decode("#7CC0CF"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#7CC0CF"));
		panel_2.setBounds(10, 402, 776, 36);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("About Us");
		btnNewButton_4.setForeground(Color.decode("#243531"));
		btnNewButton_4.setBackground(Color.decode("#449397"));
		btnNewButton_4.setBounds(71, 9, 89, 20);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("Contact Us");
		btnNewButton_6.setForeground(Color.decode("#243531"));
		btnNewButton_6.setBackground(Color.decode("#449397"));
		btnNewButton_6.setBounds(170, 9, 89, 20);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("Help");
		btnNewButton_5.setForeground(Color.decode("#243531"));
		btnNewButton_5.setBackground(Color.decode("#449397"));
		btnNewButton_5.setBounds(269, 9, 89, 20);
		panel_2.add(btnNewButton_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.decode("#90D1C8"));
		panel_3.setBounds(133, 47, 230, 161);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton button = new JButton("₱ 4,999");
		button.setForeground(Color.decode("#243531"));
		button.setBackground(Color.decode("#449397"));
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBounds(10, 122, 83, 28);
		panel_3.add(button);
		
		JButton button_4 = new JButton("");
		button_4.setBackground(Color.decode("#449397"));
		Image img = new ImageIcon(this.getClass().getResource("/phone1.png")).getImage();
		button_4.setIcon(new ImageIcon(img));
		button_4.setBounds(10, 11, 187, 100);
		panel_3.add(button_4);
		
		JButton btnNewButton_7 = new JButton("Add to Cart");
		btnNewButton_7.setForeground(Color.decode("#243531"));
		btnNewButton_7.setBackground(Color.decode("#449397"));
		btnNewButton_7.setBounds(103, 123, 104, 28);
		panel_3.add(btnNewButton_7);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.decode("#90D1C8"));
		panel_3_1.setBounds(235, 230, 230, 161);
		contentPane.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JButton button_1 = new JButton("₱ 3,880");
		button_1.setForeground(Color.decode("#243531"));
		button_1.setBackground(Color.decode("#449397")); 
		button_1.setBounds(10, 125, 77, 28);
		panel_3_1.add(button_1);
		
		JButton button_5 = new JButton("");
		button_5.setBackground(Color.decode("#449397"));
		Image img3 = new ImageIcon(this.getClass().getResource("/phone3.png")).getImage();
		button_5.setIcon(new ImageIcon(img3));
		button_5.setBounds(10, 11, 187, 100);
		panel_3_1.add(button_5);
		
		JButton btnNewButton_7_1 = new JButton("Add to Cart");
		btnNewButton_7_1.setForeground(Color.decode("#243531"));
		btnNewButton_7_1.setBackground(Color.decode("#449397"));
		btnNewButton_7_1.setBounds(103, 125, 104, 28);
		panel_3_1.add(btnNewButton_7_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(Color.decode("#90D1C8"));
		panel_3_2.setBounds(461, 47, 230, 161);
		contentPane.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JButton button_2 = new JButton("₱ 6,700");
		button_2.setForeground(Color.decode("#243531"));
		button_2.setBackground(Color.decode("#449397"));
		button_2.setBounds(10, 122, 77, 28);
		panel_3_2.add(button_2);
		
		JButton button_6 = new JButton("");
		button_6.setBackground(Color.decode("#449397"));
		Image img2 = new ImageIcon(this.getClass().getResource("/phone2.png")).getImage();
		button_6.setIcon(new ImageIcon(img2));
		button_6.setBounds(10, 11, 187, 100);
		panel_3_2.add(button_6);
		
		JButton btnNewButton_7_2 = new JButton("Add to Cart");
		btnNewButton_7_2.setForeground(Color.decode("#243531"));
		btnNewButton_7_2.setBackground(Color.decode("#449397"));
		btnNewButton_7_2.setBounds(103, 122, 105, 28);
		panel_3_2.add(btnNewButton_7_2);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(Color.decode("#90D1C8"));
		panel_3_3.setBounds(555, 230, 230, 161);
		contentPane.add(panel_3_3);
		panel_3_3.setLayout(null);
		
		JButton button_3 = new JButton("₱ 3,550");
		button_3.setForeground(Color.decode("#243531"));
		button_3.setBackground(Color.decode("#449397"));
		button_3.setBounds(10, 122, 77, 28);
		panel_3_3.add(button_3);
		
		JButton button_7 = new JButton("");
		button_7.setBackground(Color.decode("#449397"));
		Image img4 = new ImageIcon(this.getClass().getResource("/phone4.png")).getImage();
		button_7.setIcon(new ImageIcon(img4));
		button_7.setBounds(10, 11, 187, 100);
		panel_3_3.add(button_7);
		
		JButton btnNewButton_7_3 = new JButton("Add to Cart");
		btnNewButton_7_3.setForeground(Color.decode("#243531"));
		btnNewButton_7_3.setBackground(Color.decode("#449397"));
		btnNewButton_7_3.setBounds(103, 122, 105, 28);
		panel_3_3.add(btnNewButton_7_3);
       


	}
}
