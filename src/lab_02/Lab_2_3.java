package lab_02;

import java.util.Scanner;

public class Lab_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float myWeight, myHeight, BMI;

        System.out.print(" Please enter your height: ");
        myHeight = scanner.nextFloat();
        System.out.print(" Please enter your weight: ");
        myWeight = scanner.nextFloat();
        BMI = myWeight / (myHeight * 2);
        System.out.printf(" Your BMI : %.1f", BMI);
        if (BMI <= 24.9) {
            if (BMI < 18.5) {
                System.out.println(" - Underweight");
                System.out.print(" => You should increase weight ");
            } else if (BMI <= 24.9){
                System.out.println(" - Normal weight");
                System.out.print(" => You are fit!!!!! ");
            }
        } else {
            if (BMI <= 29.9) {
                System.out.println(" - Overweight");
            } else {
                System.out.println(" - Obesity");
            }
            System.out.print(" => You should decrease weight ");
        }
    }
}