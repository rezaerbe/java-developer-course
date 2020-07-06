package OperationsAndPriorities;

public class Operations {

/* 0 ()
 * 1 (--,++ before)
 * 2 ^
 * 3 * and /
 * 4 + and -
 * 5 =
 * 6 (--,++ after)
 */

    public static void main(String[] args) {

        // ++n=n++ --> n=n+1
        // --n=n-- --> n=n-1

        int n1 = 5;
        int n2 = 10;
        int n3 = 4;
        int sum = (n1+n2)*n3-3;

        System.out.println("Sum: " + sum);
    }
    
}