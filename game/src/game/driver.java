package game;

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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class driver extends JPanel implements ActionListener, KeyListener, MouseListener, MouseMotionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// size of jframe
	int sw = 500; // width of screen
	int sh = 700; // height of screen 
	Brick[][] bricks = new Brick[5][6];
	

	public void brickBuilder() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<6;j++) {
				bricks[i][j]= new Brick(30,60,60+61*j,200+31*i);
			}
		}// setting the hitboxes for all the rectangles
	}



	public void paint(Graphics g) {
		super.paintComponent(g);
		// paint the player
		g.setColor(Color.BLACK);

		g.fillRect(200,650, 100,20); // making the paddle
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<6;j++) {
				g.fillRect(60+61*j,200+31*i,60,30);
			}
		}//drawing all of the rectangles 

	

	}// end of paint method - put code above for anything dealing with drawing -

	public void Collision() { //use for collisions between ball and bricks
		
	}

	public void update() {

	}// end of update method - put code above for any updates on variable

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
		f.setBackground(Color.BLACK);
		f.setResizable(false);
		f.addKeyListener(this);
		f.addMouseMotionListener(this);

		// this special 'method' is called the constructor
		// initialized structures here

		// need a loop to visit all the possible addresses in my arrays
		// first spot in array is addressed by index 0
		// FOOD STUFF
	

		f.add(this);

		t = new Timer(17, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	Timer t;

	@Override
	public void keyPressed(KeyEvent e) {
		/*
		 * if(e.getKeyCode()==40){ //up arrow pVy=-5; }else if(e.getKeyCode()==38){
		 * //down arrow pVy=5; } if(e.getKeyCode()==39){ //left key pVx=-5; }else
		 * if(e.getKeyCode()==37){ //right key pVx=5; }
		 */
		if(e.getKeyCode()==39) {
			
		}
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

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.println(e.getX());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

		// velocity

		// int pVx = 0;
		// int pVy = 0;
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		/*
		 * System.out.println(arg0.getX()+" : "+ arg0.getY());
		 * System.out.println(pX+" : "+pY);
		 * 
		 * //based on where they are clicking, figure out how to set the velocity var
		 * //so it moves in that direction pVx = arg0.getX()-pX; //suggestion #1 pVy =
		 * arg0.getY()-pY;
		 */

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
}
