package plateform;

public class Student extends User {

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(Mediateur mediateur, String nom) {
		super(mediateur, nom);
		// TODO Auto-generated constructor stub
	}


	public void envoyer(Message m) {
		System.out.println("Envoie Message ");
		mediateur.TransmettreMsg(m);
	}

	
	public void recevoir(Message m) {
		System.out.println("message recu ");
		
	}

}
