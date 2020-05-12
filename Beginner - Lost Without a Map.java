import java.util.Scanner;

public class Maps {

   public static int[] map(int[] arr) {
     
     for(int i=0;i<arr.length;i++)
     {
      // System.out.println("arr["+i+"] is:"+arr[i]);
       
       arr[i]=arr[i]+arr[i];
       
       //System.out.println("New values"+arr[i]);
     }
     
     
     return arr;

    }
   
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of array:");
     int size=sc.nextInt();
     int [] arr =new int[size];
     for(int i=0;i<arr.length;i++)
     {
      arr[i]=sc.nextInt();
     }
     int [] newarr =new int[size];
     Maps m=new Maps();
     newarr=m.map(arr);
     for(int i=0;i<arr.length;i++)
     {
       System.out.println("New Array is:"+newarr[i]);
     }
   }
}