package ARRAY;

import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
//
//
//        brute force
//        int arr[]={1,2,3,4,8,6,8};
//        int n=arr.length;
//        int target=14;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.println(i + " "+ j);
//                    return;
//                }
//            }
//        }


        //optimal using hashing

        int arr[]={1,3,5,6,8,7,9,6};
        int target=15;
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
    // first find rem
            int rem=target-arr[i];
//if rem allredy present then add rem +arr[i] and answer will be found
            if(map.containsKey(rem)){
                System.out.println(" answer found ");
                System.out.println(rem +" "+arr[i]);
                return;
            }
            //store the map and value
            map.put(arr[i],i);
        }
    }
}
