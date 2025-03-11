package Chap7.constructor;

public class StudentEx {
    public static void main(String[] args) {
        Student student = new Student("name", "12345-123456", 1);

        System.out.println("name: " + student.name);
        System.out.println("ssn: " + student.ssn);
        System.out.println("studentNo: " + student.studentNo);
    }
}
