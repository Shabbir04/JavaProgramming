import java.util.ArrayList;
import java.util.ListIterator;
class Week13 {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);

 
    ListIterator<String> iterate = languages.listIterator();
    System.out.println("Iterating over ArrayList:");
    while(iterate.hasNext()) {
      System.out.print(iterate.next() + ", ");}

	System.out.println("\n");


    System.out.println("Iterating over ArrayList using for loop: ");
    for(int i = 0; i < languages.size(); i++) {
      System.out.print(languages.get(i));
      System.out.print(", ");
    }
  }
}