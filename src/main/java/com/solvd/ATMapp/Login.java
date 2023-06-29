package com.solvd.ATMapp;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

	Login() {
		setTitle("AUTOMATED TELLER MACHINE");
		ImageIcon I1 = new ImageIcon();
		
		setSize(800, 480);
		setVisible(true);
		setLocation(350,200);
	}

	public static void main(String[] args) {
		new Login();

	}
}