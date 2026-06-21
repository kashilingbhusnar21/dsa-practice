package ARRAY;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class practice {
//    public static void main(String[] args) {
//
////
////        // static int[] input ( int arr[]){
////        //  int arrr[]=new int [4];
//        Scanner sc = new Scanner(System.in);
//        //int n = arrr.length;
//        int arrr[][] = new int[3][3];
//        int n = arrr.length;
//        for (int i = 0; i < arrr.length; i++) {
//            for (int j = 0; j < arrr[i].length; j++) {
//
//
//                System.out.println(" enetr the value for  " + i + j);
//                arrr[i][j] = sc.nextInt();
//
//            }
//        } for (int i = 0; i < arrr.length; i++) {
//            for (int j = 0; j < arrr[i].length; j++) {
//                System.out.print(arrr[i][j]+" ");
//            }
//
//            System.out.println();
//
//        }
////        for(int[] arr:arrr){
//            System.out.println(arr);
//        }
//
//    }
//}
////          for( int val:arr){
//                System.out.println(val);
//            }
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                int val = arrr[i][j];
//                sum = sum + val;
//
//            }
//        }
//        System.out.println(sum);
//        // return arr;
//
//
//        int mul = 1;
//        for (int i = 0; i < n; i++) {
//            for(int j=0;j<n;j++){
//            mul = mul * arrr[i][j];
//        }
//            }
//        System.out.println(" multiplications " + mul);

//
//          int arr[]={ 20,30,40,60,90};
//            int n= arr.length;
//            int maxx= arr[0];
//            for(int i=0;i<n;i++){
//                if(arr[i]>maxx){
//                    maxx= arr[i];
//                }
//
//            } System.out.println(" maximum element "+maxx);
//


//static int [] multiply10(int arr[]) {
//
//    int n = arr.length;
//    int newarr[] = new int[n];
//    for (int i = 0; i < n; i++) {
//        int element = arr[i];
//        int newelement = element * 10;
//        newarr[i] = newelement;
//    }
//    return newarr;
//}
 //   multipli by 10
    static int[] multiply10(int arr[]) {

        int size = arr.length;
        int newarr[] = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newelement = element * 10;
            newarr[i] = newelement;

        }
        return newarr;
    }
//
    public static void main(String[] args) {
    int arr[]={10,20,30,40,50};
    int ans[]= multiply10(arr);
        System.out.println( ans);

}
}