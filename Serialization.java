import java.io.*;

class StudentInfo implements Serializable {
    private int id;
    private String name;
    private String department;
    private String college;

    public StudentInfo(int id, String name, String department, String college) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getCollege() {
        return college;
    }
}

public class Serialization {
    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo(1, "Reshma", "CSE", "SVECW, Bhimavaram");
        StudentInfo student2 = new StudentInfo(2, "Kavya", "IT", "SVECW, Bhimavaram");
        
        try (FileOutputStream fileOut = new FileOutputStream("JavaObject.txt");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(student1);
            objectOut.writeObject(student2);
            System.out.println("StudentInfo object serialized and saved to JavaObject.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
