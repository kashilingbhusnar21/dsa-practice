package basicmaths;

public class day1{
    public static void main(String[]args) {

// int num=5;

        int num = 15;
        int rev=0;

      while(num>0){

          int digit=num%10;
          rev=(rev*10)+digit;

          num=num/10;


      }
        System.out.println(rev);
    }

}
