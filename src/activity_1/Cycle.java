package activity_1;

import javax.swing.*;

public class Cycle {
    public int start;
    public int end;
    public void showCycle(){
        for (int i = start; i <= end; i++) {
            JOptionPane.showMessageDialog(null,(i));
        }
    }
}
