class xylemphloem{
    public static void main(String[] args) {
        int num=1224;
        System.out.println("Given Input value "+num);
        int last=num%10;//To separate the last digit
        System.out.println("Last Digit "+last);
        num=num/10;//we filtered the last so we are going to remove the last digit from the input
        System.out.println("Before Loop input value "+num);
        int sum=0;
        while(num>9){
            sum=sum+(num%10);
            num=num/10;
        }

        System.out.println("The First digit of the given input is "+num);
        System.out.println("The Last digit of the given input is "+last);

        int firstandlast=num+last;
        System.out.println("The Sum of the 1st and last digit is "+firstandlast);
        System.out.println("The Sum of the digit between 1st and last is "+sum);
        if(sum==firstandlast){
            System.out.println("Its Xylem");
        }else{
            System.out.println("Its Phloem");
        }


    }
}