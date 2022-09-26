import java.util.*;  
class Week19pl{  
 public static void main(String args[]){  
    HashSet<String> set=new HashSet<>();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");    
           System.out.println("HashSet : "+set);
	   set.remove("One");    
           set.remove("Two");    
           set.remove("Three");   
	   System.out.println("HashSet : "+set);
 }  
}  