import java.util.Scanner;
class Marks {
    public int getMarks(String subject) {
        Scanner sc = new Scanner(System.in);
        int marks;
        while (true) {
            System.out.println("Enter the " + subject + " marks (out of 100)");
            marks = sc.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid marks");
            }
        }
        return marks;
    }
}
public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Marks m = new Marks();
        int maths = m.getMarks("Maths");
        int physics = m.getMarks("Physics");;
        int chemistry = m.getMarks("Chemistry");;
        int english = m.getMarks("English");;
        int hindi = m.getMarks("Hindi");;

        int total = maths + physics + chemistry + english + hindi;
        float percentage = total/5.0f;
        System.out.println("Your Total Number is "+total);
        System.out.println("Your Average percentage is "+percentage);
        if(total>=450){
            System.out.println("Grade A+");
        }
        else if(total>=400){
            System.out.println("Grade A");
        }
        else if(total>=350){
            System.out.println("Grade B+");
        }
        else if(total>=300){
            System.out.println("Grade B");
        }
        else if(total>=250){
            System.out.println("Grade C+");
        }
        else if(total>=200){
            System.out.println("Grade C");

        }else if(total>=150){
            System.out.println("Grade D+");
        }
        else {
            System.out.println("Fail");
        }
    }
}