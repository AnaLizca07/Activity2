package activity_10;

import javax.swing.*;

public class Exam {
    public Boolean question1;
    public String question2;
    public Boolean question3;
    public String question4;
    public Boolean question5;
    public int total =0;

    public void ver1(){
        if(question1){
            JOptionPane.showMessageDialog(null,"Correct!");
            total+=10;
        } else{
            JOptionPane.showMessageDialog(null,"Incorrect!");
        }
    }

    public void ver2(){
        if(question2.equalsIgnoreCase("a")){
            JOptionPane.showMessageDialog(null,"Correct!");
            total+=10;
        } else{
            JOptionPane.showMessageDialog(null,"Incorrect!");
        }
    }

    public void ver3(){
        if(!question3){
            JOptionPane.showMessageDialog(null,"Correct!");
            total+=10;
        } else{
            JOptionPane.showMessageDialog(null,"Incorrect!");
        }
    }

    public void ver4(){
        if(question4.equalsIgnoreCase("c")){
            JOptionPane.showMessageDialog(null,"Correct!");
            total+=10;
        } else{
            JOptionPane.showMessageDialog(null,"Incorrect!");
        }
    }

    public void ver5(){
        if(!question5){
            JOptionPane.showMessageDialog(null,"Correct!");
            total+=10;
        } else{
            JOptionPane.showMessageDialog(null,"Incorrect!");
        }
    }

    public void note(){
        JOptionPane.showMessageDialog(null,"Your score is: "+ total);
    }
}
