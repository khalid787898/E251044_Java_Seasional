
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr. Rahman");
        Teacher teacher = new Teacher("Ms. Karim");
        Engineer eng = new Engineer("Engr. Hasan");

        System.out.println("Doctor:");
        doc.displayInfo();
        doc.work();

        System.out.println("\nTeacher:");
        teacher.displayInfo();
        teacher.work();

        System.out.println("\nEngineer:");
        eng.displayInfo();
        eng.work();
    }
}
class Person {
    String name;

    Person() {
        this.name = "Unknown";
    }

    Person(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
    }
}
class Doctor extends Person {
    Doctor(String name) {
        super(name);
    }

    void work() {
        System.out.println("I treat patients.");
    }
}

class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }

    void work() {
        System.out.println("I teach students.");
    }
}

class Engineer extends Person {
    Engineer(String name) {
        super(name);
    }

    void work() {
        System.out.println("I develop software and systems.");
    }
}
