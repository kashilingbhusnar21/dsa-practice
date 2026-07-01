package ARRAY;
import java.util.*;

class Main {

    public static void main(String[] args) {

        int arr[] = {3,1,-2,-5,2,-4};

        int n = arr.length;


        // store positive numbers

        ArrayList<Integer> pos = new ArrayList<>();


        // store negative numbers

        ArrayList<Integer> neg = new ArrayList<>();


        // separate positives and negatives

        for(int i = 0; i < n; i++) {

            if(arr[i] > 0) {

                pos.add(arr[i]);
            }

            else {

                neg.add(arr[i]);
            }
        }


        // place alternatively

        for(int i = 0; i < n/2; i++) {


            // even index -> positive

            arr[2*i] = pos.get(i);


            // odd index -> negative

            arr[2*i + 1] = neg.get(i);
        }


        // print final array

        for(int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
