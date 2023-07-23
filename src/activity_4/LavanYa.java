package activity_4;

import javax.swing.*;

public class LavanYa {
    public Integer service;//lavado o planchado
    public Integer laundry;// lavado seco o normal
    public Integer quantity;//cantidad de prendas
    public int total;

    public void washType(){
        if(laundry==1){
            total= (quantity*2000);
            JOptionPane.showMessageDialog(null,("You have to pay: "+total));
        } else {
            total = quantity*1500;
            JOptionPane.showMessageDialog(null,("You have to pay: "+total));
        }
    }

    public void ironing(){
        total = (quantity*1800)+3000;
        JOptionPane.showMessageDialog(null,("You have to pay: "+total));
    }

}
