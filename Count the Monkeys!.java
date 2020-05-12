public class MonkeyCounter
{
  public static int[] monkeyCount(final int n){
  
    int[] monkeyCount=new int[n];
  
      for(int i=0;i<n;i++)
      {
        monkeyCount[i]=i+1;
      }
      
      return monkeyCount;
  }
}