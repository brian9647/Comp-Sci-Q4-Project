package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.applet.Applet;

public class driver extends JPanel implements ActionListener, KeyListener, MouseListener, MouseMotionListener{

			//size of jframe
			int sw 	= 1700; //width
			int sh 	= 950; //height
	
			public void paint(Graphics g) {
				super.paintComponent(g);
				
		//		g.drawOval(getX(), (getY()), getWidth(), getWidth());
				
	}
			
//			public void update() {
//				


			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			public static void main(String[] arg) {
			
			public driver() {
				JFrame f = new JFrame();
				f.setTitle("Ball Breaker");
				f.setSize(sw, sh);
				f.setBackground(Color.BLACK);
				f.setResizable(false);
				f.addKeyListener(this);
				f.addMouseMotionListener(this);
			}
	}
}

