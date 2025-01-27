public abstract class Person {
    public abstract void displayInfo();
}

class Student extends Person {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Grade: " + grade);
    }
}

class Teacher extends Person {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher Name: " + name + ", Subject: " + subject);
    }
}

public class Problem10 {
    public static void main(String[] args) {
        Person student = new Student("Alice", 10);
        Person teacher = new Teacher("Mr. Smith", "Mathematics");

        student.displayInfo();
        teacher.displayInfo();
    }
}