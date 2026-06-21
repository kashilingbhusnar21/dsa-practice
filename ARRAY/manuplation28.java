package ARRAY;

public class manuplation28 {


//    //revrse a array
    static void revrsearray(int arr[]){

        int n=arr.length;
        int i=0;
        int j=n-1;
        //loop chalega
        while(i<=j){

            //fisrt swap karo
            //i++ karo
            //j ko j-- karo
            //swap karne ke liye temp create karo ,temp me arr
            // i ko store karo baad me j ko i pe replace karo and j me temp ko replace karo
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

      }
        for(int k : arr){
            System.out.println(k);
        }
    }


// shift element by positionn 1

//static void shifting(int arr[]){
//    int n=arr.length;
//    // last element ko store kkardiya taki wo lost na ho jaye
//    int temp=arr[n-1];
//
//    //abb hume ulta lopp halana hai
//    for(int i=n-1;i>0;i--){
//        arr[i]=arr[i-1];
//    }
//    arr[0]=temp;
//
//    for(int k : arr){
//        System.out.println(k);
//    }
//}
//static void shiftbykpo(int arr[]) {
//    int n = arr.length;
//    int brr[] = new int[n];
//    int temp[] = arr;
//
//
//    for (int i = n - 1; i > 0; i++) {
//        arr[i] = arr[i - 1];
//

//    }
//    int arr[] = temp;
//}
//
//    public static void main(String[] args) {
//        int arr[] = {10, 20, 30, 40, 50, 60};
//        shiftbykpo(arr);
//        //revrsearray(arr);

    public static void main(String[] args) {
        int arr[]={10,20,20,30,50,60,80};
      revrsearray(arr);
        //  System.out.println(revrsearray(arr));

    }  }


