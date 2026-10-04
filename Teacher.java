public class Teacher extends Student {

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }
}