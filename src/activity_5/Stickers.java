package activity_5;

import javax.swing.*;

public class Stickers {
    public Integer stickerSize;
    public Integer numberOfStickers;
    public int total;
    boolean a = true;

    public void bigSize(){
            if (numberOfStickers >= 10) {
                total = numberOfStickers * 6000;
                JOptionPane.showMessageDialog(null,("You have to pay: "+total));
            } else {
                JOptionPane.showMessageDialog(null,("The minimum is 10 stickers, please, enter a valid quantity"));
            }
    }

    public void smallSize(){
        if (numberOfStickers>=10) {
            total = numberOfStickers * 4000;
            JOptionPane.showMessageDialog(null,("You have to pay: "+total));
        } else {
            JOptionPane.showMessageDialog(null,("The minimum is 10 stickers, please, enter a valid quantity"));
        }
    }
}
