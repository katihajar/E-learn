package plateform;

public class EnseignantImpl extends Enseignant{

    public Cours newcourse() {
        this.NotifyStudent();
        return new CoursImpl();
    }

    @Override
    public void NotifyStudent() {

    }
}
