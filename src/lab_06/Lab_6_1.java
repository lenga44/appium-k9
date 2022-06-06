package lab_06;

import java.util.Arrays;

public class Lab_6_1 {

    public static void main(String[] args) {
        String myString= "2hrs and 5 minutes";
        System.out.println("Minutes in total: " + totalMinutes(myString));
    }

    public static int totalMinutes( String myString){
        int totalMinutes = 0;
       String[] myStringArray= myString.split("and");
        for (String element : myStringArray) {
            if (element.contains("hrs")){
                totalMinutes = convertStringToNumber(element) *60;
            } else if (element.contains("minutes")) {
                totalMinutes =totalMinutes+ convertStringToNumber(element);
            }
        }
        return totalMinutes;
    }

    public static int convertStringToNumber(String element){
       return Integer.parseInt(String.valueOf(element.replaceAll("[^0-9]","")));
    }
}
