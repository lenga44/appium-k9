package lab_03;

import java.util.Arrays;

public class Lab_3_3 {

    public static void main(String[] args) {

        int[] intArr = {12, 34, 1, 16, 28};

        System.out.println("Sort an integer array from min to max: ");
        System.out.println(Arrays.toString(sortArray(intArr)));

    }

    public static int[] sortArray(int[] intArr) {
        int arrLength = intArr.length;

        for (int unsortesIndex = arrLength - 1; unsortesIndex > 0; unsortesIndex--) {
            for (int index = 0; index < unsortesIndex; index++) {
                if (intArr[index] > intArr[index + 1]) {
                    int tmp = intArr[index];
                    intArr[index] = intArr[index + 1];
                    intArr[index + 1] = tmp;
                }
            }
        }
        return intArr;
    }

//    public static int[] sortArray(int[] intArr) {
//        int arrLength = intArr.length;
//
//        for (int unsortesIndex = arrLength - 1; unsortesIndex > 0; unsortesIndex--) {
//            for (int index = 0; index < unsortesIndex; index++) {
//                if (intArr[index] > intArr[index + 1]) {
//                    intArr[index] = intArr[index] + intArr[index + 1];
//                    intArr[index + 1] = intArr[index] - intArr[index + 1];
//                    intArr[index] = intArr[index] - intArr[index + 1];
//                }
//            }
//        }
//        return intArr;
//    }
}
