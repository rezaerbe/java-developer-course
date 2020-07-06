package LoopControl;

public class While {

    public static void main(String[] args) {
        
        int i = 100;

        do{
            if (i % 4 == 0) {
                System.out.println("Mode by 4 is: " + i);
            }

            i++;
        } while (i<100);
            System.out.println("App is done");
    }
}