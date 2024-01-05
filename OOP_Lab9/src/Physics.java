
public abstract class Physics extends Course implements CourseOperation {

    public Physics(String courseName, String courseClass) {
        super(courseName, courseClass);
    }

    @Override
    String getClassroom() {
        return "Physics Class";
    }

    @Override
    String getName() {
        return "Physics Course";
    }

    @Override
    public void writtenPresentation() {
        System.out.println("Physics Written Presentation");
    }

    @Override
    public void oralPresentation() {
        System.out.println("Physics Oral Presentation");
    }

    @Override
    public void capitalizeName(String courseName) {
        super.capitalizeName(courseName);
    }
}
