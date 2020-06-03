
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;



public class Slider {
	
		private int h;
		private int w;
		private double vx;
		private int x;
		private int y;

		public Slider() {
			h = 35;
			w = 75;
		}

		public Slider(int paramh, int paramw, int paramx, int paramy) {
			h = paramh;
			w = paramw;
			x = paramx;
			y = paramy;
			vx = 0.25;
		}

		public void move(double paramvx) {
			x += x * paramvx;
		}

		public void setVx(double vx) {
			this.vx = vx;
		}

		public double getVx() {
			return vx;
		}

		public int getH() {
			return h;
		}

		public void setH(int height) {
			h = height;
		}

		public int getW() {
			return w;
		}

		public void setW(int width) {
			w = width;
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

	}