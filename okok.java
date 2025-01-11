
import java.util.Scanner;

public class okok {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        // int a=10,b=30,c=5;
        System.out.println("Select the input: ");
        System.out.println("1. QSP ");
        System.out.println("2.JSP");
        int a=sc.nextInt();
        // System.out.println("Enter the 2nd number: ");
        // int b=sc.nextInt();
        // System.out.println("Enter the 3rd number: ");
        // int c=sc.nextInt();

        // if(a>b&&a>c){
        //     System.out.println("A is greater");
        // }
        // else if(b>c){
        //     System.out.println("B is greater");

        // }
        // else{
        //     System.out.println("C is greater");
        // }
        switch(a)
        {
           case 1:
                System.out.println("JAVA");
                System.out.println("SQL");
                System.out.println("Manual Testing");
                System.out.println("selenium");
                break;
           case 2:
                System.out.println("tukey");
                System.out.println("surya");
                System.out.println("nagraj");
                System.out.println("nandini");
                break;
        //         System.out.println("E is vowels");
        //         break;
        //    case 'I':
        //         System.out.println("I is vowels");
        //         break;
        //    case 'O':
        //         System.out.println("O is vowels");
        //         break;
        //    case 'U':
        //         System.out.println("U is vowels");
        //         break;

        //     default:
        //         System.out.println(a+"This is a constant");



        }
        
    }
    
}
