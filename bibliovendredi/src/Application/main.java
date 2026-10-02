package Application;
import bibliotheque.Exemplaire;
import bibliotheque.Ouvrage;
import bibliotheque.bibliotheque;

public class main {
	public static void main(String [] args) {
		System.out.println("Lancement ...");
		bibliotheque toutePetite = new bibliotheque(3);
		bibliotheque uneAutre = new bibliotheque(3);
		
		Ouvrage o1 = toutePetite.ajouteOuvrage("Titre1","Auteur1","Editeur",2026,"ISBN1");
		o1.ajouteExemplaire();
		toutePetite.ajouteOuvrage("Titre2","Auteur2","Editeur2",2026,"ISBN2");
		uneAutre.ajouteOuvrage("Titre3", "Auteur3", "Editeur3", 2024, "ISBN3");
		
		
		
		System.out.println(toutePetite);
		System.out.println(uneAutre);
		
	}
	

}

