package Functions;

public class LocalGlobal {

    // global
    static double pi = 3.14;

    float sum(float n1, float n2) {
        double newPi = pi*4;
        // local
        float sum = n1+n2;
        System.out.println(newPi);
        return sum;
    }
    public static void main(String[] args) {

        double newPi = pi*4;
        System.out.println(newPi);

        float r = new LocalGlobal().sum(9,9);
        System.out.println("Sum: " + r);

        int sum = 0;
        for (int i=0;i<10;i++) {
            // local
            sum = i;
        }
        System.out.println(sum);
        
    }
    
}