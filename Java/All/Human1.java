class Human1{
    //Overridden Method
    public void walk()
    {
    System.out.println("Human walks");
    }
    }
    class Demo extends Human1{
    //Overriding Method
    public void walk(){
    System.out.println("Boy walks");
    }
    public static void main( String args[]) {
    /* Reference is of Human type and object is
    * Boy type
    */
    Human1 obj = new Demo();
    /* Reference is of HUman type and object is
    * of Human type.
    */
    Human1 obj2 = new Human1();
    obj.walk();
    obj2.walk();
    }
    }