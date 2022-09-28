import java.util.*;  
class Week24{  
 public static void main(String args[]){  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Shaik");    
      map.put(101,"Shabbir");    
      map.put(102,"Basha");            
      for(Map.Entry m:map.entrySet()){  
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}  