import java.util.*;
class Week18 {
    public static void main(String args[])
    {
        Vector<String> vec_tor = new Vector<String>();
        vec_tor.add("Shabbir");
        vec_tor.add("Basha");
        vec_tor.add("10");
        vec_tor.add("20");
        System.out.println("Vector: " + vec_tor);
        String rem_ele = vec_tor.remove(2);
	Boolean rem1 = vec_tor.remove("20");
        System.out.println("Removed element: " + rem_ele);
	System.out.println("Removed element: " + rem1);
        System.out.println("Final Vector: " + vec_tor);
    }
}