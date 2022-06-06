package lab_06;

public class Lab_6_3 {

    public static void main(String[] args) {
        String myStr = "100 minutes";
        System.out.println(findNumberInString(myStr));
    }

    public static String findNumberInString(String myStr){
        char[] myStrArray = myStr.toCharArray();
        String numberOfString="";
        for (char character : myStrArray) {
            if (Character.isDigit(character)){
                numberOfString = numberOfString.concat(String.valueOf(character));
            }
        }
        return numberOfString;
    }
}
