package activity_6;

import javax.swing.*;
import java.util.Scanner;

public class ItalianaPizzaMain {
    public static void main(String[] args) {
        ItalianaPizza italianaPizza = new ItalianaPizza();

        italianaPizza.menu = Integer.parseInt(JOptionPane.showInputDialog("1.Pizza = $7.000 \n2.Sandwich = $5.000 \n3.Salad = $15.000"));
        italianaPizza.amount = Integer.parseInt(JOptionPane.showInputDialog("How many pieces do you want?"));
        italianaPizza.sauce = JOptionPane.showInputDialog("Do you want sauce?");

        if(italianaPizza.menu ==1){
            italianaPizza.pizza();
        } else if (italianaPizza.menu==2) {
            italianaPizza.sandwich();
        } else if (italianaPizza.menu==3) {
            italianaPizza.salad();
        } else {
            JOptionPane.showMessageDialog(null,("Choose a valid option"));
        }
    }
}
