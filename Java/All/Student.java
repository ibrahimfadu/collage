 class Student {
    private String name;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
}
class Test{
    public static void main (String args[]){
        Student s=new Student();
        s.setname("Vijay");
        System.out.println(s.getname());
    }
}