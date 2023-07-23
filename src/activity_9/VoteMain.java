package activity_9;

import javax.swing.*;

public class VoteMain {
    public static void main(String[] args) {
        Votes votes = new Votes();

        while (votes.total<10) {
            votes.election = Integer.parseInt(JOptionPane.showInputDialog("Vote for your favorite: \n1.Ana Maria Suarez \n2.Diego Acero"));
            votes.vot();
            votes.total++;
        }
        votes.result();
    }
}
