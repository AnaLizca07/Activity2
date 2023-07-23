package activity_14;

import javax.swing.*;
import java.util.Scanner;

public class MultiplicationTableMain {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        Scanner lector = new Scanner(System.in);

        System.out.println("Type a number to see its multiplication table");
        multiplicationTable.number = lector.nextInt();
        multiplicationTable.mult();
    }
}
