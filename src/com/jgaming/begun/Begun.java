package com.jgaming.begun;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Begun {

	Image img = new ImageIcon("res/begun.gif").getImage();
	int speed = 5;
	int map_layer1 = 0;
	int map_layer2 = 1000;
	int distance = 0;

	public void move() {
		if (map_layer2 - speed <= 0) {
			map_layer1 = 0;
			map_layer2 = 1000;

		} else {
			if (-map_layer1 == -map_layer1 / 50 || map_layer2 == map_layer2 / 20) {
				distance += speed / 3;
			}
			map_layer1 -= speed;
			map_layer2 -= speed;
		}

	}

}
