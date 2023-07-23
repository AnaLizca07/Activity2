package activity_7;


import javax.swing.*;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        library.typeOfService = Integer.parseInt(JOptionPane.showInputDialog("Choose the option you require: \n1.Delay \n2.Loss"));
        library.quantityOfBooks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of copies"));

        if(library.typeOfService==1){
            library.typeOfBook = Integer.parseInt(JOptionPane.showInputDialog("What kind of book is it? \n1.Book \n2.Magazine"));
            library.daysLate = Integer.parseInt(JOptionPane.showInputDialog("How many days late is it?"));
            library.ret();
        } else {
            library.loss();
        }
    }
}
