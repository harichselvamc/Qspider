class onesidetriangle{
    public static void main(String[]args){
        int n=5;
       for(int rows=1;rows<=n;rows++){
            for(int space=1;space<=rows-1;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=n-(rows-1);star++){
                System.out.print("*");
            }
            System.out.println();
       }
        System.out.print("End");
    }
   
}