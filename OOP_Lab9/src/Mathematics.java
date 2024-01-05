
public abstract class Mathematics extends Course implements CourseOperation {

    public Mathematics(String courseName, String courseClass) {
        super(courseName, courseClass);
    }

    @Override
    String getClassroom() {
        return "Mathematics Class";
    }

    @Override
    String getName() {
        return "Mathematics Course";
    }

    @Override
    public void writtenPresentation() {
        System.out.println("Mathematics Written Presentation");
    }

    @Override
    public void oralPresentation() {
        System.out.println("Mathematics Oral Presentation");
    }

    @Override
    public void capitalizeName(String courseName) {
        super.capitalizeName(courseName);
    }
}
