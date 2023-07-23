package activity_11;

import javax.swing.*;

public class WeightMain {
    public static void main(String[] args) {
        Weight weight = new Weight();

        weight.typeOfMoney = Integer.parseInt(JOptionPane.showInputDialog("Choose your type Of Money: \n1.Coins \n2.Bills"));
        weight.amountOfMoney = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of money (Remember" +
                "that only: Bills of $2000 or $5000. Coins of 500 or 1000)"));

        if(weight.typeOfMoney==1){
            weight.coinsCheck();
        } else if (weight.typeOfMoney==2) {
            weight.billsCheck();
        } else {
            JOptionPane.showMessageDialog(null,"Please,enter a correct answer");
        }
    }
}
