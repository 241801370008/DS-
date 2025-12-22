class student{
    String name;
    int age;
void getName(){
System.out.println(name);
}
void getAge(){
    System.out.println(age);
}
}
class Main {
    public static void main(String[] args) {
        
        //user define data types
        student obj=new student();
        obj.name="prasad";
        obj.age=19;
        
        System.out.println(obj.name);
        System.out.println(obj.age);
        obj.getName();
        obj.getAge();
    }
}


