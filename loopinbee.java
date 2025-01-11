import java.util.Scanner;

public class loopinbee {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)throws Exception{
        // System.out.println("program start");

        // if(false){
        //     System.out.println("trichy");
        // }
        // System.out.println("Okokokok");

        // if(true){
        //     System.out.println("True executed");
        // }

        // System.out.println("Select the input ");
        // System.out.println("1:Idly");
        // System.out.println("2:Briyani ");
        // System.out.println("3:Dosa ");
        

        // System.out.println("enter your option: ");
        // int useroption=sc.nextInt();
        // Thread.sleep(1000);
        // System.out.println("Processing.........");

        // if (useroption==1){
            
        //     System.out.println("30rs");
        // }
        // if (useroption==2){
            
     
        //     System.out.println("280rs");
        // }
        // if (useroption==3){
            
     
        //     System.out.println("80rs");
        // }

        // System.out.println("enter the otp: ");
        // int useroption=sc.nextInt();
        // Thread.sleep(1000);
        // System.out.println("Processing.........");

        // if (useroption==98324){
            
        //     System.out.println("Success");
        // }else{
        //     System.out.println("failed");
        // }
        // System.out.println("Enter the Number: ");
        // int userinput=sc.nextInt();

        // if(userinput>0){
        //     System.out.println("positive number");
        // }else{
        //     System.out.println("Negative number");
        // }
        // System.out.println("Enter the Number: ");
        // int userinput=sc.nextInt();

        // if(userinput%2==0){
        //     System.out.println("even number");
        // }else{
        //     System.out.println("odd number");
        // }
        System.out.println("Enter the Number: ");
        char num=sc.next().charAt(0);
        // System.out.println("Enter the 2nd Number: ");
        // int secondinput=sc.nextInt();
    

        // if(num%2==0){
        //     System.out.println(num+" is Even number");
        //     if(num>10){
        //         System.out.println("java");
        //     }else{
        //         System.out.println("SQL");
        //     }
            
        // }else{
        //     System.out.println(num+" is odd number");
        //     if(num>10){
        //         System.out.println("HTML");
        //     }else{
        //         System.out.println("css");
        //     }
            
        // }
        if(Character.isDigit(num)){
            System.out.println("digit");
        }else if (Character.isUpperCase(num)) {
            System.out.println("Upper case");
        }else if(Character.isLowerCase(num)){
            System.out.println("Lower case");
        }



    }
    
}
