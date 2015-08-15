class Fib{
     static int n1=0,n2=1,n3,k=5;
     public static void main(String []args){
       System.out.print(n1+" "+n2+" ");
        fib(k-2);
     }
    public static void fib(int a){
            if(a>0){
                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.print(n3+" ");
                fib(a-1);
                
            }
        }
}