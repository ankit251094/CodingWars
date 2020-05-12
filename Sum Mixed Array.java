import java.util.ArrayList;
import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  */
  public int sum(List<?> mixed) {
    
    int sum=0;
    
    for(int i=0;i<mixed.size();i++)
      
    {
      //int x=Integer.valueOf(mixed.get(i));
      if(mixed.get(i) instanceof String)
      {
        String s=(String) mixed.get(i);
        int x=Integer.parseInt(s);
        sum=sum+x;
        //mixed.remove(i);
      }
      else if(mixed.get(i)instanceof Integer)
      {
        //System.out.println(mixed.get(i)instanceof Integer);
        int y=(Integer)mixed.get(i);
        sum=sum+y;
      }
      
    }
    
    System.out.println("Total is:"+sum);
    
    return sum;
  }
  
  public static void main(String args[])
  {
    ArrayList al= new ArrayList();
    al.add(5);
    //al.add(3);
    //al.add("3");
    al.add("5");
    
    MixedSum m=new MixedSum();
    int total=m.sum(al);
    System.out.println("Total is:"+total);
  }
}