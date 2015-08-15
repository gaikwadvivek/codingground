class Factorial{
    public static void main(String args[]){
        int n=10,k=1;
        for(int i=n;i>=1;i--){
            k=k*i;
        }
        System.out.print("Factorial of"+n+" is "+k);
    }
}