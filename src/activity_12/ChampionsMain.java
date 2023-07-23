package activity_12;

import javax.swing.*;

public class ChampionsMain {
    public static void main(String[] args) {
        Champions champions = new Champions();

        champions.team1 = JOptionPane.showInputDialog("Enter the name of the first team");
        champions.marker1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the marker of the first team"));
        champions.team2 = JOptionPane.showInputDialog("Enter the name of the second team");
        champions.marker2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the marker of the second team"));
        champions.date1 = JOptionPane.showInputDialog("Enter the name of the first date");
        champions.date2 = JOptionPane.showInputDialog("Enter the name of the second date");
        champions.date3 = JOptionPane.showInputDialog("Enter the name of the third date");

        champions.ranking();
    }
}
