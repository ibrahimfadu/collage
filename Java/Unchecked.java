class Unchecked {
// Main driver method
public static void main(String args[])
{
// Here we are dividing by 0
// which will not be caught at compile time
// as there is no mistake but caught at runtime
// because it is mathematically incorrect
try
{
int x = 0;
int y
= 10;
int z = y / x;
System.out.println(z);
}
catch(ArithmeticException e)
{
System.out.println(e);
}} }