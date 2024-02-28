import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;


public class AdminScreen extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminScreen frame = new AdminScreen();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AdminScreen() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 480);
        contentPane = new JPanel();
        contentPane.setBackground(Color.decode("#449397"));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel Leftpanel = new JPanel();
        Leftpanel.setBackground(new Color(144, 209, 200));
        Leftpanel.setBounds(10, 11, 139, 391);
        contentPane.add(Leftpanel);
        Leftpanel.setLayout(null);

        JButton dashboardButton = new JButton("Dashboard");
        dashboardButton.setBackground(Color.decode("#449397"));
        dashboardButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
        
        dashboardButton.setBounds(21, 126, 89, 34);
        Leftpanel.add(dashboardButton);

        JButton userButton = new JButton("Users");
        userButton.setBackground(Color.decode("#449397"));
        userButton.setBounds(21, 171, 89, 34);
        Leftpanel.add(userButton);
        
        JButton productsButton = new JButton("Products");
        productsButton.setBackground(Color.decode("#449397"));
        productsButton.setBounds(21, 216, 89, 34);
        Leftpanel.add(productsButton);
        
        JButton ordersButton = new JButton("Orders");
        ordersButton.setBackground(Color.decode("#449397"));
        ordersButton.setBounds(21, 261, 89, 34);
        Leftpanel.add(ordersButton);
        
        JButton reveneuButton = new JButton("Reveneu");
        reveneuButton.setBackground(Color.decode("#449397"));
        reveneuButton.setBounds(21, 306, 89, 34);
        Leftpanel.add(reveneuButton);
        
        JButton logoButton = new JButton("LOGO");
        logoButton.setBackground(Color.decode("#449397"));
        logoButton.setBounds(21, 11, 89, 67);
        Leftpanel.add(logoButton);
        
        JLabel hello_label = new JLabel("Hello, Admin");
        hello_label.setFont(new Font("Tahoma", Font.BOLD, 13));
        hello_label.setBounds(10, 89, 132, 26);
        Leftpanel.add(hello_label);
        
        JButton btnLogout = new JButton("LOGOUT");
        btnLogout.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnLogout.setBackground(new Color(68, 147, 151));
        btnLogout.setBounds(21, 351, 89, 34);
        Leftpanel.add(btnLogout);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#449397"));
        panel.setBounds(147, 0, 737, 408);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JPanel heading = new JPanel();
        heading.setBackground(Color.decode("#7CC0CF"));
        heading.setBounds(10, 11, 717, 28);
        panel.add(heading);
        heading.setLayout(null);
        
        JLabel ShopName_label = new JLabel("CJ's Tech Finds");
        ShopName_label.setBounds(286, 0, 175, 28);
        heading.add(ShopName_label);
        ShopName_label.setFont(new Font("Tahoma", Font.BOLD, 22));
        
        JPanel userPanel = new JPanel();
        userPanel.setBackground(Color.decode("#90D1C8"));
        userPanel.setBounds(286, 50, 190, 110);
        panel.add(userPanel);
        userPanel.setLayout(null);
        
        JLabel lblNewLabel_3_1 = new JLabel("Users");
        lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_3_1.setBounds(10, 0, 140, 26);
        userPanel.add(lblNewLabel_3_1);
        
        JButton btnNewButton_1 = new JButton("34");
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_1.setBackground(new Color(68, 147, 151));
        btnNewButton_1.setBounds(45, 37, 105, 23);
        userPanel.add(btnNewButton_1);
        
        JLabel lblNewLabel_1_1 = new JLabel(" * Number of Users");
        lblNewLabel_1_1.setBounds(45, 82, 135, 28);
        userPanel.add(lblNewLabel_1_1);
        
        JPanel product_panel = new JPanel();
        product_panel.setBackground(new Color(144, 209, 200));
        product_panel.setBounds(57, 50, 190, 110);
        panel.add(product_panel);
        product_panel.setLayout(null);
        
        JLabel productLabel = new JLabel("Products");
        productLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        productLabel.setBackground(new Color(255, 255, 255));
        productLabel.setBounds(10, 0, 140, 26);
        product_panel.add(productLabel);
        
        JButton btnNewButton = new JButton("17");
        btnNewButton.setBackground(Color.decode("#449397"));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.setBounds(48, 37, 102, 23);
        product_panel.add(btnNewButton);
        
        JLabel lblNewLabel_1 = new JLabel(" * Products are Currently ");
        lblNewLabel_1.setBounds(26, 71, 154, 28);
        product_panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("in the Store");
        lblNewLabel_1_2.setBounds(60, 82, 120, 28);
        product_panel.add(lblNewLabel_1_2);
        
        JPanel salesPanel = new JPanel();
        salesPanel.setBackground(new Color(144, 209, 200));
        salesPanel.setBounds(519, 50, 190, 110);
        panel.add(salesPanel);
        salesPanel.setLayout(null);
        
        JLabel lblNewLabel_3_2 = new JLabel("Sales");
        lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_3_2.setBounds(10, 0, 150, 26);
        salesPanel.add(lblNewLabel_3_2);
        
        JButton btnNewButton_2 = new JButton("28");
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_2.setBackground(new Color(68, 147, 151));
        btnNewButton_2.setBounds(44, 37, 105, 23);
        salesPanel.add(btnNewButton_2);
        
        JLabel lblNewLabel_1_1_3 = new JLabel(" * Number of Transactions");
        lblNewLabel_1_1_3.setBounds(27, 82, 190, 28);
        salesPanel.add(lblNewLabel_1_1_3);
        
        JPanel ordersPanel = new JPanel();
        ordersPanel.setBackground(new Color(144, 209, 200));
        ordersPanel.setBounds(143, 171, 190, 110);
        panel.add(ordersPanel);
        ordersPanel.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel("Orders");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_3.setBounds(10, 0, 140, 26);
        ordersPanel.add(lblNewLabel_3);
        
        JButton btnNewButton_3 = new JButton("6");
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_3.setBackground(new Color(68, 147, 151));
        btnNewButton_3.setBounds(45, 37, 105, 23);
        ordersPanel.add(btnNewButton_3);
        
        JLabel lblNewLabel_1_1_1 = new JLabel(" * Pending Orders");
        lblNewLabel_1_1_1.setBounds(45, 82, 127, 28);
        ordersPanel.add(lblNewLabel_1_1_1);
        
        JPanel revenuePanel = new JPanel();
        revenuePanel.setBackground(new Color(144, 209, 200));
        revenuePanel.setBounds(403, 171, 190, 110);
        panel.add(revenuePanel);
        revenuePanel.setLayout(null);
        
        JLabel lblNewLabel_3_3 = new JLabel("");
        lblNewLabel_3_3.setBounds(10, 0, 140, 26);
        revenuePanel.add(lblNewLabel_3_3);
        
        JLabel lblNewLabel_3_5 = new JLabel("Revenue");
        lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_3_5.setBounds(10, 0, 140, 26);
        revenuePanel.add(lblNewLabel_3_5);
        
        JButton btnNewButton_4 = new JButton("133,903");
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_4.setBackground(new Color(68, 147, 151));
        btnNewButton_4.setBounds(43, 37, 107, 23);
        revenuePanel.add(btnNewButton_4);
        
        JLabel lblNewLabel_1_1_4 = new JLabel(" * For the Last 30 Days");
        lblNewLabel_1_1_4.setBounds(43, 82, 155, 28);
        revenuePanel.add(lblNewLabel_1_1_4);
        
        JPanel refundsPanel = new JPanel();
        refundsPanel.setBackground(new Color(144, 209, 200));
        refundsPanel.setBounds(286, 292, 190, 110);
        panel.add(refundsPanel);
        refundsPanel.setLayout(null);
        
        JLabel lblNewLabel_3_3_1 = new JLabel("Refunds");
        lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_3_3_1.setBounds(10, 0, 140, 26);
        refundsPanel.add(lblNewLabel_3_3_1);
        
        JButton btnNewButton_5 = new JButton("17");
        btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_5.setBackground(new Color(68, 147, 151));
        btnNewButton_5.setBounds(47, 37, 103, 23);
        refundsPanel.add(btnNewButton_5);
        
        JLabel lblNewLabel_1_1_2 = new JLabel(" * For the Last 30 Days");
        lblNewLabel_1_1_2.setBounds(47, 82, 154, 28);
        refundsPanel.add(lblNewLabel_1_1_2);
        
        JPanel downPanel = new JPanel();
        downPanel.setBackground(Color.decode("#7CC0CF"));
        downPanel.setBounds(10, 408, 864, 22);
        contentPane.add(downPanel);
    }
}
