package ARRAY;

public class besttimeforbuycell {
    public static void main(String[] args) {

       int arr[]={1,3,4,5,6,2,9};

       int n= arr.length;

       int min=arr[0];

       int profit=0;

       for(int i=0;i<n;i++) {

           int currentprofit = arr[i] - min;

           profit = Math.max(profit, currentprofit);

           min = Math.min(arr[i], min);

       }System.out.println(" the current profit is "+ profit);

    }
}
