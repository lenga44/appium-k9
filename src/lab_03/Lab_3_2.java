package lab_03;

public class Lab_3_2 {

    public static void main(String[] args) {

       int[] intArr = {1,2,3,4,5};
       int min = intArr[0];
        int max = intArr[0];

        for (int value : intArr) {
           if (value < min || value ==min){
               min = value;
           }
        }

        for (int value : intArr) {
            if (value > max || value ==max){
                max = value;
            }
        }

        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
    }
}
