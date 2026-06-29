package ARRAY;

public class subbaray {
    public static void main(String[] args) {

        int arr[]={1,2,3,1,2,1,1,1,1,0,2};
        int k=6;
        int maxlen=0;
      //  int sum=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;

                for(int m=i;m<=j;m++){
                    sum+=arr[m];
                }
                if(sum == k){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        System.out.println(maxlen);
    }

}
