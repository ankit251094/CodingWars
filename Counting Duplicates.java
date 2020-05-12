import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
      // Write your code here
    
      int count=0; 
    
      
      
     int l=text.length(); int index=0; String s1=""; char [] c= new
    char [text.length()] ; for (int i=0;i <text.length();i++) {
    c[i]=text.toLowerCase().charAt(index++);
    
    System.out.println("Character at c["+i+"] is"+c[i]);
      
      }
      
      System.out.println("Character array is "+Arrays.toString(c));
      
      int charSize=c.length; int index2=1;
      
      HashMap h =new HashMap();
      for (int i=0;i<charSize;i++)
      {
        for(int j=i+1;j<charSize;j++)
        {
          if (c[i]==c[j])
          {
            count++;
            //s1=s1+c[j];
            
            h.put(c[j],count);
          }
        }
      }
     
      
      System.out.println(h);
     
    int hsize= h.size();
    
    return hsize;
    }