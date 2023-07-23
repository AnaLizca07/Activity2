package activity_8;

import javax.swing.*;

public class Triangle {
    public Double side1;
    public Double side2;
    public Double side3;

    public void equilateral(){
        if(side1.equals(side2) && side1.equals(side3)){
            JOptionPane.showMessageDialog(null,("Your triangle is equilateral"));
        } else {
            JOptionPane.showMessageDialog(null,("Your triangle isn`t equilateral"));
        }
    }
}
