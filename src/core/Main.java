package core;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
public class Main extends JFrame {
	static int count = 1;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField file_path;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Create the frame.
	 */
	private void initialize() {
		setResizable(false);
		setTitle("Image Cryptography");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JButton btnNewButton_2 = new JButton("Decryption");
		btnNewButton_2.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnNewButton_2.setForeground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(351, 235, 198, 37);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					FileInputStream file=new FileInputStream(file_path.getText());
					FileOutputStream outStream=new FileOutputStream("C:\\Users\\Nishant\\Desktop\\Decrypt.jpg");
					byte k[]="mkey1024".getBytes();
					SecretKeySpec key = new SecretKeySpec(k, "DES");
					Cipher enc = Cipher.getInstance("DES");
					enc.init(Cipher.DECRYPT_MODE,key);
					CipherOutputStream cos= new CipherOutputStream(outStream,enc);
					byte[] buf= new byte[1024];
					int read;
					while((read=file.read(buf))!=-1)
					{
						cos.write(buf,0,read);
					}
					file.close();
					outStream.flush();
					cos.close();
					JOptionPane.showMessageDialog(null, "The File is Decrypted Sucessfully");
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_2);
		JButton btnNewButton_1 = new JButton("Encryption");
		btnNewButton_1.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(109, 235, 180, 37);
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					FileInputStream file=new FileInputStream(file_path.getText());
					
					FileOutputStream outStream=new FileOutputStream("C:\\Users\\Nishant\\Desktop\\Encrypt" + count + ".jpg");
					count++;
					byte k[]="mkey1024".getBytes();
					SecretKeySpec key = new SecretKeySpec(k, "DES");
					Cipher enc = Cipher.getInstance("DES");
					enc.init(Cipher.ENCRYPT_MODE,key);
					CipherOutputStream cos= new CipherOutputStream(outStream,enc);
					byte[] buf= new byte[1024];
					int read;
					while((read=file.read(buf))!=-1)
					{
						cos.write(buf,0,read);
					}
					file.close();
					outStream.flush();
					cos.close();
					JOptionPane.showMessageDialog(null, "The File is Encrypted Sucessfully");
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
		contentPane.add(btnNewButton_1);
		JButton btnNewButton = new JButton("Choose");
		btnNewButton.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(351, 176, 198, 37);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f= chooser.getSelectedFile();
				file_path.setText(f.getAbsolutePath());
			}
		});
		contentPane.add(btnNewButton);
		
		file_path = new JTextField();
		file_path.setBounds(109, 176, 180, 36);
		file_path.setColumns(10);
		contentPane.add(file_path);
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnBack.setForeground(Color.DARK_GRAY);
		btnBack.setBounds(251, 331, 177, 37);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GetStarted backstart = new GetStarted();
				backstart.setVisible(true);
			}
		});
		contentPane.add(btnBack);
		JLabel label = new JLabel("");
		label.setFont(new Font("DialogInput", Font.BOLD, 12));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\Nishant\\Desktop\\steal-private-keys-from-PC.jpg"));
		label.setBounds(0, 0, 695, 422);
		contentPane.add(label);
	}
}
