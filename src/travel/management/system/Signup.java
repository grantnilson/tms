/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

import javax.swing.*; 
import java.awt.*; 

public class Signup extends JFrame {
    
    Signup() {
        setBounds(350, 200, 900, 360);
        getContentPane().setBackground(Color.WHITE); 
        setLayout(null); 
        
        JPanel pl = new JPanel(); 
        pl.setBounds(0, 0, 500, 400);
        pl.setBackground(new Color(133, 193, 233));  
        pl.setLayout(null);
        add(pl); 
        
        JLabel lblUsername = new JLabel("Username :");
	lblUsername.setForeground(Color.DARK_GRAY);
	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblUsername.setBounds(99, 86, 92, 26);
	pl.add(lblUsername);

	JLabel lblName = new JLabel("Name :");
	lblName.setForeground(Color.DARK_GRAY);
	lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblName.setBounds(99, 123, 92, 26);
	pl.add(lblName);

	JLabel lblPassword = new JLabel("Password :");
	lblPassword.setForeground(Color.DARK_GRAY);
	lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblPassword.setBounds(99, 160, 92, 26);
	pl.add(lblPassword);

	JLabel lblAnswer = new JLabel("Answer :");
	lblAnswer.setForeground(Color.DARK_GRAY);
	lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAnswer.setBounds(99, 234, 92, 26);
	pl.add(lblAnswer);
        
        
        Choice security = new Choice(); 
        security.add("First Cat?");
        security.add("GF Name?"); 
        security.add("Your Lucky Number?");
        security.add("Home Address?");
        
        
        JLabel lblSecurityQuestion = new JLabel("Security Question :");
	lblSecurityQuestion.setForeground(Color.DARK_GRAY);
	lblSecurityQuestion.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblSecurityQuestion.setBounds(99, 197, 140, 26);
	pl.add(lblSecurityQuestion);
        
        JButton b1 = new JButton("Create");
	b1.setFont(new Font("Tahoma", Font.BOLD, 13));
	b1.setBounds(140, 289, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	pl.add(b1);

	JButton b2 = new JButton("Back");
	b2.setFont(new Font("Tahoma", Font.BOLD, 13));
	b2.setBounds(300, 289, 100, 30);
	b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	pl.add(b2);
        
        JTextField textField = new JTextField();
	textField.setBounds(265, 91, 148, 20);
	pl.add(textField);
	textField.setColumns(10);

	JTextField textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(265, 128, 148, 20);
	pl.add(textField_1);

        JTextField textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(265, 165, 148, 20);
	pl.add(textField_2);

	JTextField textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(265, 239, 148, 20);
	pl.add(textField_3);
        
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i1 = c1.getImage().getScaledInstance(300, 200,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);

        JLabel l6 = new JLabel(i2);
        l6.setBounds(460, 70, 200, 200);
        add(l6);
        
        setVisible(true); 
        
    }; 
    
    public static void main (String[] args) {
        new Signup(); 
    }
    
    
}
