package plateform;

import java.util.Date;

public abstract class Cours {
	Long idCours;
	String libelle;
	String description;
	Date dateCreation;
	public abstract void creationCours();


	public String getDescription() {
	return description;
}
	public void setDescription(String description) {
	this.description = description;
}

	public Long getIdCours() {
		return idCours;
	}

	public void setIdCours(Long idCours) {
		this.idCours = idCours;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


}
