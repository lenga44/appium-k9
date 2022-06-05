package lab_03;

import java.util.Arrays;

public class Lab_3_4 {

    public static void main(String[] args) {
        int[] intArr1 = {1, 12, 16, 28, 34};
        int[] intArr2 = {1, 13, 16, 27, 99};

        System.out.println(Arrays.toString(mergeSortedArray(intArr1,intArr2)));
    }

    public static int[] mergeSortedArray(int[] intArr1, int[] intArr2) {
        int intArr1Length = intArr1.length;
        int intArr2Length = intArr2.length;
        int[] intArrMerge = new int[intArr1Length + intArr2Length];
        int intArr1Index = 0;
        int intArr2Index = 0;
        int intArrMergeIndex = 0;

        while (intArr1Index < intArr1Length && intArr2Index < intArr2Length) {
            if (intArr1[intArr1Index] < intArr2[intArr2Index]) {
                intArrMerge[intArrMergeIndex++] = intArr1[intArr1Index++];
            } else {
                intArrMerge[intArrMergeIndex++] = intArr2[intArr2Index++];
            }
        }
        while (intArr1Index < intArr1Length) {
            intArrMerge[intArrMergeIndex++] = intArr1[intArr1Index++];
        }

        while (intArr2Index < intArr2Length) {
            intArrMerge[intArrMergeIndex++] = intArr2[intArr2Index++];
        }

        return intArrMerge;
    }

}
