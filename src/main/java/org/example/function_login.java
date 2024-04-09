package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class function_login {

    public void Login() {
        JFrame frame = new JFrame("Dang Nhap ");
        int frameWidth = 700, frameHeight = 500;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frameWidth, frameHeight);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frameWidth) / 2;
        int y = (screenSize.height - frameHeight) / 2;
        frame.setLocation(x, y);
        JPanel LoginPanel = new JPanel(new GridBagLayout()); // trang đầu
        GridBagConstraints LoginContraint = new GridBagConstraints();
        // Make color for BackGround
        Color Logincolor = new Color(66, 227, 245);
        Color textchecked = new Color(0, 159, 253, 247);
        Color fieldunfill = new Color(236, 224, 172, 208);
        Color fieldfill = new Color(255, 255, 255);
        Color correct = new Color(0, 124, 0);
        LoginPanel.setBackground(Logincolor);
        //LoginPanel
        JLabel labelSinginLogo = new JLabel("Đăng Nhập");
        labelSinginLogo.setFont(new Font("Times New Roman", Font.ITALIC, 26));
        //Login Field:
        JLabel userlogin = new JLabel("Tên Đăng Nhập: ");
        JTextField text_userlogin = new JTextField(20);
        JLabel passLogin = new JLabel("Mật khẩu:");
        JTextField text_passLogin = new JPasswordField(20);
        JButton Logindangnhap = new JButton("Đăng nhập");
        // Login Panel
        LoginContraint.gridx = 1;
        LoginContraint.gridy = 1;
        LoginContraint.anchor = GridBagConstraints.CENTER;
        LoginPanel.add(labelSinginLogo, LoginContraint); // title Dang nhap
        LoginContraint.gridx = 0;
        LoginContraint.gridy = 2;
        LoginContraint.anchor = GridBagConstraints.CENTER;
        LoginPanel.add(userlogin, LoginContraint); // label user Dang nhap
        LoginContraint.gridx = 1;
        LoginContraint.gridy = 2;
        LoginContraint.anchor = GridBagConstraints.CENTER;
        LoginPanel.add(text_userlogin, LoginContraint); // field user Dang nhap
        LoginContraint.gridx = 0;
        LoginContraint.gridy = 3;
        LoginContraint.anchor = GridBagConstraints.CENTER;
        LoginPanel.add(passLogin, LoginContraint); // label password
        LoginContraint.gridx = 1;
        LoginContraint.gridy = 3;
        LoginContraint.anchor = GridBagConstraints.CENTER;
        LoginPanel.add(text_passLogin, LoginContraint); // field password
        LoginContraint.gridx = 1;
        LoginContraint.gridy = 4;
        LoginContraint.anchor = GridBagConstraints.CENTER;
        LoginPanel.add(Logindangnhap, LoginContraint); // Button Login
        LoginPanel.setVisible(true);
        frame.add(LoginPanel);
        frame.setVisible(true);
        //ActionListener and KeyListener of Login
        text_userlogin.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    Logindangnhap.requestFocus();
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    text_passLogin.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Logindangnhap.doClick();
                } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.exit(0);
                }
            }
        });
        text_passLogin.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    text_userlogin.requestFocus();
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    Logindangnhap.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Logindangnhap.doClick();
                } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.exit(0);
                }
            }
        });
        Logindangnhap.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    text_passLogin.requestFocus();
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    text_userlogin.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Logindangnhap.doClick();
                } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.exit(0);
                }
            }
        });
    }
}
