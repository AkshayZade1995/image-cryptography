package core;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
public class GetStarted extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
//	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GetStarted frame = new GetStarted();
					frame.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public GetStarted() {
		initialize();
	}
	
	/**
	 * Create the frame.
	 */
	private void initialize() {
		setResizable(false);
		setTitle("Image Cryptography");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Nishant\\Desktop\\steal-private-keys-from-PC.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JButton btnNewButton = new JButton("Get Started");
		btnNewButton.setBounds(253, 319, 196, 36);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("button Clicked");
				Main second = new Main();
				second.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setBackground(UIManager.getColor("Button.light"));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Lucida Handwriting", Font.BOLD, 11));
		contentPane.add(btnNewButton);
		JButton btnTutorial = new JButton("About Us");
		btnTutorial.setBounds(556, 369, 118, 31);
		btnTutorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
 				TutorialShow tutorial = new TutorialShow();
 				tutorial.setVisible(true);
 				dispose();
			}
		});
		btnTutorial.setForeground(Color.BLACK);
		btnTutorial.setFont(new Font("Lucida Handwriting", Font.BOLD, 11));
		btnTutorial.setBackground(UIManager.getColor("Button.light"));
		contentPane.add(btnTutorial);
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(308, 25, 92, 36);
		lblAbout.setForeground(Color.WHITE);
		lblAbout.setFont(new Font("Stencil", Font.ITALIC, 24));
		contentPane.add(lblAbout);
		
		JLabel lblWelcomeToFile = new JLabel("Welcome to File Encryption & Decryption Software.");
		lblWelcomeToFile.setBounds(10, 104, 674, 23);
		lblWelcomeToFile.setForeground(Color.WHITE);
		lblWelcomeToFile.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 12));
		lblWelcomeToFile.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToFile.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblWelcomeToFile);
		JLabel lblDoYouWish = new JLabel("Do you wish to convert your image to a form in which other cannot access it ?");
		lblDoYouWish.setBounds(20, 140, 654, 23);
		lblDoYouWish.setForeground(Color.WHITE);
		lblDoYouWish.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 12));
		lblDoYouWish.setVerticalAlignment(SwingConstants.TOP);
		lblDoYouWish.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDoYouWish);
		JLabel lblIfYourAnswer = new JLabel("If your answer to above question is  \"YES\" then this software is definitely for you.");
		lblIfYourAnswer.setBounds(30, 174, 654, 23);
		lblIfYourAnswer.setForeground(Color.WHITE);
		lblIfYourAnswer.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 12));
		lblIfYourAnswer.setVerticalAlignment(SwingConstants.TOP);
		lblIfYourAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblIfYourAnswer);
		
		JLabel lblIfencryptionIs = new JLabel("If  \"Encryption\" is the option you select , it takes the image to encrypt.\r\n");
		lblIfencryptionIs.setBounds(30, 215, 654, 23);
		lblIfencryptionIs.setForeground(Color.WHITE);
		lblIfencryptionIs.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 12));
		lblIfencryptionIs.setVerticalAlignment(SwingConstants.TOP);
		lblIfencryptionIs.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblIfencryptionIs);
		JLabel lblIfYouWant = new JLabel("If you want to \"Decrypt\" your image back to original form select \"Decryption\".\r\n");
		lblIfYouWant.setBounds(30, 252, 654, 23);
		lblIfYouWant.setForeground(Color.WHITE);
		lblIfYouWant.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 12));
		lblIfYouWant.setVerticalAlignment(SwingConstants.TOP);
		lblIfYouWant.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblIfYouWant);
		JLabel label = new JLabel("");
		label.setBackground(UIManager.getColor("Button.light"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\Nishant\\Desktop\\steal-private-keys-from-PC.jpg"));
		label.setBounds(0, 0, 694, 421);
		contentPane.add(label);
	}
	
}

