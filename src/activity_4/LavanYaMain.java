package activity_4;

import javax.swing.*;
import java.util.Scanner;

public class LavanYaMain {
    public static void main(String[] args) {
        LavanYa lavanYa = new LavanYa();

        lavanYa.service = Integer.parseInt(JOptionPane.showInputDialog("Choose your service: \n 1.Laundry \n 2.Drying"));
        lavanYa.quantity = Integer.parseInt(JOptionPane.showInputDialog("How many clothes are they?"));
        if(lavanYa.service == 1){
            lavanYa.laundry = Integer.parseInt(JOptionPane.showInputDialog("1.Dry cleaning \n2.Regular wash"));
            lavanYa.washType();
        } else {
            lavanYa.ironing();
        }

    }
}
