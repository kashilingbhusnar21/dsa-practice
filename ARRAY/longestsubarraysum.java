package ARRAY;
//longest suarraysum =k
public class longestsubarraysum {

    public static void main(String[] args) {

        int arr[]={1,3,4,5,67,7};
        int n=arr.length;
        int k=9;
  int count=0;
  for(int i=0;i<n;i++){
      int sum=0;


      for(int j=i;j<n;j++){
          sum+=arr[j];

          if(sum == k){
              count++;
          }
      }
  }
        System.out.println(count);

    }
}
