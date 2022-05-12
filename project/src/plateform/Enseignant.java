package plateform;

public abstract class Enseignant extends User {
	public abstract Cours newcourse();
	public abstract void NotifyStudent();
	public void lancementCreationCours() {
		Cours crs = newcourse();
		crs.creationCours();
	}
	public void lancementCreationExamQcm() {
		ExamFactory examFactory = new QcmFactory();
		Exam qcdm= examFactory.createExam();
		qcdm.create();

	}
	public void lancementCreationExamInput() {
		ExamFactory examFactory = new InputExamFactory();
		Exam inputExm= examFactory.createExam();
		inputExm.create();

	}

	
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Enseignant(Mediateur mediateur, String nom) {
		super(mediateur, nom);
		// TODO Auto-generated constructor stub
	}


	public void envoyer(Message m) {
		System.out.println("------------");
		System.out.println("Envoie Message ");
		mediateur.TransmettreMsg(m);
	}

	
	public void recevoir(Message m) {
		System.out.println("------------");
		System.out.println("message recu ");
		
	}

}
