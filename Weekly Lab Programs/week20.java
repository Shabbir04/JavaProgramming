import java.util.*;  
class Week20{  
 public static void main(String args[]){  
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Shabbir");  
  al.add("Basha");  
  al.add("Shaik");   
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  