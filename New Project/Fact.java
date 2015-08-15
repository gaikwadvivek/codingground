public class Fact{
    public static void main(String args[]){
        int n=Integer.parseInt(args[0]);
        int m=fact(n);
        System.out.print("Factorial of "+n+" is"+m);
    }
    public static int fact(int a){
        int result;
        if(a==1){
            return 1;
        }
        result= a*fact(a-1);
        return result;
    }
}