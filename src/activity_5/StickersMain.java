package activity_5;

import javax.swing.*;
import java.util.Scanner;

public class StickersMain {
    public static void main(String[] args) {
        Stickers stickers = new Stickers();

        stickers.stickerSize = Integer.parseInt(JOptionPane.showInputDialog("Welcome, what kind of sticker do you want? \n1.Big size \n2.Small size"));
        stickers.numberOfStickers = Integer.parseInt(JOptionPane.showInputDialog("How many stickers do you want? \n(Remember that the minimum are 10 units)"));

        if(stickers.stickerSize ==1){
            stickers.bigSize();
        } else {
            stickers.smallSize();
        }
    }
}
