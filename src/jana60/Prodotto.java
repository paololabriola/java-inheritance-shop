package jana60;

import java.text.DecimalFormat;

public class Prodotto {

	private int codiceProdotto, ivaProdotto = 20;
	private String nomeProdotto, marcaProdotto;
	private double prezzoProdotto;
	
	private DecimalFormat df = new DecimalFormat(".00?");

	public Prodotto(int codiceProdotto, String nomeProdotto, String marcaProdotto, double prezzoProdotto) {
		
		super();
		this.codiceProdotto = codiceProdotto;
		this.nomeProdotto = nomeProdotto;
		this.marcaProdotto = marcaProdotto;
		this.prezzoProdotto = prezzoProdotto;
		
	}

	public int getIvaProdotto() {
		return ivaProdotto;
	}

	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

	public String getMarcaProdotto() {
		return marcaProdotto;
	}

	public void setMarcaProdotto(String marcaProdotto) {
		this.marcaProdotto = marcaProdotto;
	}

	public String getPrezzoProdotto() {
		return df.format(prezzoProdotto);
	}

	public void setPrezzoProdotto(double prezzoProdotto) {
		this.prezzoProdotto = prezzoProdotto;
	}

	public int getCodiceProdotto() {
		return codiceProdotto;
	}
	
	public String stampaPrezzoProdotto() {
		
		double prezzoFinale;
		
		prezzoFinale = prezzoProdotto + ((prezzoProdotto * ivaProdotto) / 100);
		
		return df.format(prezzoFinale);
		
	}
	
	@Override
	public String toString() {
		
		return "Codice prodotto: " + codiceProdotto + "\nNome prodotto: " + nomeProdotto + "\nMarca prodotto: " + marcaProdotto + "\nPrezzo finale: " + stampaPrezzoProdotto(); 
	
	}
	
}
