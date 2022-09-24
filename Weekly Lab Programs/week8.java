import java.io.IOException;
import java.io.*;
import java.io.FileWriter;
import java.util.*;

class Week8
{ public static void main(String args[])

	{
		String path=System.getProperty("user.dir")+"/myfile.txt";
		String text="Added Text";
	try {FileWriter fw=new FileWriter(path,true);
		fw.write(text);
		fw.close();
	System.out.println("Successfully Written");
	}
	catch(IOException e)
	{
	System.out.println(e);
	}
}
}