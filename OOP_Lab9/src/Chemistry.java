
public abstract class Chemistry extends Course implements CourseOperation {

    public Chemistry(String courseName, String courseClass) {
        super(courseName, courseClass);
    }

    @Override
    String getClassroom() {
        return "Chemistry Class";
    }

    @Override
    String getName() {
        return "Chemistry Course";
    }

    @Override
    public void writtenPresentation() {
        System.out.println("Chemistry Written Presentation");
    }

    @Override
    public void oralPresentation() {
        System.out.println("Chemistry Oral Presentation");
    }

    @Override
    public void capitalizeName(String courseName) {
        super.capitalizeName(courseName);
    }
}
