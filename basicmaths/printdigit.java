package basicmaths;

public class printdigit {


    static void printdigit(int arr[] ){

        int n=arr.length;

        int max=arr[0];


        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }

        int secondmax=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>secondmax && arr[i]<max){
                secondmax=arr[i];
            }
        }
        if(secondmax==Integer.MIN_VALUE){
            System.out.println("des not exists");
        }
        else{
            System.out.println("secondmax ; "+ secondmax);
        }



    }

    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6};
       printdigit(arr);

    }
}
