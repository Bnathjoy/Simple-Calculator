import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField textField;
	
	     double first;
		double second;
		double result;
		String operation;
		String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLUE);
		frame.getContentPane().setBackground(new Color(51, 102, 255));
		frame.setBounds(100, 100, 308, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ON");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 125, 61, 56);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBackground(Color.LIGHT_GRAY);
		btnC.setBounds(81, 125, 61, 56);
		frame.getContentPane().add(btnC);
		
		JButton btnNewButton_2 = new JButton("00");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText()+btnNewButton_2.getText();
				textField.setText(n);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setBounds(152, 125, 61, 56);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setBounds(223, 125, 61, 56);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText()+btnNewButton_4.getText();
				textField.setText(n);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_4.setBounds(10, 191, 61, 56);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText()+btnNewButton_5.getText();
				textField.setText(n);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton_5.setBounds(81, 191, 61, 56);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText()+btnNewButton_6.getText();
				textField.setText(n);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton_6.setBounds(152, 191, 61, 56);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton_7.setBounds(223, 190, 61, 56);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("4");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText()+btnNewButton_8.getText();
				textField.setText(n);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton_8.setBounds(10, 257, 61, 56);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("5");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText()+btnNewButton_9.getText();
				textField.setText(n);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton_9.setBounds(81, 257, 61, 56);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("6");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText()+btnNewButton_10.getText();
				textField.setText(n);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton_10.setBounds(152, 257, 61, 56);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnX = new JButton("*");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnX.setBackground(Color.LIGHT_GRAY);
		btnX.setBounds(223, 257, 61, 56);
		frame.getContentPane().add(btnX);
		
		JButton btnNewButton_12 = new JButton("1");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText()+btnNewButton_12.getText();
				textField.setText(n);
				
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton_12.setBounds(10, 323, 61, 56);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("2");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText()+btnNewButton_13.getText();
				textField.setText(n);
				
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_13.setBackground(Color.LIGHT_GRAY);
		btnNewButton_13.setBounds(81, 323, 61, 56);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("3");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText()+btnNewButton_14.getText();
				textField.setText(n);
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_14.setBackground(Color.LIGHT_GRAY);
		btnNewButton_14.setBounds(152, 323, 61, 56);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_15.setBackground(Color.LIGHT_GRAY);
		btnNewButton_15.setBounds(223, 323, 61, 56);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("0");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText()+btnNewButton_16.getText();
				textField.setText(n);
			
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_16.setBackground(Color.LIGHT_GRAY);
		btnNewButton_16.setBounds(10, 387, 61, 56);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton(".");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textField.getText()+btnNewButton_17.getText();
				textField.setText(n);
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_17.setBackground(Color.LIGHT_GRAY);
		btnNewButton_17.setBounds(81, 389, 61, 56);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("=");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
				   result=first+second;
				   answer=String.format("%.2f", result);
				   textField.setText(answer);
				}
				
				else if(operation=="-")
				{
					   result=first-second;
					   answer=String.format("%.2f", result);
					   textField.setText(answer);
				}
				
				else if(operation=="*")
				{
					   result=first*second;
					   answer=String.format("%.2f", result);
					   textField.setText(answer);
				}
				
				else if(operation=="/")
				{
					   result=first/second;
					   answer=String.format("%.2f", result);
					   textField.setText(answer);
				}
				
				else if(operation=="%")
				{
					   result=first%second;
					   answer=String.format("%.2f", result);
					   textField.setText(answer);
				}

			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_18.setBackground(Color.LIGHT_GRAY);
		btnNewButton_18.setBounds(152, 389, 61, 56);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("%");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_19.setBackground(Color.LIGHT_GRAY);
		btnNewButton_19.setBounds(223, 389, 61, 56);
		frame.getContentPane().add(btnNewButton_19);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.DARK_GRAY);
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setBounds(10, 22, 276, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
