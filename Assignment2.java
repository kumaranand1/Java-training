//create a java program that will find the largest of three numbers
import java.io.*;

class Assignment2 {
	public static void main(String[] args)
    {
        
int a = 5,b = 7,c = 6,largest;
System.out.println(" the first number:" + a); 
System.out.println(" the second number:" + b);  
  
System.out.println(" the third number:" + c);  
  
largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  
System.out.println("The largest number is: "+largest); 
    }

}
