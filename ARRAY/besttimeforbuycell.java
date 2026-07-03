package ARRAY;

public class besttimeforbuycell {
    public static void main(String[] args) {

        int arr[]={1,5,6,7,89,9};
        int n=arr.length;
        //take a min price
        int min=arr[0];
        //profit =0
        int profit=0;

        for(int i=0;i<n;i++){

            //current profit if buy stock
            int currentprofit=arr[i]-min;

            profit=Math.max(profit,currentprofit);

            min=Math.min(arr[i],min);
        }
        System.out.println(" maximum profit is "+ profit);

    }
}
