import java.util.Scanner;

public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    // Your code here!
    String s1="";
    /*
     * for(int i=0;i<10;i++) { int count=0; numbers[i]= count++; s1= s1+numbers[i];
     * }
     */
    for(int i=0;i<numbers.length;i++)
    {
      s1=s1+numbers[i];
       if (s1.length()==3)
       {
         s1="("+s1+") ";
       }
    }
    
    //s1=s1+"0";
    int l1=s1.length();
    String sub1= s1.substring(0, l1-4);
    String sub2=s1.substring(l1-4, l1);
    //System.out.println("The string is"+s1);
    System.out.println("Substring 1 is "+ sub1);
    System.out.println("Substring 2 is"+ sub2);
    String s2=sub1+"-"+sub2;
    System.out.println("Substring 2 is"+s2);
    return s2;
  }
  
  
  
  public static void main(String args[])
  {
    Kata k =new Kata();
    Scanner sc = new Scanner(System.in);
    System.out.print("Size of the array is");
    int size=sc.nextInt();
    int [] a=new int[size];
    int count=1;
    for(int i=0;i<size;i++)
    {
      a[i]=count++;
      //System.out.println(a[i]);
    }
   
    k.createPhoneNumber(a);
  }
}