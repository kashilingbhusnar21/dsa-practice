package ARRAY;

public class gcd {
    public static void main(String[] args) {

      //check is it primenmber or not

        int n=89;



      for(int num =2;num<n;num++) {
          Boolean isPrime = true;

          for (int i = 2; i <= num; i++) {
              if (num % 2 == 0) {
                  isPrime = false;
                  break;
              }
          }

          if (isPrime) {
              System.out.println(num + " the number is prime ");
          }
      }
    }
}
