class shop{
    public static void main(String[]args){
        String person_name="raju";
        double initialamoun=10000;
        int count=3;
        double price=2000;
        double billing=count*price;
        System.out.println(person_name+" going to buy "+count+" pair of shoes "+price+" per each total is "+(count*price) +" The Balance is "+(initialamoun-billing));
    } 
}