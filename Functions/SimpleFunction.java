package Functions;

public class SimpleFunction {

    float sum(float n1, float n2) {
        float sum = n1+n2;
        return sum;
    }

    void Draw() {
        for (int i=0;i<10;i++) {
            System.out.println("*");
            for (int j=i;j>=0;j--) {
                System.out.print("-");
            }
        }
    }

    public static void main(String[] args) {
        
        float r = new SimpleFunction().sum(9,9);
        System.out.println("Sum: "+ r);

        r = new SimpleFunction().sum(9,12);
        System.out.println("Sum: "+ r);

        new SimpleFunction().Draw();
        new SimpleFunction().Draw();

    }
    
}