package StorageFiles;

import java.util.Scanner;

public class Exceptions {

    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        
        try {
            int x = reader.nextInt();
            System.out.println(x);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Processed");
        }

        System.out.println("End file");
    }
}