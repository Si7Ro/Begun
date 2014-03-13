package com.jgaming.begun;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


@SuppressWarnings("serial")
public class Map extends JPanel implements ActionListener {

	Font font = new Font("Arial", Font.BOLD, 25);
	
	Image img = new ImageIcon("res/bg.png").getImage();
	Begun pl = new Begun();
	Timer mainTimer = new Timer(20, this);
	public Map(){
		mainTimer.start();
		setFocusable(true);
	}
	public void paint(Graphics g){
		g = (Graphics2D) g;
		g.setFont(font);
		g.setColor(Color.BLUE);
		g.drawImage(img, pl.map_layer1, 0, null);
		g.drawImage(img, pl.map_layer2, 0, null);
		g.drawImage(pl.img, 200, 375, null);
		g.drawString("DISTANCE: " + pl.distance + " км", 10, 25);
		g.drawLine(220, 0, 220, 35);
		g.drawLine(0, 35, 220, 35);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		pl.move();
		repaint();
		
	}
	


}
