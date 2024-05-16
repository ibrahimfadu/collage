class Human {
    public static void walk()
    {
        System.out.println("Human walking");
    }
}
class Boy extends Human{
    public static void walk(){
        System.out.println("Boy walks");
    }
    public static void main(String args[]){
        Human obj=new Boy();
        obj.walk();
        Human obj1=new Human();
        obj.walk();
    }
}