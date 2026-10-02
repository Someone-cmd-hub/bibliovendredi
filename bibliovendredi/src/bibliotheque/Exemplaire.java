package bibliotheque;

public class Exemplaire {
	//attributs
	private boolean empruntable = true; //par défaut, empruntable
	private boolean enLigne = false;
	private String cote;

	protected Exemplaire(String cote) {
		super();
		this.cote = cote;
	}

	public boolean isEmpruntable() {
		return empruntable;
	}

	public void setEmpruntable(boolean empruntable) {
		this.empruntable = empruntable;
	}

	public boolean isEnLigne() {
		return enLigne;
	}

	public void setEnLigne(boolean enLigne) {
		this.enLigne = enLigne;
	}

	public String getCote() {
		return cote;
	}

	@Override
	public String toString() {
		return cote;
	}
	
	
}
