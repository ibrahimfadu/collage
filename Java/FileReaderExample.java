import java.io.FileInputStream; 
public class FileReaderExample
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("/home/ibrahim/Desktop/khaleel.txt");
//(check the file path given)
int i=0;
while((i=fin.read())!=-1)
{
System.out.print((char)i);
}
fin.close();
}catch(Exception e){System.out.println(e);}
}
}