import java.util.ArrayList;

class Course {

    // Private data members (Encapsulation)
    private String code;
    private String name;
    private int credits;

    // Constructor
    public Course(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    // Setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Display Course Details
    public void displayCourse() {
        System.out.println("Course Code : " + code);
        System.out.println("Course Name : " + name);
        System.out.println("Credits     : " + credits);
        System.out.println("-------------------------");
    }
}

class CourseRegistrationSystem {

    private ArrayList<Course> courses = new ArrayList<>();

    // Add Course
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println(course.getName() + " added successfully.");
    }

    // Remove Course using Course Code
    public void removeCourse(String code) {
        boolean found = false;

        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCode().equalsIgnoreCase(code)) {
                System.out.println(courses.get(i).getName() + " removed successfully.");
                courses.remove(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Course not found.");
        }
    }

    // Display All Courses
    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        System.out.println("\nAvailable Courses:");
        System.out.println("-------------------------");
        for (Course course : courses) {
            course.displayCourse();
        }
    }

    // Find Course by Code
    public void findCourse(String code) {
        boolean found = false;

        for (Course course : courses) {
            if (course.getCode().equalsIgnoreCase(code)) {
                System.out.println("\nCourse Found:");
                course.displayCourse();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Course not found.");
        }
    }

    // Calculate Total Credits
    public void calculateTotalCredits() {
        int total = 0;

        for (Course course : courses) {
            total += course.getCredits();
        }

        System.out.println("Total Credits = " + total);
    }
}

public class course_credits {

    public static void main(String[] args) {

        CourseRegistrationSystem crs = new CourseRegistrationSystem();

        // Creating Course Objects
        Course c1 = new Course("CS101", "Java Programming", 4);
        Course c2 = new Course("CS102", "Python Programming", 3);
        Course c3 = new Course("CS103", "Cyber Security", 5);

        // Add Courses
        crs.addCourse(c1);
        crs.addCourse(c2);
        crs.addCourse(c3);

        // Display Courses
        crs.displayCourses();

        // Find Course
        crs.findCourse("CS102");

        // Calculate Total Credits
        crs.calculateTotalCredits();

        // Remove Course
        crs.removeCourse("CS101");

        // Display Courses Again
        crs.displayCourses();

        // Calculate Total Credits Again
        crs.calculateTotalCredits();
    }
}