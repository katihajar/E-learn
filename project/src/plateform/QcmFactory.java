package plateform;

public class QcmFactory implements ExamFactory {
    public Exam createExam() {
        this.NotifyStudent();
        return new Qcm();
    }

    @Override
    public void NotifyStudent() {

    }

}
