//Write the content into the file
import java.io.FileWriter;
public class WriteFileExample
{
public static void main(String
args[])
{
try 
{
try (FileWriter fw = new FileWriter("/home/ibrahim/Desktop/khaleel.txt")) {
    fw.write("Welcome to Java Programming class");
}
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Success...");
}
}