import java.awt.*;

public class Car {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 100);
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics g = panel.getGraphics();
        
        for (int i = 10; i <= 200; i += 10) {
            drawCar(g, i);
            panel.sleep(250);
            panel.clear();
        }
    }
    
    public static void drawCar(Graphics g, int hPos) {
        // car body
        g.setColor(Color.BLACK);
        g.fillRect(hPos, 30, 100, 50);
        
        // wheels
        g.setColor(Color.RED);
        g.fillOval(hPos + 10, 70, 20, 20);
        g.fillOval(hPos + 70, 70, 20, 20);
        
        // window
        g.setColor(Color.CYAN);
        g.fillRect(hPos + 70, 40, 30, 20);
        
    }
}
