package activity_6;

import javax.swing.*;

public class ItalianaPizza {
    public Integer menu;
    public Integer amount;
    public String sauce;
    public int total;

    public void pizza(){
        if(sauce.equalsIgnoreCase("yes")){
            total = (amount * 7000) + 3000;
            JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        } else if (sauce.equalsIgnoreCase("no")) {
            total = amount * 7000;
            JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        }
    }

    public void sandwich(){
        if(sauce.equalsIgnoreCase("yes")){
            total = (amount * 5000) + 3000;
            JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        } else if (sauce.equalsIgnoreCase("no")) {
            total = amount * 5000;
            JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        }
    }

    public void salad(){
        if(sauce.equalsIgnoreCase("yes")){
            total = (amount * 15000) + 3000;
            JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        } else if (sauce.equalsIgnoreCase("no")) {
            total = amount * 15000;
            JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        }
    }
}
