import javax.swing.*;
import java.awt.*;

public class Enemy2 {
    Image image = new ImageIcon("src/images/enemy2.png").getImage();
    int x, y;
    int width = image.getWidth(null);
    int height = image.getHeight(null);
    int hp = 10;

    public Enemy2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
         this.x -= 7;
    }
}