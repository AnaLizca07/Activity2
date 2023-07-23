package activity_3;

import javax.swing.*;
import java.util.Scanner;

public class SucasaMain {
    public static void main(String[] args) {
        Sucasa sucasa = new Sucasa();

        sucasa.houseCost = Integer.parseInt(JOptionPane.showInputDialog("How much does the house cost?"));
        sucasa.typeOfFurniture = Integer.parseInt(JOptionPane.showInputDialog("Property type: \n1.Used \n2.New"));
        sucasa.commission();
        sucasa.showMessage();
    }
}
