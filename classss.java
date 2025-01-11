class classss{

    public static void main(String[]args){
        // int a=10;
        // int b=20;
        // int res=(a>b)?a:b;
        // System.out.println("The Largest number is "+res);
        int num=10;
        // String res=(a==0)?"Neither even nor odd":(a>0)?"POS":"NEG";
        // System.out.println(res);
        String res=(num>100)?"Invalid":(num>=90)?"A":(num>=70)?"B":(num>=60)?"C":(num>=40)?"d":(num<40)?"fail":'pass';
    }
}