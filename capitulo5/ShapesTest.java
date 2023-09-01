package capitulo5;

import javax.swing.*;

public class ShapesTest {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("1 to draw rectangle" +
                "\n2 to draw oval");

        int choice = Integer.parseInt(input);
        Shapes shapes = new Shapes(choice);

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(shapes);
        frame.setSize(300,300);
        frame.setVisible(true);

    }
}