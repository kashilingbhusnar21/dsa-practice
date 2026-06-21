package ARRAY;


public class takinginput {
   /* print dighit
    static int printdighit(int num){


        int dighit=0;
        while(num!=0){
            dighit=num%10;
            System.out.println(dighit);
            num=num/10;
        }
        return dighit;
    }

    static boolean countdighit(int num){
        int orignalnum=num;
        int rev=0;

        while(num!=0){
            int dighit=num%10;
            rev=rev*10+dighit;

            num=num/10;
        }
        //return rev;
        if(rev==orignalnum){
            System.out.println("yes ");
            return true;
        }else{
            System.out.println("no");
            return false;
            }



    }*/

    static boolean primeornot(int num) {

        if(num<=1){
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
                //  System.out.println("prime");
            }
        }
       // System.out.println("prime");
        return true;


    }

    public static void main(String[] args) {
        int num = 29;

        for (int i = 1; i <= num; i++) {

            if (primeornot(i)) {
                System.out.println(i);
            }
        }
    }
}

