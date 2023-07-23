package activity_8;

import javax.swing.*;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.side1 = Double.parseDouble(JOptionPane.showInputDialog("Write the first side of the triangle"));
        triangle.side2 = Double.parseDouble(JOptionPane.showInputDialog("Write the second side of the triangle"));
        triangle.side3 = Double.parseDouble(JOptionPane.showInputDialog("Write the third side of the triangle"));
        triangle.equilateral();
    }
}
