
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;

public class ball {
	private int x;
	private int y;
	private int h;
	private int w;
	private double vx;
	private double vy;
	private Image img;
	private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);

	public ball(int paramH, int paramW, int paramX, int paramY) {
		this.h = paramH;
		this.w = paramW;
		this.x = paramX;
		this.y = paramY;
		vx = 1.75;
		vy = -1.75;
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(img, tx, null);

	}

	public void move() {
		w += vy;
		h += vx;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

}