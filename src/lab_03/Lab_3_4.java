package lab_03;

public class Lab_3_4 {

    public static void main(String[] args) {
        int[] intArr1 = { 1,12,16,28,34};
        int[] intArr2 = { 1,13,16,27,99};
        int[] intArrMerge = new int[intArr1.length + intArr2.length];
        int index =0;

        for (int value : intArr1) {
            intArrMerge[index] = value;
            index ++;
        }

        for (int value : intArr2) {
            intArrMerge[index] = value;
            index ++;
        }

        for (int i = 0; i < intArrMerge.length; i++) {
            for (int j = i+ 1; j < intArrMerge.length; j++) {
                if (intArrMerge[i] > intArrMerge[j]) {
                    int temp = intArrMerge[i];
                    intArrMerge[i] = intArrMerge[j];
                    intArrMerge[j] = temp;
                }
            }
        }
        System.out.println("Merge 2 SORTED integer array into one SORTED array: ");
        for (int value : intArrMerge) {
            System.out.print(value + "\t");
        }
    }
}
