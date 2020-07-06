package ObjectOrientedProgramming;

public class Generic {

    public static void main(String[] args) {

        String[] a1 = {"alex", "dan", "john"};
        Integer[] a2 = {1,2,3,4,5};
        Double[] a3 = {1.2, 3.4, 5.6, 7.8}; 
        print(a1);
        print(a2);
        print(a3);
        
    }

    static <T>void print(T[] ar) {
        for (T s: ar) {
            System.out.println(s);
        }
    }
    
}