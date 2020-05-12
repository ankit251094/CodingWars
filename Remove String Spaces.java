import java.util.Scanner;

public class Kata {

   static String noSpace(final String x) {
     
      String output=x.replaceAll("\\s", "");
     
      return output;
      }
   
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the string with spaces in them:");
     String str=sc.nextLine();
     Kata k=new Kata();
     String result=k.noSpace(str);
     System.out.println("Final String is:"+result);
     
   }
}