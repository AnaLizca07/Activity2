package activity_7;

import javax.swing.*;

public class Library {
    public Integer typeOfService;
    public Integer daysLate;
    public Integer typeOfBook;
    public Integer quantityOfBooks;
    public int total;

    public void ret(){
        switch (typeOfBook){
            case 1: {
                total = (daysLate * 600) * quantityOfBooks;
                JOptionPane.showMessageDialog(null,("You have to pay:")+total);

            }break;
            case 2:
                total = (daysLate * 500) * quantityOfBooks;
                JOptionPane.showMessageDialog(null,("You have to pay:")+total);
        }
    }

    public void loss(){
        total = quantityOfBooks*10000;
        JOptionPane.showMessageDialog(null,("You have to pay:")+total);
    }


}
