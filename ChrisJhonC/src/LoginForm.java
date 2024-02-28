import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField usernameField;
    private JPasswordField passwordField;

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";
    private static final String USER_USERNAME = "user";
    private static final String USER_PASSWORD = "user123";

    public LoginForm() {
        setTitle("Login Form");
        setSize(650, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.decode("#449397"));

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        usernameLabel.setBounds(359, 170, 80, 25);

        usernameField = new JTextField();
        usernameField.setBounds(439, 170, 160, 25);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        passwordLabel.setBounds(359, 206, 80, 25);

        passwordField = new JPasswordField();
        passwordField.setBounds(439, 206, 160, 25);

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.decode("#7CC0CF"));
        loginButton.setBounds(519, 254, 80, 25);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        container.add(usernameLabel);
        container.add(usernameField);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(loginButton);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(2, 134, 128));
        panel_1.setBounds(10, 143, 339, 154);
        getContentPane().add(panel_1);
        
        JLabel lblNewLabel_4 = new JLabel("CJ Techs Find brings you a carefully");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4.setBounds(10, 11, 319, 19);
        panel_1.add(lblNewLabel_4);
        
        JLabel lblNewLabel_4_1 = new JLabel(" curated selection of top-notch ");
        lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_1.setBounds(10, 29, 319, 19);
        panel_1.add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_4_2 = new JLabel("computer accessories. Explore our ");
        lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_2.setBounds(10, 43, 319, 19);
        panel_1.add(lblNewLabel_4_2);
        
        JLabel lblNewLabel_4_3 = new JLabel("collection for sleek gadgets and innovative ");
        lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_3.setBounds(10, 59, 319, 19);
        panel_1.add(lblNewLabel_4_3);
        
        JLabel lblNewLabel_4_4 = new JLabel("digital experience. Discover quality, functionality, ");
        lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_4.setBounds(10, 89, 319, 19);
        panel_1.add(lblNewLabel_4_4);
        
        JLabel lblNewLabel_4_5 = new JLabel("peripherals, ensuring a seamless and enhanced");
        lblNewLabel_4_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_5.setBounds(10, 73, 319, 19);
        panel_1.add(lblNewLabel_4_5);
        
        JLabel lblNewLabel_4_6 = new JLabel("and the latest tech trends, all in one place, ");
        lblNewLabel_4_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_6.setBounds(10, 103, 319, 19);
        panel_1.add(lblNewLabel_4_6);
        
        JLabel lblNewLabel_4_7 = new JLabel("designed to elevate your computing journey.");
        lblNewLabel_4_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4_7.setBounds(10, 119, 319, 19);
        panel_1.add(lblNewLabel_4_7);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#7CC0CF"));
        panel.setBounds(10, 11, 614, 38);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("WELCOME BACK");
        lblNewLabel.setBounds(140, 0, 150, 38);
        panel.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        JLabel lblNewLabel_1 = new JLabel("TO");
        lblNewLabel_1.setBounds(300, 7, 46, 25);
        panel.add(lblNewLabel_1);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        JLabel lblNewLabel_3 = new JLabel("CJ's Tech Finds");
        lblNewLabel_3.setBounds(356, 0, 177, 38);
        panel.add(lblNewLabel_3);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        JLabel lblNewLabel_5 = new JLabel("LOGIN");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_5.setBounds(489, 125, 69, 30);
        getContentPane().add(lblNewLabel_5);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.decode("#7CC0CF"));
        panel_2.setBounds(10, 108, 339, 59);
        getContentPane().add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("CJ's Tech Finds");
        lblNewLabel_2.setBounds(71, 0, 191, 31);
        panel_2.add(lblNewLabel_2);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
    }

    private void login() {
        String username = usernameField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            new AdminScreen().setVisible(true);
            this.dispose();
        } else if (username.equals(USER_USERNAME) && password.equals(USER_PASSWORD)) {
            new CustomerDashboard().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}
