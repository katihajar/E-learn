package plateform;

public class InputExamFactory implements ExamFactory {
    public Exam createExam() {
        this.NotifyStudent();
        return new InputExam();
    }

    @Override
    public void NotifyStudent() {

    }
}
