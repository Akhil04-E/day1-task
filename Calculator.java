package day1;
import java.util.Scanner;

public class Calculator {

    public static double add(double a,double b){
        return a+b;

    }
    public static double sub(double a , double b){
        return (a-b);
    }
    public static double product(double a,double b){
        return (a*b);
    }
    public static double division(double a,double b){
        if(b==0){
            return Double.NaN ;
        }
        return (a/b);

    }
//    public void reminder(int a,int b){
//        System.out.println(a%b);
//    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String next="";
        double result=0;
        do{
        System.out.println("Enter 1st number..: ");
        double a = ob.nextDouble();
        System.out.println("choose the symbol +, - , * , / ");
        char choice = ob.next().charAt(0);
        System.out.println("Enter 2nd number..: ");
        double b = ob.nextDouble();
       result=0;


            switch (choice) {
                case '+':
                    result = add(a, b);
                    break;
                case '-':
                    result = sub(a, b);
                    break;
                case '*':
                    result = product(a, b);
                    break;
                case '/':
                    result = division(a, b);
                    break;
                default:
                    System.out.println("invalid opreator ");
                    break;

            }
            System.out.println(result);
            System.out.println("enter yes do you want continue or no");
         next  =ob.next();
        }while(next.equals("yes"));


        
    }
}
