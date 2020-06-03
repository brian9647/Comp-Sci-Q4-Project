
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;


public class Brick {
        private int x;
        private int y;
        private int h;
        private int w;
        private boolean destroyed;
        private Image img;
        private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);

        public Brick() {
                h = 30;
                w = 60;
                destroyed = false;
        }

        public Brick(int H, int W, int X, int Y) {
                this.h = H;
                this.w = W;
                this.x = X;
                this.y = Y;
                destroyed = false;
        }



        public void paint(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.drawImage(img, tx, null);
        }



        public boolean isDestroyed() {
                return destroyed;
        }

        public void setDestroyed(boolean boom) {
                this.destroyed = boom;
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