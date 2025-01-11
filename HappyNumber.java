public class HappyNumber {
    public static void main(String[] args) {
        int number=20;
        int original=number;
        int sum=0;

        while(number!=1){
            while(number>0){
                int digit=number%10;
                sum=sum+(digit*digit);
                number=number/10;
            }
            number=sum;
            if(number==original){
                System.out.println("its not a happy number");
                return;
            }
           
        }
        System.out.println("Happy number");
    }
}
