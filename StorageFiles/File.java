package StorageFiles;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class File {

    static Scanner reader = new Scanner(System.in);
    static Scanner reader1 = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("1 to write\n2 to read");
        int op = reader.nextInt();

        switch(op) {
            case 1:
                System.out.println("Enter to save to file: ");
                String text = reader1.nextLine();
                FileWriteOn(text);
                break;
            case 2:
                FileReaderOn();
                break;
        }

    }

    static void FileReaderOn() {

        try {
            FileReader fin = new FileReader("test.txt");
            int c;
            while((c=fin.read())!=-1) {
                System.out.print((char) c);
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void FileWriteOn(String str) {
        try {
            FileWriter fo = new FileWriter("test.txt");
            fo.write(str);
            fo.close();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}