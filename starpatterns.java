
import java.util.*;

public class starpatterns {
    public static void main(String[] args) {

//        int n = 5;
//        pattern1(n);
//        pattern2(6);
        //pattern4(4);
        //pattern5(4);
        pattern6(8);
    }

    static void pattern1(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = n; col >= 1; col--) {
                System.out.print(" * ");
            }
            System.out.println(" ");

        }

    }

    static void pattern2(int n) {

        for (int row = 0; row <= n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }

    static void pattern3(int n) {

        for (int row = 1; row <= n; row++) {

//            for(int i=1;i<=n-row;i++){
//                System.out.print(" ");
//            }

            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern4(int n) {

        for (int row = 1; row <= n; row++) {

//            for(int i=1;i<=n-row;i++){
//                System.out.print(" ");
//            }

            for (int col = 1; col <= n-row+1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }

    static void pattern5(int n) {

        for (int row = 1; row <= n * 2 - 1; row++) {

//            for(int i=1;i<=n-row;i++){
//                System.out.print(" ");
//            }

            int totalrow = row;
            if (row > n) {
                totalrow = 2 * n - row;
            }

            for (int col = 1; col <= totalrow; col++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
        static void pattern6(int n) {

            for (int row = 1; row <=n; row++) {

            for(int i=1;i<=2*row-1;i++){
                System.out.print(" ");
            }



                for (int col = 1; col <=2*row-1; col++) {

                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }


