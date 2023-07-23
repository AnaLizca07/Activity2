package activity_12;

import javax.swing.*;

public class Champions {
    public String team1;
    public String team2;
    public Integer marker1;
    public Integer marker2;
    public String date1;
    public String date2;
    public String date3;
    public String first;
    public String second;

    public void ranking(){
        if(marker1>marker2){
            first = team1;
            second = team2;
            JOptionPane.showMessageDialog(null,"First place: " + first +
                    "\nSecond place: "+ second);
        } else if (marker1<marker2) {
            first = team2;
            second = team1;
            JOptionPane.showMessageDialog(null,"First place: " + first +
                    "\nSecond place: "+ second);
        } else{
            JOptionPane.showMessageDialog(null,"It was av draw");
        }
    }
}
