package com.codewars.a.partridge;
import java.util.ArrayList;
import java.util.Collections;

public class DoubleSort {
    public static Object[] dbSort(Object[] a){
        
        ArrayList integers=new ArrayList();
    ArrayList Strings =new ArrayList();
    
    for(int i=0;i<a.length;i++)
    {
      if(a[i] instanceof String)
      {
        Strings.add(a[i]);
        Collections.sort(Strings);
      }
      
      else if(a[i] instanceof Integer)
      {
        integers.add(a[i]);
        Collections.sort(integers);
      }
        
    }
    ArrayList finalal=new ArrayList();
    for(int j=0;j<integers.size();j++)
    {
      finalal.add(integers.get(j));
    }
    
    for(int j=0;j<Strings.size();j++)
    {
      finalal.add(Strings.get(j));
    }
    
    Object[] o1=new Object[finalal.size()];
    for(int k=0;k<finalal.size();k++)
    {
      o1[k]=finalal.get(k);
    }
    
    System.out.println("Int "+integers);
    System.out.println("Strings:"+Strings);
    System.out.println("Final arraylist is:"+finalal);
    for(int l=0;l<o1.length;l++)
    {
    System.out.println(o1[l]);
    }
        return o1;
    }
}