import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner; 

class week7 {
	public static void main(String[] args)
	{
		try {
			FileWriter fw= new FileWriter("myfile.txt");
			fw.write("Files in Java are seriously good!!");
			fw.close();
			System.out.println("Successfully written.");
 			
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
     
     
    