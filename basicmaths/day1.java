package basicmaths;

public class day1{
    public static void main(String[]args) {


       //find the largest three numbers
        int a=10;
        int b=80;
        int c=34;

        int largest;

        if(a>b & a>c ){
            largest=a;
        }
        else if( b> c){
            largest=b;
        }
        else{
            largest=c;
        }

        System.out.println(largest);
    }


}
