package ARRAY;

import java.util.Scanner;

//avrage
//multiply by 10
public class lect27 {

//    //avarage of array elements
//
//    static double  avrage(int arr[]){
//
//        double sum=0;
//
//        for(int i=0;i<arr.length;i++) {
//            sum += arr[i];
//        }
//        //avg find karne ko  sum kosize divide kar liya
//            double avg = sum / arr.length;
//
//
//
//        return avg;
//    }

    //multipli by 10
//    static int[] multiply10(int arr[]) {
//
//        int size = arr.length;
//        int newarr[] = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            int element = arr[i];
//            int newelement = element * 10;
//            newarr[i] = newelement;
//
//        }
//        return newarr;
//    }
//

//    //linear search
//    static boolean linearsearch(int arr[], int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return true;
//            }
//        }
//        return false;
//
//
//    }

//    //positive and negitive sum of asrray
//    static int[] sumofposneg(int arr[]) {
//        //first we take the value of positive and negitive 0
//        int posans = 0;
//        int negans = 0;
//        //traverse the array
//        for (int i = 0; i < arr.length; i++) {
//            //logic for positive number
//            if (arr[i] > 0) {
//                //same like basic sum
//                posans = posans + arr[i];
//            } else {
//                //logic for neg num
//                negans = negans + arr[i];
//            }
//
//        }
//        //agar hume po aur neg dono value chahiye to hamne new ans array create kiya usme store kardi,
//        //pos =index 0;and neg =index 1;
//        int ans[] = {posans, negans};
//        //ans ko return kiyab
//        return ans;
//    }

//count 0 and 1 in arrays

    static int [] count1and0(int arr[]){
        int zerocount=0;
        int onecount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                onecount++;
            }
            else if(arr[i]==0){

                zerocount++;
            }

    }
        int ans[]={zerocount,onecount};
        return ans;
    }

    public static void main(String[] args) {

        int arr[]={0,1,0,3,4,6,0,0,3,1,1,1,0};
        int ans[]=count1and0(arr);
        System.out.println(" zeroscount : "+ ans[0]);
        System.out.println(" onecount : "+ ans[1]);

        //positive and negitive sum
//        int arr[] = {1, 3,-90,-9,34, 4, 5};
//        //new array create kiya value ko store karne ke liye
//          int ans[]=sumofposneg(arr);
//          //print for posityivesum
//        System.out.println(" positive "+ans[0]);
//        System.out.println("negitive "+ans[1]);

//        System.out.println(ans);
////        for (int i : ans) {
////            System.out.println(i);
//        }
//
    }
}
//
//    }
//
//}
//   // int sum=0;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum=0;
//        int arr[][] = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println(" enter value for row " + i + " column " + j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//
//
//                System.out.print(arr[i][j] + " ");
//            }
//
//
//            System.out.println();
//        }
//       for(int i=0;i<3;i++){
//           for(int j=0;j<3;j++){
//               sum+=arr[i][j];
//
//           }
//           //System.out.println(sum);
//           System.out.println(" for row "+ i+ " sum"+sum);
//       }System.out.println(sum);
//    }
//}