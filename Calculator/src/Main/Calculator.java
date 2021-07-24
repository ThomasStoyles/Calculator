package Main;
import java.util.*;
import java.util.Scanner;


/**
 *
 * @author Thomas
 */


public class Calculator {

public static void main(String[] args)
{
System.out.println("Enter First and Second number :");
Scanner inp = new Scanner(System.in);
int num1,num2;
num1 = inp.nextInt();
num2 = inp.nextInt();

System.out.println("Enter your selection: 1 for Addition, 2 for substraction, 3 for Multiplication, 4 for division and 5 for your first number to time by pie: ");

int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(add( num1,num2));
            break;
        case 2:
            System.out.println(sub( num1,num2));
            break;      
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
        case 5:
            System.out.println(pie(num1));
            break;
            
            default:
                System.out.println("Illigal Operation");

                
                
    }
        
        
}
 

    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }
    public static int pie(int x)
    {
        int result = (int) (x*3.14159265359);
        return result;
    }
    
}
