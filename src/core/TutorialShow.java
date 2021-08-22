package core;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
//import com.sun.org.apache.xerces.internal.util.URI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
public class TutorialShow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TutorialShow frame = new TutorialShow();
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
	public TutorialShow() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 0, 0);
		contentPane.add(label);
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 0, 0);
		contentPane.add(lblNewLabel_1);
		JButton btnNewButton = new JButton("Facebook Page");
		btnNewButton.setBounds(38, 280, 128, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Desktop d = Desktop.getDesktop();
				try {
					d.browse(new URI ("https://m.facebook.com/You-Have-Been-Hacked-779880015383980/"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		contentPane.add(btnNewButton);
		JLabel lblContactUsOn = new JLabel("Contact Us On Facebook");
		lblContactUsOn.setBounds(38, 246, 155, 23);
		lblContactUsOn.setForeground(new Color(255, 255, 255));
		contentPane.add(lblContactUsOn);
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(266, 334, 115, 38);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GetStarted back = new GetStarted();
				back.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnBack);
		JLabel lblContactDetails = new JLabel("ABOUT US");
		lblContactDetails.setForeground(Color.WHITE);
		lblContactDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContactDetails.setBounds(281, 11, 155, 23);
		contentPane.add(lblContactDetails);
		JLabel lblS = new JLabel("Student of \"Sardar Patel Institute of Technology\"");
		lblS.setForeground(Color.WHITE);
		lblS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblS.setBounds(38, 56, 418, 23);
		contentPane.add(lblS);
		JLabel lblFirstYearMaster = new JLabel("First Year Master Of Compter Application");
		lblFirstYearMaster.setForeground(Color.WHITE);
		lblFirstYearMaster.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFirstYearMaster.setBounds(38, 90, 418, 23);
		contentPane.add(lblFirstYearMaster);
		
		JLabel lblAkshayNZade = new JLabel("Name : Akshay N Zade ( 2017450060)\r\n");

		lblAkshayNZade.setForeground(Color.WHITE);
		lblAkshayNZade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAkshayNZade.setBounds(38, 158, 418, 23);
		contentPane.add(lblAkshayNZade);

		JLabel lblNameVinod = new JLabel("Name : Vinod Mandloi ( 2017450025)");
		lblNameVinod.setForeground(Color.WHITE);
		lblNameVinod.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNameVinod.setBounds(38, 192, 418, 23);
		contentPane.add(lblNameVinod);
		JLabel lblUnderTheGuidance = new JLabel("Under the Guidance of, Sir Rupesh Bhoir");

		lblUnderTheGuidance.setForeground(Color.WHITE);
		lblUnderTheGuidance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUnderTheGuidance.setBounds(38, 124, 418, 23);
		contentPane.add(lblUnderTheGuidance);
		JLabel lblNewLabel = new JLabel("");

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\123\\workspace\\Cry\\src\\steal-private-keys-from-PC.jpg"));

		lblNewLabel.setBounds(0, 0, 694, 421);
		contentPane.add(lblNewLabel);
	}
}

