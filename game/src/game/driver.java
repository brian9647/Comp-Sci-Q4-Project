package game;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class driver {

	public static void main(String[] args) {
			//size of jframe
			int sw 	= 1700; //width
			int sh 	= 950; //height
			//size of map
			int mw = 4000; 
			int mh = 4000;
	
			public void paint(Graphics g) {
				super.paintComponent(g);
				g.drawOval(ball.get(x), ball.get(y), ball.get(width), ball.get(width));
				
	}
			public void update() {
				
			}
			public static void keyPressed() {
				/*
				 * if(e.getKeyCode()==40){ //up arrow pVy=-5; }else if(e.getKeyCode()==38){
				 * //down arrow pVy=5; } if(e.getKeyCode()==39){ //left key pVx=-5; }else
				 * if(e.getKeyCode()==37){ //right key pVx=5; }
				 */
				if (e.getKeyCode() == 32) { // press space to halve the size
					w = w / 2;
				}
			}

			@Override
			public void keyReleased() {
				// TODO Auto-generated method stub
				
				  if(e.getKeyCode()==40){ //up key pVy=0; }else if(e.getKeyCode()==38){ //down
				  key pVy=0; } if(e.getKeyCode()==39){ //left key pVx=0; }else
				 if(e.getKeyCode()==37){ //right key pVx=0; }
				 
				if (e.getKeyCode() == 32) { // release space to stop halving
					
				}
			}
				  }
			}
	}
}
