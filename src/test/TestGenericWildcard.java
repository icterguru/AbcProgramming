package test;

import java.util.*;
public class TestGenericWildcard {
   
   public static void printList(List<?> lst) {  // accept List of Objects only, 
                                                     // not List of subclasses of object
      for (Object o : lst) 
    	  System.out.println(o);
   }
   
   public static void main(String[] args) {
      List<Object> objLst = new ArrayList<Object>();
      objLst.add(new Integer(55));
      printList(objLst);   // matches
   
      List<String> setLst = new ArrayList<String>();
      setLst.add(new String("55.000"));
      printList(setLst);   // matches
   
      List<String> strLst = new ArrayList<String>();
      strLst.add("one");
      printList(strLst);  // compilation error
   }
}