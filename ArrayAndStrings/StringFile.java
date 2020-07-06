package ArrayAndStrings;

public class StringFile {
    
    public static void main(String[] args) {
        
        String name = "Reza RB";

        System.out.println("Length: " + name.length());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Last char: " + name.charAt(name.length()-1));
        
        System.out.println("Print char: " );
        for (int i=0;i<name.length();i++) {
            System.out.print(name.charAt(i));
        }

        System.out.println("");

        System.out.println("Print char reverse: ");
        for (int i=name.length()-1;i>=0;i--) {
            System.out.print(name.charAt(i));
        }

        System.out.println("");
        
        System.out.println("Print words: ");
        String text = "He go to home in the morning";
        String[] splitData = text.split(" ");
        for (int j=0;j<splitData.length;j++) {
            System.out.println(splitData[j]);
        }
    }
}