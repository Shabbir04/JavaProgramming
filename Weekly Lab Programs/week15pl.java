import java.util.LinkedList;
class Week15pl
{
public static void main(String[] args)
{
LinkedList<String>languages = new LinkedList<>();
languages.add("java");
languages.add("python");
languages.add("javascript");
languages.add("kotlin");
languages.add("sql");
String str= languages.remove(3);
System.out.println("Removed Element:"+str);
System.out.println("Languages:"+languages);
languages.clear();
System.out.println("Languages:"+languages);
}
}

