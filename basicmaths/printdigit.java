package basicmaths;

public class printdigit {


    static void printdigit(int num ){

        while(num>0){
            //extract last digit

           int  digit=num%10;
            System.out.println(digit);
            //removing the last digit
            num=num/10;
        }
    }

    public static void main(String[] args) {

        printdigit(12345);

    }
}
