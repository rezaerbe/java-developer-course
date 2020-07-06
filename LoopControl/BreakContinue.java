package LoopControl;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i=1;i<100;i++){

            if (i % 4 == 0){
                continue;
            }

            System.out.println(i);

            if (i == 50) {
                System.out.println("Count: " + i);
                System.out.println("Count is printed");
                break;
            }
        }
        
    }
    
}