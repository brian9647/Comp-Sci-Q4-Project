
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
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
import javax.swing.Timer;
import java.awt.image.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class driver extends JPanel implements ActionListener, KeyListener {
	/**
	 * 
	 */

	// size of jframe
	int sw = 500; // width of screen
	int sh = 700; // height of screen
	Brick[][] bricks = new Brick[5][6];
	Slider Slider = new Slider(15, 90, sw/2 -50, sh-100); //instantiating a new slider
	ball ball = new ball(200, 500, 15, 15); //instantiating a new ball

//	public void brickBuilder() {
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 6; j++) {
//				bricks[i][j] = new Brick(30, 60, 60 + 61 * j, 200 + 31 * i);
//			}
//		} // setting the hit boxes for all the rectangles
//	} this will move to the driver at line 143 

	public void paint(Graphics g) {
		// paint the player
		g.setColor(Color.BLACK);

		//paint ball
		g.fillOval(ball.getH(), ball.getW(), ball.getX(), ball.getY());

		//paint Slider
		g.drawRect(Slider.getX(), Slider.getY(), Slider.getW(), Slider.getH()); // making the paddle

		//painting the bricks
		for (int r = 0; r < bricks.length; r++) {
			for (int c = 0; c < bricks[0].length; c++) {
				if (bricks[r][c].isDestroyed() == false) {
					g.fillRect(bricks[r][c].getX(), bricks[r][c].getY(), bricks[r][c].getW(),
							bricks[r][c].getH());
				}
			}
		}

	}// end of paint method - put code above for anything dealing with drawing -

	public void update() {

		//Slider.move(.25);
		ball.move();
		repaint();

// ball bounce
		if (ball.getH() == 500 - ball.getY()) {
			ball.setVx(ball.getVx() * -1);
		}
// right
		if (ball.getW() == 0) {
			ball.setVy(ball.getVy() * -1);
		}
// top
		if (ball.getH() == 0) {
			ball.setVx(ball.getVx() * -1);
		}
// left
		if (ball.getW() == 680 - ball.getY()) {
			ball.setVy(ball.getVy() * -1);
			ball.setH(Slider.getX() + (Slider.getW() / 2));
			ball.setW(Slider.getY() - ball.getY() - 5);
		}
// bottom^
// below is collision w Slider
		if (ball.getW() >= Slider.getY() - ball.getY() && ball.getH() > Slider.getX()
				&& ball.getH() < Slider.getX() + Slider.getW()) {
			ball.setVy(ball.getVy() * -1);
		}

// Slider left 
		if (Slider.getX() <= 0) {
			Slider.setX(10);
		}
// Slider right 
		if (Slider.getX() + Slider.getW() >= sw) {
			Slider.setX(sw - Slider.getW()-1);
		}
//"destroying the bricks" by moving them off screen when a collision happens
		for (int r = 0; r < bricks.length; r++) {
			for (int c = 0; c < bricks[0].length; c++) {
				// bottom of brick
				if (ball.getW() <= bricks[r][c].getY() + bricks[r][c].getH() && ball.getH() > bricks[r][c].getX()
						&& ball.getH() < bricks[r][c].getX() + bricks[r][c].getW()) {
					ball.setVy(ball.getVy() * -1);
					bricks[r][c].setDestroyed(true);
					bricks[r][c].setX(-500);
					repaint();
				}
			}
		}
	}

	// end of update method - put code above for any updates on variable

	// ==================code above ===========================

	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
		repaint();
	}

	public static void main(String[] arg) {
		driver d = new driver();
	}

	public driver() {
		JFrame f = new JFrame();
		f.setTitle("Brick Breaker");
		f.setSize(sw, sh);
		f.setBackground(Color.WHITE);
		f.setResizable(false);
		f.addKeyListener(this);

//creates the hit boxes for the bricks	
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				bricks[i][j] = new Brick(30, 60, 60 + 61 * j, 200 + 31 * i);
			}
		}
		
		f.add(this);

		t = new Timer(17, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	Timer t;

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == 37) {
			Slider.move(Slider.getVx() * -1);
		}

		if (e.getKeyCode() == 39) {
			Slider.move(Slider.getVx());
		}
		//controls for the slider
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		/*
		 * if(e.getKeyCode()==40){ //up key pVy=0; }else if(e.getKeyCode()==38){ //down
		 * key pVy=0; } if(e.getKeyCode()==39){ //left key pVx=0; }else
		 * if(e.getKeyCode()==37){ //right key pVx=0; }
		 */

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
