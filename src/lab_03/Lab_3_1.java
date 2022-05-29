package lab_03;

public class Lab_3_1 {

    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        int evenNumber = 0;
        int oddNumber = 0;

        for (int value : intArr) {
            if(value % 2 == 0){
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println("Event number: "+ evenNumber);
        System.out.print("Odd number: "+ oddNumber);
    }
}
