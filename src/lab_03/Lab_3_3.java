package lab_03;

public class Lab_3_3 {

    public static void main(String[] args) {

        int[] intArr = {12,34,1,16,28};

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i+ 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
            System.out.println("Sort an integer array from min to max: ");
            for (int value : intArr) {
                System.out.print(value + "\t");
            }

    }
}
