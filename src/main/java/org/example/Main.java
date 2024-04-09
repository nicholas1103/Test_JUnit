package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
      function_login login = new function_login();
      login.Login();
    }
}