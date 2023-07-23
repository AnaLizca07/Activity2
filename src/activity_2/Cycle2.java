package activity_2;

import javax.swing.*;

public class Cycle2 {
    public int n3;
    public int n4;

    public void showCycle2() {
        for (int i = n3; i <=n4 ; i++) {
            if(i!=5){
                JOptionPane.showMessageDialog(null,(i));
            }
        }
    }
}
