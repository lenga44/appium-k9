package lab_02;

import java.util.Scanner;

public class Lab_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float myWeight, myHeight,BMI;

        System.out.print(" Please enter your height: ");
        myHeight = scanner.nextFloat();
        System.out.print(" Please enter your weight: ");
        myWeight = scanner.nextFloat();
        BMI = myWeight / (myHeight * 2);
        System.out.printf(" Your BMI: %.1f", BMI);
        if (BMI < 18.5){
            System.out.println(" => Underweight");
        } else if (BMI <= 24.9){
            System.out.println(" => Normal weight");
        } else if (BMI <= 29.9){
            System.out.println(" => Overweight");
        } else {
            System.out.println(" => Obesity");
        }

    }
}