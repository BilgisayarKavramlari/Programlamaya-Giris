public static void main(String[] args) {
        int i;
        Scanner scan=new Scanner(System.in);
        i=scan.nextInt();
        int fib[]=new int[i];
        fib[0]=1;
        fib[1]=1;
        //1 1 2 3 5 8 13 21 34
         System.out.println(" 1 \n 1");
        for(int k=0;k<(i-2);k++)
        {
            fib[k+2]=fib[k+1]+fib[k];
            System.out.println(" "+fib[k+2]);
        }
    }
