package com.jgaming.begun;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
	
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 576);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.add(new Map());
		frame.setVisible(true);

	}

}
