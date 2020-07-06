package ObjectOrientedProgramming;

public class StudentMain {

    public static void main(String[] args) {

        Student st = new Student("Reza", Gender.Male);
        System.out.println("Name: " + st.FirstName);
        System.out.println("Gender: " + st.gender);
        
    }
    
}