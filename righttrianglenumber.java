class righttrianglenumber {
    public static void main(String[] args) {
        int n=5;
        int value=1;
        for(int rows=1;rows<=n;rows++){
            for(int columns=1;columns<=n-(rows-1);columns++){
                System.out.print(value++);
            }
            value=1;
           System.out.println();
        }
    }
}
