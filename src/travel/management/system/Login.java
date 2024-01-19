/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

import javax.swing.*; 
import java.awt.*; 
import javax.swing.border.*; 

public class Login extends JFrame {
    Login(){
        setSize(900,400); 
        setLocation(350, 200); 
        setLayout(null); 
        
        getContentPane().setBackground(Color.WHITE); 
        
        JPanel pl = new JPanel(); 
        pl.setBounds(0, 0, 400, 400);
        pl.setBackground(new Color(131, 193, 233));  
        pl.setLayout(null);
        add(pl); 
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT); 
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3); 
        image.setBounds(100, 120, 200, 200); 
        pl.add(image); 
        
        JPanel p2 = new JPanel(); 
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 300);
        add(p2); 
        
        JLabel lblusername = new JLabel("Username"); 
        lblusername.setBounds(60, 20, 100, 25); 
        lblusername.setFont(new Font("SAN SERIF", Font.PLAIN, 20)); 
        p2.add(lblusername); 
        
        JTextField txtusername = new JTextField(); 
        txtusername.setBounds(60, 60, 300, 30); 
        txtusername.setBorder(BorderFactory.createEmptyBorder()); 
        p2.add(txtusername);
        
        JLabel password = new JLabel("Password"); 
        password.setBounds(60, 110, 100, 25); 
        password.setFont(new Font("SAN SERIF", Font.PLAIN, 20)); 
        p2.add(password); 
        
        JTextField txtpassword = new JTextField(); 
        txtpassword.setBounds(60, 150, 300, 30); 
        txtpassword.setBorder(BorderFactory.createEmptyBorder()); 
        p2.add(txtpassword);
        
        JButton login = new JButton("Login"); 
        login.setBounds(60, 200, 130, 30); 
        login.setBackground(new Color (133, 193, 233));
        login.setForeground(Color.WHITE); 
        login.setBorder(new LineBorder(new Color(133, 193, 233)));
        p2.add(login);
        
        JButton signup = new JButton("Sign Up"); 
        signup.setBounds(230, 200, 130, 30); 
        signup.setBackground(new Color (133, 193, 233));
        signup.setForeground(Color.WHITE); 
        signup.setBorder(new LineBorder(new Color(133, 193, 233)));
        p2.add(signup);
        
        JButton forgotPassword = new JButton("Forgot Password"); 
        forgotPassword.setBounds(130, 250, 130, 30); 
        forgotPassword.setBackground(new Color (133, 193, 233));
        forgotPassword.setForeground(Color.WHITE); 
        forgotPassword.setBorder(new LineBorder(new Color(133, 193, 233)));
        p2.add(forgotPassword);
        
        JLabel l5 = new JLabel("Trouble with Login?");
	l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
	l5.setForeground(new Color(255, 0, 0));
	l5.setBounds(300, 250, 150, 20);
	p2.add(l5);
        
        setVisible(true); 
    }
    
    public static void main(String args[]){
        Login l = new Login(); 
    
    }
    
}
