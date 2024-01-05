
public abstract class Course implements CourseOperation {

    protected String courseName;
    protected String courseClass;

    public Course(String courseName, String courseClass) {
        this.courseName = courseName;
        this.courseClass = courseClass;
    }

    public void capitalizeName(String courseName) {
        System.out.println(courseName.toUpperCase());
    }

    abstract String getName();

    abstract String getClassroom();
}
