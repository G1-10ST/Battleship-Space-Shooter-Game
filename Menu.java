package com.BattleshipGame.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Menu {
	private BufferedImage title;
	private Rectangle playButton=new Rectangle(Game.WIDTH/2 +75, 200,150,50);
	private Rectangle helpButton=new Rectangle(Game.WIDTH/2 +75, 250,150,50);
	private Rectangle aboutButton=new Rectangle(Game.WIDTH/2 +75, 300,150,50);
	private Rectangle quitButton=new Rectangle(Game.WIDTH/2 +75, 350,150,50);
	public Menu(BufferedImage title)
	{
		this.title=title;
	}
public void render(Graphics g) {
	g.drawImage(title, 50, 50,500,150,null);
	Font fnt0=new Font("arial",Font.BOLD,35);
	
	Graphics2D g2d= (Graphics2D)g;
	g.setFont(fnt0);
	g.setColor(Color.LIGHT_GRAY);
	g.drawString("PLAY", playButton.x+9, playButton.y+40);
	g2d.draw(playButton);
	g.drawString("HELP", helpButton.x+9, helpButton.y+40);
	g2d.draw(helpButton);
	g.drawString("ABOUT", aboutButton.x+9, aboutButton.y+40);
	g2d.draw(aboutButton);
	g.drawString("QUIT", quitButton.x+9, quitButton.y+40);
	g2d.draw(quitButton);
}
}
