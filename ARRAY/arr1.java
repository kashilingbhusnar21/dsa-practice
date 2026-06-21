package ARRAY;

import java.util.Scanner;

public class arr1{


    static int avarage(int arr[]) {
        int sum = 0;
        int avg;
        for (int i : arr) {
            sum += i;
        }
        avg=sum/arr.length;
        return avg;
    }
    public static void main(String[] args) {
        int arr[]={
                5,5,5,5
        };

        System.out.println(avarage(arr));

    }
}

   //  Scanner sc = new Scanner(System.in);
//        int ans=1;
//        int arr[][]={{1,2,3,},{13,45,78}};
//        int min=arr[0][0];
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                if(arr[i][j]<min){
//                    min=arr[i][j];
//                }
//            }
//
//        } System.out.println(min);
//    }
//}

//        int sum = 0;
//        int arr[][] = new int[3][4];
//        for (inti = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//              System.out.println( " for row "+ i+" column "+j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<3;i++){
//            for(int j=0; j<4;j++) {
//                System.out.print(arr[i][j] + " ");
//                int val=arr[i][j];
//                sum=sum+val;


//                sum = sum + arr[i][j];
//              System.out.print(sum);
//            }
//            System.out.println();
//           // System.out.println(sum);
//        }  System.out.println(sum);
//    }

//       /// int arr[]=new int[5];
//       int  arr[]={10 ,20,30,0,50};
//       int n = arr.length;
//       //pehla value ko min samaj liya uske sath compare karenge abb
//       int min = arr[0];
//
//       for(int i=0;i<n;i++){
//           if(arr[i]<min){
//               //update value
//               min=arr[i];
//           }
//       }

        //  System.out.println(" minimum val " + min);

//        //max value
//        int arr[] = {23, 45, 66, 78, 90};
//        int n = arr.length;
//        int max = arr[0];
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] > max) {
//                //update value if arr[i} is greater than max value
//                max = arr[i];
//            }}
//            System.out.println(max);


//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int sum=0;
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            System.out.println(" enter value for index "+ i);
//            arr[i]= sc.nextInt();
//            //int val=arr[i];
//            sum=sum+arr[i];
//
//        }
//        System.out.println("sum "+sum);

//            for (int val : arr) {
//                System.out.println(val);
//            }
//        //     }
//        int sum=0;
//        int arr[] = new int[4];
//        for(int i=0;i< arr.length;i++){
//            System.out.println(" enter your elements "+ i);
//            arr[i]= sc.nextInt();
//           // System.out.println(arr[i]);
//
//        }
//       // System.out.println(arr[]);
//        for(int val:arr){
//            System.out.print(val+" ");
//        }
//        int max=arr[0];
////        for(int i=0;i< arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("max"+max);
//
//       for(int i=0;i< arr.length;i++) {
//           int val = arr[i];
//           sum = sum + val;
//
//           System.out.println("row" + i + "sum" + sum);
//       }
//       int target=40;
//       for(int i=0;i< arr.length;i++){
//           if(arr[i]==target){
//               System.out.println(" yes target find at index"+i);
//           }
//       }
//
//        int sum = 0;
//        int arr[][] = {
//                {1, 2, 3, 4},
//                {2, 3, 4, 5}
//        };
////
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum += arr[i][j];
//                // sum = sum + val;
//            }
//
//
//            System.out.println( sum);
//        }
//        for(int j=0;j<arr.length;j++) {
//            for (int i = 0; i < arr[j].length; i++) {
//                System.out.print(arr[i][j] + " ");
////            }
//            System.out.println();
//        }
////    }

//   int sum=0;
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//
//        for (int j = 0; j < arr[0].length; j++) {
//            for (int i = 0; i < arr.length; i++) {
//               // System.out.print(arr[i][j] + " ");
//                sum+=arr[i][j];
//            }
//            System.out.println(" column "+ j+" sum "+ sum);
//           // System.out.println(" column "+ i+" sum "+ sum);
//        }
//
//    }
//    }
