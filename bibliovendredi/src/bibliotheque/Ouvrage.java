package bibliotheque;

import java.util.Arrays;

public class Ouvrage {
	//attributs 
	private String titre;
	private String auteurs;
	private String editeur;
	private int annee;
	private String isbn;
	
	private static final int NB_EXEMPLAIRE_MAX = 50; 
	//static = la meme pour toutes les classes, final = non modifiables
	private int nbExemplaires = 0;
	private Exemplaire[] exemplaires = new Exemplaire[NB_EXEMPLAIRE_MAX]; 
	//la taille max est la meme pour tous les ouvrages
	
	//seul les classes du packages peuvent l'appeler
	protected Ouvrage(String titre, String auteurs, String editeur, int annee, String isbn) {
		this.titre = titre;
		this.auteurs = auteurs;
		this.editeur = editeur;
		this.annee = annee;
		this.isbn = isbn;
	}

	private void ajouteExemplaire(Exemplaire ex) {
		exemplaires[nbExemplaires] = ex;
		nbExemplaires++;
	
	
	if (nbExemplaires >= NB_EXEMPLAIRE_MAX) {
		System.err.println("NON");
		return;
	}}
	public void ajouteExemplaire(){
		ajouteExemplaire(new Exemplaire("COTE_" + (nbExemplaires + 1)));
	}

	@Override
	public String toString() {
		return "Ouvrage [titre=" + titre + ", exemplaires=" + Arrays.toString(exemplaires) + "]";
	}
	
}
