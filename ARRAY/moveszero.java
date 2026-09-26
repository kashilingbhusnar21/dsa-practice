package ARRAY;
public class moveszero {

    public static void moveZeros(int[] arr) {
        int j = 0; // position for next non-zero element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        // print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}