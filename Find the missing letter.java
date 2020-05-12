import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Kata {
  public static char findMissingLetter(char[] array)
    {
    
    ArrayList al1=new ArrayList();
    ArrayList al2=new ArrayList();
    ArrayList al3=new ArrayList();
    HashMap h=new HashMap();
    for(int i=0;i<array.length;i++)
    {
      al1.add(array[i]);
      System.out.println(" Char are:- "+array[i]);
      System.out.println("no:-"+(int)array[i]);
    }
    char [] alphabet=new char[26];
    
    int first=(int)array[0];
    for(int i=0;i<26;i++)
    {
      if(65 <=first  && first<=90)
      {
        alphabet[i]=(char)('A'+i);
        al2.add(alphabet[i]);
      }
      else
      {
        alphabet[i]=(char)('a'+i);
        al2.add(alphabet[i]);
      }
      
      System.out.println("Alph"+alphabet[i]);
    }
    
    
    //char c2=(char) ;
    
    System.out.println("char:"+al1.get(0));
    int index=al2.indexOf(al1.get(0));
    
    System.out.println("Index:"+index);
    System.out.println("ArrayList1 Size:"+al1.size());
    for(int i=index;i<=index+al1.size();i++)
    {
      //h.put(i,al2.get(i));
      al3.add(al2.get(i));
    }
    
    System.out.println("Arraylist3 is"+al3);
    System.out.println("ArrayList2 is"+al1);
    
    al3.removeAll(al1);
    
    char c1=(char)al3.get(0);
    
    //System.out.println(c1);
      return c1;
    }
  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the String:");
    String str=sc.nextLine();
    int size=str.length();
    char[] array=new char[size];
    for(int i=0;i<size;i++)
    {
      array[i]=str.charAt(i);
    }
    Kata k=new Kata();
    char missing=k.findMissingLetter(array);
    System.out.println("Missing char is :"+missing);
    
  }
}