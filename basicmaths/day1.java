package basicmaths;
import java.util.Scanner;
public class day1{
    public static void main(String[]args) {


        Scanner sc=new Scanner(System.in);
        System.out.println(" enter your number ");
        int n=sc.nextInt();

        //count the all print numbers prime

        for(int num=2;num<=n;num++){

            Boolean isPrime=true;

            for(int i=2;i<num;i++){
                if(num % i ==0 ){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num + " ");
            }
        }

    }
}
