package ARRAY;

//1.revrse array
// 2.move elemnt by pos 1
//3.move elemnt by k pos
//4.second max
//5.second min
//6.sort array  array
//7.remove duplicates
public class Striverday1 {
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 50};
        int n = arr.length;

//      //two pointer i++,j--;
//        int n =arr.length;
//        int i=0;
//        int j= n-1;
//       while(i<=j){
//   int temp=arr[i];
//           arr[i]=arr[j];
//           arr[j]=temp;
//           i++;
//           j--;
//       }
//    element move by k position
        //value of k
//        int k = 10;
//        //handle if k >n
//        k = k % n;
//        //loop run k th value time means k=2 loop run two times
//        for (int r = 0; r < k; r++) {
//
//            int temp = arr[n - 1];
//
//            for (int i = n - 1; i > 0; i--) {
//                arr[i] = arr[i - 1];
//            }
//            arr[0] = temp;
//        }
//
//  find second max element
//        int max=arr[0];
//        for(int i=0;i<n;i++){
//            if(arr[i]>=max){
//                max=arr[i];
//            }
//        }
        //second max assume -1,because arr[o] is possibility of max so we started fromn then the secondmax also max
//        int secondmax=-1;
//        for(int i=0;i<n;i++){
//            if(arr[i]>secondmax && arr[i]!=max){
//                secondmax=arr[i];
//            }
//        }
//        System.out.println(" maximum element "+ max );
//        System.out.println(" second max element "+ secondmax );

        //find array is sort or not
        boolean issorted = true;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                issorted = false;
            }
        }
        if (issorted) {
            System.out.println(" sorted ");
        } else {
            System.out.println(" not ");
        }


////
//        int i=0;
//            for(int j=1;j<n;j++){
//                if(arr[j]!=arr[i]){
//                   arr[i+1]=arr[j];
//                   i++;
//
//                }
//        }
//
//
//       for(int k=0;k<=i;k++){
//           System.out.println(arr[k]);
//       }
//
//        int j = 3;
//        j = j % n;
//        // int temp=arr[n-1];
//        for (int l = 0; l < j; l++) {
//            int temp = arr[n - 1];
//            for (int i = n - 1; i > 0; i--) {
//                arr[i] = arr[i - 1];
//            }
//
//            arr[0] = temp;
//        }
//        for (int num : arr) {
//            System.out.println(num);
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            //int temp = arr[n - 1];
            arr[i] = arr[i - 1];
            //arr[0] = temp;
        }  arr[0] = temp;

        for (int num : arr) {
            System.out.println(num);

        }
    }
}
