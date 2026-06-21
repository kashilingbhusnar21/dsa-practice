package ARRAY;

public class basicmaths {
//    static boolean  countdighit(int num) {
//        int sum=0;
//      //  int orignalnum=num;
//        for(int i=1;i<num;i++){
//            if(num%i==0){
//                sum=sum+i;
//            }
//        }
//        if(sum ==num){
//            System.out.println(" number is perfect ");
//            return true;
//        }else{
//            System.out.println("no");
//            return false;
//        }
//
//    }

//    //    /   multipli by 10
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
//
    static int[] posandneg(int arr[]){
        int possum=0;
        int negsum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                possum=possum+arr[i];
            }
        else{
                negsum=negsum+arr[i];
            }
        }
        int ans[]={possum,negsum};
        return ans;
    }


    public static void main(String[] args) {

//    int arr[]={10,20,30,40,50};
//    boolean ans=target(arr,50);
//        System.out.println(ans);
//

        int arr[]={10,20,-34,-67,-90,67,9,0,67};
        int ans[]=posandneg(arr);
        System.out.println(" positive sum : "+ ans[0]);
        System.out.println(" negitive sum : "+ ans[1]);


    }
}
