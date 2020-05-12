public class Solution {

    public static String[] stringToArray(String s) {
      //your code;
      
      String [] sarr=s.split("\\s");
      
      for(String s1:sarr)
      {
        System.out.println(s1);
      }
    
      return sarr;
    }

}