package ARRAY;

//import static java.util.Collections.reverse;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;
import static java.util.Collections.swap;

public class striverday2 {


//    static void  movek(int arr[],int k) {
//
//        int n = arr.length;
//        k = k % n;
//        //first revrsefull array
//        reversearr(arr, 0, n - 1);
//        //revrse array upto k
//        reversearr(arr, 0, k - 1);
//        //remaning revrse array from k to n-1
//        reversearr(arr, k, n - 1);
//    }
//    static void reversearr(int arr[],int i,int j){
//        //use 2 pointer for revrse array
//        while(i<j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//
//        }
//    }

    //move zeros at the end
    //brurtal solution
    public static void main(String[] args) {
        //brutal soloution
        int arr[]={1,2,0,9,0,0,6,0};
        int n=arr.length;
//        //first we declare arraylyst and store temp arr  non zero elements
//        ArrayList<Integer> temp=new ArrayList<>();
//        for(int i=0;i<n;i++){
//            if(arr[i]!=0){
//                temp.add(arr[i]);
//            }
//    }   ///replace arr[i] with temp
//        for(int i=0;i<temp.size();i++){
//            arr[i]= temp.get(i);
//        }
//        //print all zeros at the end
//        for(int i=temp.size();i<n;i++){
//            arr[i]=0;
//        }
//        //optimal solution
//    int j=-1;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0){
//                j=i;
//                break;
//            }
//        }
//        for(int i=j+1;i<n;i++){
//            if(arr[i]!=0){
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                j++;
//            }
//        }

        //linear search
        int target=10;
        int index=-1;

        for(int i=0;i<n;i++){
            if(arr[i]==target){
                index=i;
            }
        }
        System.out.println(index);
//        for(int i :arr){
//            System.out.println(i);
//        }
//

        }





















}
