package activity_10;

import javax.swing.*;

public class ExamMain {
    public static void main(String[] args) {
        Exam exam = new Exam();

        exam.question1 = Boolean.parseBoolean(JOptionPane.showInputDialog("Question 1. Write true or false accordingly: " +
                "\nDo humans have skin?"));
        exam.ver1();

        exam.question2 = JOptionPane.showInputDialog("Question 2. Write A,B or C accordingly:\nWhat color belongs to the Colombian flag?" +
                "\nA.Blue\nB.Green\nC.Brown");
        exam.ver2();

        exam.question3 = Boolean.parseBoolean(JOptionPane.showInputDialog("Question 1. Write true or false accordingly: " +
                "\nThe capital of Colombia is Armenia"));
        exam.ver3();

        exam.question4 = JOptionPane.showInputDialog("Question 2. Write A,B or C accordingly:\nHow many stars does the US flag have?" +
                "\nA.30\nB.45\nC.50");
        exam.ver4();

        exam.question5 = Boolean.parseBoolean(JOptionPane.showInputDialog("Question 1. Write true or false accordingly: " +
                "\nThe water is blue"));
        exam.ver5();

        exam.note();
    }
}
