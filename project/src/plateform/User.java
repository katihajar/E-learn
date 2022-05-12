package plateform;

public abstract class User {

	protected Mediateur mediateur;
	protected String nom;
	public abstract void envoyer(Message m);
	public abstract void recevoir(Message m);
	public User(Mediateur mediateur, String nom) {
		super();
		this.mediateur = mediateur;
		this.nom = nom;
		mediateur.addColl(nom, this);
	}
	public void executeMonthlyView() {
		ViewEventCalendar strategy = new MonthlyView();
		strategy.SelectEvent();
	}
	public void executeDailyView() {
		ViewEventCalendar strategy = new DailyView();
		strategy.SelectEvent();
	}
	public void executeWeeklyView() {
		ViewEventCalendar strategy = new WeeklyView();
		strategy.SelectEvent();
	}
	public void executeAgendaView() {
		ViewEventCalendar strategy = new AgendaView();
		strategy.SelectEvent();
	}

	public User() {
		super();
	}
	public Mediateur getMediateur() {
		return mediateur;
	}
	public void setMediateur(Mediateur mediateur) {
		this.mediateur = mediateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
