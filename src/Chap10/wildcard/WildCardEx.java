package Chap10.wildcard;

import java.util.Arrays;

public class WildCardEx {
    public static void printCourse(Course<?> course) {
        System.out.println(course.getName()+" : "+ Arrays.toString(course.getStudents()));
    }
    public static void printStudent(Course<? extends Student> course) {
        System.out.println(course.getName()+" : "+ Arrays.toString(course.getStudents()));
    }
    public static void printWorkerCourse(Course<? super Worker> course) {
        System.out.println(course.getName()+" : "+ Arrays.toString(course.getStudents()));
    }
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인과정", 4);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Person("직장인"));
        personCourse.add(new Person("학생"));
        personCourse.add(new Person("고등학생"));

        Course<HightStudent> hightStudentCourse = new Course<>("고등학생 과정", 4);
        hightStudentCourse.add(new HightStudent("고딩1"));

        Course<Student> studentCourse = new Course<>("학생과정", 4);
        studentCourse.add(new Student("학생1"));
        studentCourse.add(new Student("학생1"));

        Course<Worker> workerCourse = new Course<>("직장인과정", 4);
        workerCourse.add(new Worker("직딩"));

        printCourse(personCourse);
        printCourse(workerCourse);
        printCourse(studentCourse);
        printCourse(hightStudentCourse);

        printStudent(studentCourse);
        printStudent(hightStudentCourse);

        printWorkerCourse(personCourse);
        printWorkerCourse(workerCourse);
    }
}
