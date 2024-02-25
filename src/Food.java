import java.awt.*;

public class Food {
    public Food(){
    }

    public void setPosition(Graphics g, int appleX, int appleY, int UNIT_SIZE){
        g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
    }
}
