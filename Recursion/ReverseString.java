/*
A class Revstr defines a recursive function to reverse a string and check whether it is palindrome. 
 The details of the class are given below:
Class Name : revstr
Data Members/ Instance variable :
str : to store string.
Revst : stores the reverse string.
Member functions/ methods :
void getStr () : to accept the string.
void recReverse(int) : to reverse the string using recursive technique.
void check() : to display the original string, its reverse and to 
check whether the string is Palindrome or not.
Specify the class revstr by giving details of the functions void getStr( ), void recReverse (int) and void 
check( ).The main function need not to be written.
 */
import java.util.*;
public class revstr
{
    String str,Revstr;
    revstr()
    {
        str="";
        Revstr="";
    }
    void getStr()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter String: ");
        str=sc.next();
    } 
    void recReverse(int v)
    {
       if (v < str.length())
          {
            char ch = str.charAt(v);
            Revstr=ch+Revstr;
            recReverse(v+1);
          }
    }
    void check()
    {
        System.out.println("Word: "+str);
        recReverse(0);
        if(str.equals(Revstr))
        System.out.println("The given word is Palindrome");
    }
}
