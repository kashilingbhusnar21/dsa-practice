package ARRAY;

public class max {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 65, 8, 9};

        int n = arr.length;
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            System.out.println(" max " + max);

    }
}
