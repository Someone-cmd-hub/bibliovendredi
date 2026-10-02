package bibliotheque;

public class bibliotheque {
	//attributs, privés
		private int nbOuvrages = 0; //initialisation par défaut
		private int nbOuvragesMax; //dépend de la biblio
		private Ouvrage [] ouvrages; // Null ici, on ne connait pas sa taille
		
		public bibliotheque(int nbOuvragesMax) {
			System.out.println("Nouvelle bibliotheque " + nbOuvragesMax);
			this.ouvrages = ouvrages;
			this.ouvrages = new Ouvrage[nbOuvragesMax]; //instancation
		}
		
		//ajout de deux getter

		public int getNbOuvrages() {
			return nbOuvrages;
		}

		public Ouvrage[] getOuvrages() {
			return ouvrages;
		}

		private void ajouteOuvrage(Ouvrage o) {
			ouvrages[nbOuvrages] = o;
			nbOuvrages++;
			
		}

		public void ajouteOuvrage(String titre, String auteurs, String editeur, int annee, String isbn) {
			Ouvrage nouveau = new Ouvrage(titre,auteurs,editeur,annee,isbn);
			ajouteOuvrage(nouveau);
		}
		
		
}
