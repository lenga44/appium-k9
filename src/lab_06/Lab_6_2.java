package lab_06;

import java.util.Scanner;

public class Lab_6_2 {

    public static void main(String[] args) {
        String myPassword = "password123";
        enterPassword(myPassword);
    }

    public static void enterPassword(String myPassword) {
        int isCounting = 0;
        Scanner scanner = new Scanner(System.in);
       do {
           isCounting++;
            System.out.println("Please enter your password: ");
            String password = scanner.nextLine();
            if (isCounting < 3){
                if (password != myPassword){
                    System.out.println("Password is wrong!!!");
                }else {
                    System.out.println("Password is correct!!!");
                    break;
                }
            }else {
                System.out.println("Your turn is over");
            }

        } while ((isCounting <3));
    }
}
