import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kata {
  public static int[] sortArray(int[] array) {
      ArrayList<Integer> arrlistodd = new ArrayList<Integer>(array.length);
      ArrayList<Integer> index2 = new ArrayList<Integer>(array.length);
      Map <Integer,Integer>h=new HashMap<Integer,Integer>();
    int[] arrlisteven=new int[array.length];
    int [] index1=new int[array.length];
    int[] arr =new int[array.length];
    int count=0;
    for(int i=0;i<array.length;i++)
     {
      if (array[i]%2==1)
      {
        index2.add(i);
        arrlistodd.add(array[i]); 
      }
      arrlistodd.sort(Integer::compareTo);
     }
    for (int i = 0; i < index2.size(); i++) {
            array[index2.get(i)] = arrlistodd.get(i);  
        }
      return array;
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
     Kata k=new Kata();
     int[] finalarr=new int[arr.length];
     finalarr=k.sortArray(arr);
  }
}