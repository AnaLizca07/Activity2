package activity_13;

import javax.swing.*;

public class CarsMain {
    public static void main(String[] args) {
        Cars cars = new Cars();

        cars.typeOfCar = Integer.parseInt(JOptionPane.showInputDialog("Choose the car brand: \n1.Chevrolet" +
                "\n2.Mazda \n3.Renault"));

        if(cars.typeOfCar==1){
            cars.refsChev = Integer.parseInt(JOptionPane.showInputDialog("1.Spark GT \n2.Captiva"));
            cars.chevrolet();
        } else if (cars.typeOfCar==2) {
            cars.refsMazda = Integer.parseInt(JOptionPane.showInputDialog("1.Mazda 2 \n2.Mazda 6"));
            cars.mazda();
        } else {
            cars.refsRenault = Integer.parseInt(JOptionPane.showInputDialog("1.Sandero \n2.Duster Oroch"));
            cars.renault();
        }
    }
}
