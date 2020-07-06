package Variables;
/*
 * by Reza RB
 * app get user info from console
 */

public class InputArgs {

    public static void main(String[] args) {

        // this take user name from input
        String name = args[0];
        // get provider
        String provider = args[1];
        System.out.println("Name: " + name);
        System.out.println("Provider: " + provider);
        
    }
}