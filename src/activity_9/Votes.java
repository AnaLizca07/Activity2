package activity_9;

import javax.swing.*;

public class Votes {

    public Integer election;
    public int ana=0;
    public int diego=0;
    public int total;

    public void vot(){
        for (int vote = 1; vote <=10 ; vote++) {
            if(election==1){
                ana++;
            } else if (election==2) {
                diego++;
            } else {
                JOptionPane.showMessageDialog(null,"Please, select a correct option");
                election--;
                total--;
            }
        }
    }

    public void result(){
        if(ana>diego){
            JOptionPane.showMessageDialog(null, "The winner is: Ana Maria Suarez\nThe loser is: Diego Acero" );
        } else if (diego>ana) {
            JOptionPane.showMessageDialog(null, "The winner is: Diego Acero \nThe loser is: Ana Maria Suarez" );
        } else{
            JOptionPane.showMessageDialog(null, "It was a draw" );
        }
    }
}
