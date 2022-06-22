package facturation;

import java.util.*;

public class Detail {
	
	
	public ArrayList<Ligne> ligne = new ArrayList<Ligne>();
	
	public class Ligne {
	private double numero;
	private double quantite;
	private Produit produit;
	public double total;
	
	public double getPrixTotal() {
		double total = quantite *produit.getPrix();
		return total; 
	}
	
}
	
	
	
}
