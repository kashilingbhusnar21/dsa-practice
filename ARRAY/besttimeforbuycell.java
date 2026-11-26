package ARRAY;

public class besttimeforbuycell {
    public static void main(String[] args) {

        int arr[]={1,4,6,77,8,9,8,7,6,5,5,5,5,5};
        int n=arr.length;

        if(arr == null || n ==0){
            return ;
        }

        //min profitt
        int min=arr[0];
        int profit =0;

        for(int i =0;i<n;i++){

            //current profit
            int currentprofit=arr[i]-min;

            profit=Math.max(profit,currentprofit);

            min=Math.min(arr[i],min);
        }
        System.out.println(" profit "+ profit );

    }
}