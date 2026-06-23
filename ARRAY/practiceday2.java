package ARRAY;

import java.util.Arrays;

public class practiceday2 {
    public static void main(String[] args) {
        boolean issorted = true;
        int arr[] = {10, 20, 20, 50, 60, 60, 60, 30, 40, 50, 60, 80};
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;


        for (int ii : arr) {
            System.out.println(ii);
        }
//        System.out.println(" ------- ");
//        int tempp=arr[n-1];
//        for(int j=n-1;j>0;j--){
//            arr[j]=arr[j-1];
//        }arr[0]=tempp;
//
//        for(int ii: arr){
//            System.out.println(ii);
//        }
//          }


    }
    }

//pov : its 3 am and you realize if you ont make it this year your whole life is cookedf