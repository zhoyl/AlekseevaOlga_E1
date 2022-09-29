import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmColorForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmColorForm frame = new frmColorForm();
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
	public frmColorForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblNameColor = new JLabel("");
		lblNameColor.setBounds(25, 90, 145, 23); 
		contentPane.add(lblNameColor);
		
		JButton btnChangeColor = new JButton("Изменить цвет формы");
		btnChangeColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contentPane.getBackground() == Color.RED){ 
					contentPane.setBackground(Color.GREEN); 
					lblNameColor.setText("Зеленый"); 
				}
				else{
					contentPane.setBackground(Color.RED); 
					lblNameColor.setText("Красный"); 
				}
			}
		});
		btnChangeColor.setBounds(79, 121, 205, 23);
		contentPane.add(btnChangeColor);
		
		
	}
}
