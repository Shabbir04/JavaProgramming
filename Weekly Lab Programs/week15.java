import java.util.LinkedList;
class Week15{
public static void main(String[] args)
{
LinkedList<String> languages=new LinkedList<>();
languages.add("Java");
languages.add("Python");
languages.add(2,"JavaScript");
languages.addLast("Sql");

LinkedList<String> mammals = new LinkedList<>();

mammals.add("Dog");
mammals.add("Cat");
mammals.add("Horse");
LinkedList<String> animals = new LinkedList<>();
animals.add("Crocodile");
animals.addAll(mammals);


System.out.println("Languages : " + languages);
System.out.println("Mammals: " + mammals);
System.out.println("Animals: " + animals);

}
}