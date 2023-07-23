package activity_11;

import javax.swing.*;

public class Weight {
    public Integer typeOfMoney;
    public Integer amountOfMoney;
    public int service = 500;
    public int moneyChange;

    public void change(){
        if(amountOfMoney-service==0){
            JOptionPane.showMessageDialog(null,"You don`t have change");
            JOptionPane.showMessageDialog(null,"Come back soon!😄");
        } else{
            moneyChange = amountOfMoney-service;
            JOptionPane.showMessageDialog(null,"Your change is: "+ moneyChange);
            JOptionPane.showMessageDialog(null,"Come back soon!😄");
        }
    }

    public void coinsCheck(){
        if(amountOfMoney==500||amountOfMoney==1000){
            change();
        } else{
            JOptionPane.showMessageDialog(null,"Please, enter a correct answer");
        }
    }

    public void billsCheck(){
        if(amountOfMoney==2000||amountOfMoney==5000){
            change();
        } else{
            JOptionPane.showMessageDialog(null,"Please, enter a correct answer");
        }
    }
}
