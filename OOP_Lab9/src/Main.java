
public class Main {

    public static void main(String[] args) {

        Mathematics mathematics = new Mathematics("Mathematics", "9A") {
        };
        Physics physics = new Physics("Physics", "10B") {
        };
        Chemistry chemistry = new Chemistry("Chemistry", "11C") {
        };

        mathematics.capitalizeName(mathematics.courseName);
        System.out.println(mathematics.getName() + " - " + mathematics.getClassroom());
        mathematics.oralPresentation();
        mathematics.writtenPresentation();
        System.out.println();

        physics.capitalizeName(physics.courseName);
        System.out.println(physics.getName() + " - " + physics.getClassroom());
        physics.oralPresentation();
        physics.writtenPresentation();
        System.out.println();

        chemistry.capitalizeName(chemistry.courseName);
        System.out.println(chemistry.getName() + " - " + chemistry.getClassroom());
        chemistry.oralPresentation();
        chemistry.writtenPresentation();
    }
}
