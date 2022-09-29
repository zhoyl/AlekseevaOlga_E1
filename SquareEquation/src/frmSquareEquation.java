import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmSquareEquation extends JFrame {

	private JPanel ControlPanel;
	private JTextField txt_a;
	private JTextField txt_b;
	private JTextField txt_c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSquareEquation frame = new frmSquareEquation();
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
	public frmSquareEquation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ControlPanel = new JPanel();
		ControlPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ControlPanel);
		ControlPanel.setLayout(null);
		

		final JLabel lblSolution = new JLabel("");
		lblSolution.setBounds(10, 179, 371, 36);
		ControlPanel.add(lblSolution);
		
		JLabel lbl_a = new JLabel("x2 + ");
		lbl_a.setBounds(136, 52, 34, 14);
		ControlPanel.add(lbl_a);
		
		JButton btnSolve = new JButton("Решить уравнение");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a, b, c; 
				try {
					a = Double.parseDouble(txt_a.getText()); 
				}
				catch(NumberFormatException nfe){ 
					a=0.0;
					txt_a.setText("0.0");
				}
				try {
					b = Double.parseDouble(txt_b.getText()); 
				}
				catch(NumberFormatException nfe){ 
					b=0.0;
					txt_b.setText("0.0");
				}
				try {
					c = Double.parseDouble(txt_c.getText()); 
				}
				catch(NumberFormatException nfe) {
					c=0.0;
					txt_c.setText("0.0");
				}
				double D = b * b - 4. * a * c; 
				double x1, x2; 
				String Sol = ""; 
				if(D < 0.0) 
					Sol = "Действительных корней нет"; 
				else if(D > 0. && a != 0.){ 
					x1 = (-b + Math.sqrt(D)) / (2. * a); 
					x2 = (-b - Math.sqrt(D)) / (2. * a); 
					Sol = "Корни: x1 = " + x1 + ", x2 = " + x2; 
				}
				else if(D > 0. && a != 0.){ 
					x1 = (-b + Math.sqrt(D)) / (2. * a); 
					x2 = (-b - Math.sqrt(D)) / (2. * a); 
					Sol = "Корни: x1 = " + x1 + ", x2 = " + x2; 
				}
				else if(D == 0.0 && a != 0.0){ 
					x1 = -b / (2. * a); 
					Sol = "Корень x = " + x1; 
				}
				else if(a == 0 && b != 0.){ 
					x1 = -c / b; 
					Sol = "Корень x = " + x1; 
				}
				lblSolution.setText(Sol); 
				}
		});
		btnSolve.setBounds(136, 108, 171, 23);
		ControlPanel.add(btnSolve);
		
		txt_a = new JTextField();
		txt_a.setBounds(40, 49, 86, 20);
		ControlPanel.add(txt_a);
		txt_a.setColumns(10);
		
		txt_b = new JTextField();
		txt_b.setColumns(10);
		txt_b.setBounds(164, 49, 86, 20);
		ControlPanel.add(txt_b);
		
		txt_c = new JTextField();
		txt_c.setColumns(10);
		txt_c.setBounds(282, 49, 86, 20);
		ControlPanel.add(txt_c);
		
		JLabel lbl_b = new JLabel("x + ");
		lbl_b.setBounds(257, 52, 34, 14);
		ControlPanel.add(lbl_b);
		
		JLabel lbl_c = new JLabel("= 0");
		lbl_c.setBounds(374, 52, 34, 14);
		ControlPanel.add(lbl_c);
		
		JLabel labebl = new JLabel("Решение");
		labebl.setFont(new Font("Tahoma", Font.BOLD, 15));
		labebl.setBounds(175, 147, 116, 14);
		ControlPanel.add(labebl);
		
		JLabel lblTAskName = new JLabel("Квадратное уравнение");
		lblTAskName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTAskName.setBounds(130, 11, 207, 30);
		ControlPanel.add(lblTAskName);
		
	}
}
