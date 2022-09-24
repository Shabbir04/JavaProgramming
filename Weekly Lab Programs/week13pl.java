import java.util.ArrayList;

class Week13pl {
  public static void main(String[] args) {

    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);


    System.out.println("Iterating over ArrayList using for-each loop:");
    for(String language : languages) {
      System.out.print(language);
      System.out.print(", ");
    }
  }
}