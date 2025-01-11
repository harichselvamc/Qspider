// class w1{
//     public static void main(String[]args){
//         //task1
//         long a=2878723l;
//         System.out.println(a);
//         float b=a;
//         System.out.println(b);
//         //task2
//         int c=12;
//         System.out.println(c);
//         double d=c;
//         System.out.println(d);
//         //task3
//         short e=12;
//         System.out.println(e);
//         int f=e;
//         System.out.println(f);
//         //task4
//         int g=21;
//         System.out.println(g);
//         long h=g;
//         System.out.println(h);
//         double i=h;
//         System.out.println(i);
       
//     }
// }
import java.util.Scanner;

public class StudentMarksPercentage {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
 
        System.out.print("Enter marks for subject 1: ");
        float subject1 = scanner.nextFloat();
        
        System.out.print("Enter marks for subject 2: ");
        float subject2 = scanner.nextFloat();
        
        System.out.print("Enter marks for subject 3: ");
        float subject3 = scanner.nextFloat();
        
        System.out.print("Enter marks for subject 4: ");
        float subject4 = scanner.nextFloat();
        
        System.out.print("Enter marks for subject 5: ");
        float subject5 = scanner.nextFloat();
        
  
        float totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        float percentage = (totalMarks / 500) * 100;
        

        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

    }
}
