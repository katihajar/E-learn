package plateform;

public class Message {
	private String contenu;
	private String expediteur;
	private String destinataire;
	public Message(String contenu, String expediteur, String destinataire) {
		super();
		this.contenu = contenu;
		this.expediteur = expediteur;
		this.destinataire = destinataire;
	}
	public Message(String contenu, String destinataire) {
		super();
		this.contenu = contenu;
		this.destinataire = destinataire;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public String getExpediteur() {
		return expediteur;
	}
	public void setExpediteur(String expediteur) {
		this.expediteur = expediteur;
	}
	public String getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}
	
	
}
