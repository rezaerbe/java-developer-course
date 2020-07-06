package LoopControl;

public class Simple_If {
    
    public static void main(String[] args) {

        for(int i=1;i<100;i++){
            if(i % 4 == 0){
                System.out.println("Mode by 4 is: " + i);
            }
        }
    }
}