public class Instructor
extends Pessoa {
    public int age;
    public Instructor(String fullName,int age) {
        super(fullName);
        this.age=age;
    }
    
    public void print() {
           super.print();
           System.out.println("Age of instructor is: "+age);
    }
}
