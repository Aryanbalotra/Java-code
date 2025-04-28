// Course class
class Course {
    // private: Restricts access to within the class. We don't want to allow external classes to directly modify the course name or code.
    private String courseName;
    private String courseCode;

    // public: Provides a public setter method to allow controlled access to the course name.
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // public: Provides a public setter method to allow controlled access to the course code.
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    // public: Getter methods are public so they can be accessed from other classes.
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    // Constructor to initialize the course details
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
}

// Student class
class Student {
    // private: We use private for data members to follow the encapsulation principle.
    // This ensures that these fields are only accessed and modified through methods, giving better control and validation.
    private String studentName;
    private int studentId;
    private Course course; // Association with the Course class.

    // Constructor to initialize the Student object with details using a parameterized constructor.
    public Student(String studentName, int studentId, Course course) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.course = course;
    }

    // public: Getter method for student name.
    public String getStudentName() {
        return studentName;
    }

    // public: Getter method for student ID.
    public int getStudentId() {
        return studentId;
    }

    // public: Getter method for the course associated with the student.
    public Course getCourse() {
        return course;
    }

    // public: Method to display student details.
    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating a Course object using a parameterized constructor.
        Course course1 = new Course("Introduction to Java", "CS101");

        // Creating a Student object using a parameterized constructor.
        Student student1 = new Student("Aryan Balotra", 202211, course1);

        // Displaying student details
        student1.displayStudentDetails();
    }
}
