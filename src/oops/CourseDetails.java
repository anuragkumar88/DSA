package oops;

import java.sql.SQLOutput;

public class CourseDetails {
    public static void main(String[] args) {
        System.out.println("course 1");
        Course course1= new Course(1,"Java","Ansal Pandey","2 JUlY",130000000000.00,"6 month");
        System.out.println(course1.c_id);
        System.out.println(course1.courseName);
        System.out.println(course1.instructor);
        System.out.println(course1.publishDate);
        System.out.println(course1.price);
        System.out.println(course1.Duration);

        System.out.println("course 2");
        Course course2= new Course(2,"Oops","Ankit","2 JUlY",10000000.00," 2month");
        System.out.println(course2.c_id);
        System.out.println(course2.courseName);
        System.out.println(course2.instructor);
        System.out.println(course2.publishDate);
        System.out.println(course2.price);
        System.out.println(course2.Duration);

        System.out.println("course 3");
        Course course3= new Course(3,"maths","Anurag","3 feb",1500000.00,"6 month");
        System.out.println(course3.c_id);
        System.out.println(course3.courseName);
        System.out.println(course3.instructor);
        System.out.println(course3.publishDate);
        System.out.println(course3.price);
        System.out.println(course3.Duration);

        System.out.println("course 4");
        Course course4= new Course(4,"physics","Aman","25 JUlY",1500000.00,"9month");
        System.out.println(course4.c_id);
        System.out.println(course4.courseName);
        System.out.println(course4.instructor);
        System.out.println(course4.publishDate);
        System.out.println(course4.price);
        System.out.println(course4.Duration);

        System.out.println("course 5");
        Course course5= new Course(5,"Chemistry","Krishna","5 JUlY",15000.00,"7 month");
        System.out.println(course5.c_id);
        System.out.println(course5.courseName);
        System.out.println(course5.instructor);
        System.out.println(course5.publishDate);
        System.out.println(course5.price);
        System.out.println(course5.Duration);

        System.out.println("course 6");
        Course course6= new Course(6,"English","Mr","2 JUNE",15000.00,"6 month");
        System.out.println(course6.c_id);
        System.out.println(course6.courseName);
        System.out.println(course6.instructor);
        System.out.println(course6.publishDate);
        System.out.println(course6.price);
        System.out.println(course6.Duration);

        System.out.println("course 7");
        Course course7= new Course(7,"Hindi","Vinod","20 JUlY",15078.00,"5 month");
        System.out.println(course7.c_id);
        System.out.println(course7.courseName);
        System.out.println(course7.instructor);
        System.out.println(course7.publishDate);
        System.out.println(course7.price);
        System.out.println(course7.Duration);

        System.out.println("course 8");
        Course course8= new Course(8,"Web","Aryan Sinha","12 JUlY",15099.00,"7 month");
        System.out.println(course8.c_id);
        System.out.println(course8.courseName);
        System.out.println(course8.instructor);
        System.out.println(course8.publishDate);
        System.out.println(course8.price);
        System.out.println(course8.Duration);

        System.out.println("course 9");
        Course course9= new Course(9,"Bangali","Anuj Bose","2 Jan",1450.00,"1 month");
        System.out.println(course9.c_id);
        System.out.println(course9.courseName);
        System.out.println(course9.instructor);
        System.out.println(course9.publishDate);
        System.out.println(course9.price);
        System.out.println(course9.Duration);

        System.out.println("course 10");
        Course course10= new Course(10,"Bihari","Manjolika","6 March",199999.00,"7 month");
        System.out.println(course10.c_id);
        System.out.println(course10.courseName);
        System.out.println(course10.instructor);
        System.out.println(course10.publishDate);
        System.out.println(course10.price);
        System.out.println(course10.Duration);

        System.out.println(course3.showCourseDetails(3));
    }






}
