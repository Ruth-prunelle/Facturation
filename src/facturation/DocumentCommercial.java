package facturation;

public abstract class DocumentCommercial {
	private String numero;
	private Client client;
	private Detail detail;
	
	public double getTotal() {
		double tot = detail.ligne.getPrixTotal();
		return tot;
	}
	public double getTotal() {
			
		}
}
