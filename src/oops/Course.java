//Course Registration System
//
//courseId, courseName, instructor, publishedDate, price, courseDuration
//
//showCourseDetails()


package oops;

public class Course {

    int c_id;
    String courseName;
    String instructor;
    String publishDate;
    Double price;
    String Duration;

    public Course(int c_id, String courseName, String instructor, String publishDate, Double price, String Duration) {
        this.c_id = c_id;
        this.courseName = courseName;
        this.instructor = instructor;
        this.publishDate = publishDate;
        this.price = price;
        this.Duration = Duration;

    }


    public Course() {

    }

    public String showCourseDetails(int c_id) {
       if (this.c_id==c_id)return courseName + "" +instructor +""+ publishDate + "" +price+""+Duration +"";
       else return "not found";


    }
}

