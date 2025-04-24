/**
 *
The following are the ways to finding n raised to the power m.
 Example 1: Let n = 2 and m = 0, n
m = 2^0 = 1 
 Example 2: Let n = 2 and m = 3, n
m = 2^3 = 8
 Example 3: Let n = 2 and m = -3, n
m = 2^(-3) = 0.125

A class poweris declared with the following details:

 Class Name : poweris

Data Members/ Instance variable :
n : (integer) to store a number
m : (integer) to store power value
p : (double) to store n raise to the power m

Member functions/ methods :

poweris() : a constructor to assign 0 to n, m ,p.

double power (int n, int m): to find and return n raise to the power m using 
above conditions given in the examples. Use
recursive technique to find n^m. 

void findresult() : to accept n, m and using recursive function find nm
and store the calculated power into p. 

void printresult() : using suitable documentation print value stored in p.

Specify the class poweris by giving details of constructor and all the functions. Write a main function 
to print the value of n^m.
 */
import java.util.*;
public class poweris
{
    int n,m;
    double p;
    poweris()
    {
        n=0;
        m=0;
        p=0.0;
    }
    double power (int n, int m)
    {
      if(m==0)
      {
          return 1;
      }
      else if(m>0)
      {
          return n*power(n,m-1);
      }
      else
         return (1/n)*power(n,m+1);
    }
    void findresult()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n & m: ");
        n=sc.nextInt();
        m=sc.nextInt();
        p=power(n,m);
    }
    void printresult()
    {
        findresult();
        System.out.println("The answer for n^m is "+p);
    }
    public static void main(String args[])
    {
        poweris obj = new poweris();
        obj.printresult();
    }
    
}
