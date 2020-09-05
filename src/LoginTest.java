package miniProject1;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginTest extends JFrame implements ActionListener {
	

    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    private final JLabel lblNewLabel = new JLabel("Login Page");


    LoginTest() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
        userLabel.setBounds(164, 150, 150, 39);
        passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
        passwordLabel.setBounds(163, 220, 194, 30);
        userTextField.setBounds(433, 150, 150, 30);
        passwordField.setBounds(433, 220, 150, 30);
        showPassword.setBounds(433, 259, 150, 30);
        loginButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        loginButton.setBounds(231, 341, 143, 45);
        resetButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        resetButton.setBounds(433, 341, 131, 45);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
        lblNewLabel.setBounds(331, 33, 131, 70);
        
        getContentPane().add(lblNewLabel);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("mehul") && pwdText.equalsIgnoreCase("328")) {
                JOptionPane.showMessageDialog(null, "Login Successful");
                //frame.dispose();
                //new <next frame name>
            } 
            else if (userText.equalsIgnoreCase("mehul") && pwdText.equalsIgnoreCase("328")) {
                JOptionPane.showMessageDialog(null, "Login Successful");
                //frame.dispose();
                //new <next frame name>
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }


        }
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }



    public static void main(String[] a) {
        LoginTest frame = new LoginTest();
        frame.setTitle("Login");
        frame.setVisible(true);
        frame.setBounds(10, 10, 832, 551);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(false);

    }

}
