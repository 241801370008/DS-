
class student {
    String name;
    int age;


    student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {

        student value = new student("prasad", 12);
        System.out.println(value.name);
        System.out.println(value.age);
    }
}
