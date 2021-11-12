import javax.swing.*;
import java.awt.*;

public class EnemyAttack2 {
    Image image = new ImageIcon("src/images/enemy_attack.png").getImage();
    int x, y;
    int width = image.getWidth(null);
    int height = image.getHeight(null);
    int attack = 5;

    public EnemyAttack2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void fire() {
        this.x -= 12;//공격자가 공격하는 속도
    }
}
