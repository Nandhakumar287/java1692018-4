import java.io.*;
import java.util.*;
  public class CountSpecialChar{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Any String");
      String in=sc.nextLine();
      System.out.println("Number Of Numberic Char In your String is:");
      int count=0,i;
      for(i=0;i<in.length();i++)
      {
        if(in.charAt(i)=='!'||in.charAt(i)=='@'||in.charAt(i)=='#'||in.charAt(i)=='$'||in.charAt(i)=='%'||in.charAt(i)=='^'||in.charAt(i)=='&'||in.charAt(i)=='*')
        {
          count++;
        }
      }
      System.out.println(count);
     }
   }
