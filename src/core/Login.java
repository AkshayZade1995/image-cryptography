package core;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Login {
	private JFrame frame;
	private JTextField textUsername;
	private JPasswordField txtPassword;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					System.out.println(1);
					window.frame.setVisible(true);
					
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		/**
		 * Create the application.
		 */
		public Login() {
			initialize();
		}
		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setResizable(false);
			frame.setBounds(100, 100, 701, 451);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			frame.setTitle("Image Cryptography");
			JLabel lblCryptography = new JLabel("cRYpTOGrAPhY");
			lblCryptography.setBounds(226, 49, 277, 41);
			lblCryptography.setForeground(new Color(255, 255, 255));
			lblCryptography.setFont(new Font("Lucida Console", Font.BOLD, 32));
			frame.getContentPane().add(lblCryptography);
			JLabel lblFymcaMiniProject = new JLabel("");
			lblFymcaMiniProject.setBounds(20, 362, 325, 41);
			lblFymcaMiniProject.setForeground(new Color(255, 255, 255));
			lblFymcaMiniProject.setFont(new Font("Lucida Console", Font.BOLD, 21));
			frame.getContentPane().add(lblFymcaMiniProject);
			JButton btnReset = new JButton("RESET");
			btnReset.setBounds(262, 288, 200, 23);
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textUsername.setText(null);
					txtPassword.setText(null);
				}
			});
			frame.getContentPane().add(btnReset);
			
			JButton btnContactInfo = new JButton("Contact");
			btnContactInfo.setBounds(578, 369, 93, 30);
			btnContactInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null,"NISHANT ZADE    : 7021334418");
				}
			});
			frame.getContentPane().add(btnContactInfo);
			JButton btnLogin = new JButton("Authenticate");
			btnLogin.setBounds(262, 228, 200, 23);
			btnLogin.addActionListener(new ActionListener() {
				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent arg0) {
					String uname=textUsername.getText();
					String pad=txtPassword.getText();
						if (uname.equals("Admin") && pad.equals("pass123") )
						{
							JOptionPane.showMessageDialog(frame, "You are login");
							GetStarted firstpage = new GetStarted();
							firstpage.setVisible(true);
							frame.setVisible(false);
							
						}
						else
						{
							JOptionPane.showMessageDialog(frame, "Wrong Login");
							dispose();
						}
				}
			});
			frame.getContentPane().add(btnLogin);
			
			textUsername = new JTextField();
			textUsername.setBounds(261, 118, 201, 20);
			frame.getContentPane().add(textUsername);
			textUsername.setColumns(10);
			JLabel lblUsername = new JLabel("UserName :");
			lblUsername.setBounds(41, 105, 153, 37);
			lblUsername.setForeground(new Color(255, 255, 255));
			lblUsername.setFont(new Font("Britannic Bold", lblUsername.getFont().getStyle(), 26));
			frame.getContentPane().add(lblUsername);
			JLabel lblPassword = new JLabel("Password  :");
			lblPassword.setBounds(41, 155, 169, 33);
			lblPassword.setForeground(new Color(255, 255, 255));
			lblPassword.setFont(new Font("Britannic Bold", lblPassword.getFont().getStyle(), 26));
			frame.getContentPane().add(lblPassword);
			
			txtPassword = new JPasswordField();
			txtPassword.setBounds(262, 166, 200, 20);
			frame.getContentPane().add(txtPassword);
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Nishant\\Desktop\\steal-private-keys-from-PC.jpg"));
			lblNewLabel_1.setBounds(0, 0, 695, 422);
			frame.getContentPane().add(lblNewLabel_1);
		}
		protected void dispose() {
			// TODO Auto-generated method stub
			
		}
	}
