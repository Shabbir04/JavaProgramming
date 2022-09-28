import java.util.*;
class Week22 {  
    public static void main(String args[]){  
          TreeSet <String> obj = new TreeSet<String>();  
  obj.add("B");   
  obj.add("b");  
  obj.add("A");  
  obj.add("a");  
 System.out.println("TreeSet: " +obj);  
    }  
}   
class comp implements Comparator<String>{  
    public int compare(String s1, String s2) {  
        return s1.compareTo(s2);  
    }   
}  