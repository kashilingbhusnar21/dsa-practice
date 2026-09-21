//package ARRAY;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class PrimeCheck {
//
//
//    public  static void  movebyk(int arr[],int k) {
//
//        int n = arr.length;
//  k=k%n;
//        reverse(arr, 0, n - 1);
//
//        reverse(arr, 0, k - 1);
//
//         reverse(arr, k, n - 1);
//    }
//    //return arr[];
//        public  static void reverse(int arr[],int i,int j){
//
//        while(i<j){
//
//            int temp =arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j++;
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//
//        //longest sub array sum using sliding window
//        //remove duplicates
//
//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(PrimeCheck.movebyk(arr,5));
//        //Set<Integer> set=new HashSet<>();
//
//
//
//    }
//}