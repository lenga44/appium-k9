package lab_02;

import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print(" Nhập số: ");
        int number = scanner.nextInt();

        String outputMsg = number %2 == 0 ? " __Số vừa nhập là số chẵn!__" : " __Số vừa nhập là số lẻ!__";
        System.out.println(outputMsg);
    }
}