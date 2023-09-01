package capitulo5;

import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {

    private int choice;

    public Shapes(int numerChoice) {
        this.choice = numerChoice;
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        for(int i = 0; i <= 12; i++) {
            switch (choice) {
                case 1:
                    g.drawRect(130 - 5 * i, 130 - 5 * i, 20 + 10 * i, 20 + 10 * i);
                    break;
                case 2:
                    g.drawOval(130 - 5 * i, 130 - 5 * i, 20 + 10 * i, 20 + 10 * i);
                    break;
            }
        }
    }
}