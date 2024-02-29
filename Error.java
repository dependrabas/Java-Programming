public class Error {
    public static void main(String args[]){
int A[] = {10,20,30,40,50,60};
try{
    int C = (A[5]/A[4]);
    System.out.println("Division:"+C);
}
catch(ArithmeticException e){
System.out.println("Something went wrong"+e);
}
    }
}
