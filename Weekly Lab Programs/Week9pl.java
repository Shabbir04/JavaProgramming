import java.io.FileOutputStream;    
public class Week9pl{    
public static void main(String args[]){ 
try(FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/klu/Desktop/basha/myfile.txt")){      
String msg = "Welcome to javaTpoint!";      
byte byteArray[] = msg.getBytes();      
fileOutputStream.write(byteArray);  
System.out.println("Message in file ");      
}catch(Exception exception){  
       System.out.println(exception);  
}      
}      
}