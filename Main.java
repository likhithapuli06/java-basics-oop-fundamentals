public class Main {

    public static void main(String[] args) {

        System.out.println("===== JAVA BASICS =====");
        BasicPrograms.run();

        System.out.println("\n===== STUDENT OBJECT =====");

        Student student = new Student("Rahul", 20);
        student.displayDetails();
        student.displayRole();

        System.out.println("\n===== ENCAPSULATION =====");

        student.setName("Arjun");
        student.setAge(21);

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());

        System.out.println("\n===== INHERITANCE =====");

        GraduateStudent graduateStudent =
                new GraduateStudent("Priya", 22, "Computer Science");

        graduateStudent.displayDetails();

        System.out.println("\n===== POLYMORPHISM =====");

        Student person1 = new Student("Rahul", 20);
        Student person2 = new GraduateStudent(
                "Priya", 22, "Computer Science");
        Student person3 = new Teacher("Mr. Kumar", 35);

        person1.displayRole();
        person2.displayRole();
        person3.displayRole();
    }
}