package basicmaths;

public class day1{
    public static void main(String[]args) {

//
//       //find the largest three numbers
//        int a=10;
//        int b=80;
//        int c=34;
//
//        int largest;
//
//        if(a>b & a>c ){
//            largest=a;
//        }
//        else if( b> c){
//            largest=b;
//        }
//        else{
//            largest=c;
//        }
//
//        System.out.println(largest);


//        //find the leap year given year is 2024
//
        int year=2024;
///        if(
        if((year % 4 == 0 &&  year %100 != 0) || (year % 400 == 0)){
            System.out.println(year+ " this is leap year ");

        }else {
            System.out.println(" not ");
        }

        int units=250;
        double bill=0;

        if(units <=100){
            bill=100*5;
        }else if(units <=200){
            bill=(100*5)+ ((units-100 ) *7);

        }else{
            bill=(100*5)+(100*7)+ ((units-200)* 10);
        }
        System.out.println(" bill "+ bill);

    }


}
