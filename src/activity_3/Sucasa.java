package activity_3;

import javax.swing.*;

public class Sucasa {
    public Integer houseCost;
    public Integer typeOfFurniture;
    public int commission1;
    public void commission(){
        if(typeOfFurniture == 1) {
            commission1 = (int) (houseCost * 0.10);
        }
        else {
            commission1 = (int) (houseCost * 0.12);
        }
    }
    public void showMessage(){
        JOptionPane.showMessageDialog(null,("The owner receives: " + (houseCost-commission1) +
                "\nThe real estate receives: "+ commission1));
    }
}
