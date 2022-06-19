import java.util.*;
class Division {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[]args){
        try{
            System.out.println("Enter a no ");
            int a=scan.nextInt();
            System.out.println("Enter another no ");
            int b=scan.nextInt();
            int ans=a/b;
            System.out.println(ans);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }    
}
