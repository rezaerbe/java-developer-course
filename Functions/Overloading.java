package Functions;

public class Overloading {

    float Sub(float n1, float n2) {
        float r = n1-n2;

        return r;
    }

    float Sub(float n1, float n2, float n3) {
        float r = n1-n2-n3;
        
        return r;
    }

    public static void main(String[] args) {
        
        float s1 = new Overloading().Sub(10,5);
        System.out.println("S1: " + s1);

        float s2 = new Overloading().Sub(10,5,2);
        System.out.println("S2: " + s2);
    }
    
}