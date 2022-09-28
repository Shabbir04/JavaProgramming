import java.util.*;  
class Week21 {
    public static void main(String args[])
    {
        TreeSet<String> set = new TreeSet<>();
        set.add("Shabbir");
        set.add("Basha");
        set.add("Shaik");
        Iterator value = set.iterator();
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}