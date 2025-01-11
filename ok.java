
import java.util.Scanner;

public class ok {
    static Scanner cv=new Scanner(System.in);
    public static void main(String[] args) {
        // System.out.print("Enter the number: ");
        // int num=cv.nextInt();
        // int num=10;
        // int count=1;
        // while(num>=count){
        //     System.out.println(num);
        //     num--;
        // }
        // System.out.println("Run..");
        // int count=1;
        // System.out.println(count++);
        // System.out.println(count);
        // while(count<10){
        //     // System.out.println("Ha");
        //     System.out.println(count);
        //     count++;
        // }

        // char count='A';
        // char end='Z';
        // int assi=65;
        // while(count<=end){
        //     System.out.println(count+" "+assi);
        //     count++;
        //     assi++;
        // }
   
        // while(count<=end){
        //     // count++;
        //     System.out.println(count);
        //     count++;
        
        // }
        int count=1;
        int end=10;
       
        // while(count<=end){
        //     if(count%2==0){
        //         System.out.println(count);
        //     }
        //     count++;
        
        // }
        // while(count<=end){
        //     if(count%2!=0){
        //         System.out.println(count);
        //     }
        //     count++;
        
        // }
    //     int num=135;
    //     int counts=0;
    //     int lastdigit=num%10;
        

    //     while(num!=0){
    //         num/=10;
    //         counts+=count;
    //         num=num/10;
    //    }
    //     System.out.println(counts);
        
        // int number=12345;
        // int reverse=0;

        // while(number!=0){
        //    int last=number%10;
        //    reverse=reverse*10+last;
        //    System.out.println(reverse);
        //    number=number/10;
           
        // }

        int num=1234;
        System.out.println("Actual Value "+num);
        int last=num%10;
        System.out.println("Last Value "+last);
        num=num/10;
        System.out.println("Loop actual Value "+num);
        int sum=0;
        while(num>9){
            sum=sum+(num%10);
            System.out.println("last value inside the loop "+sum);
            num=num/10;
            System.out.println("actual value inside the loop "+num);

        }
        int fandl=last+num;

        if (sum==fandl){
            System.out.println("Its Xylem");
        }else{
            System.out.println("its phloem");
        }

        

















        // char start='Z';
        // char end='A';
        // int assi=65;
        // while(start>=end){
        //     System.out.println(start);
        //     start--;
        // }
    }
    
}
